package hu.bme.mit.transima.simulink.api.util.bus;

import static com.google.common.base.Preconditions.checkArgument;
import hu.bme.mit.transima.Simulink.Block;
import hu.bme.mit.transima.Simulink.InPort;
import hu.bme.mit.transima.Simulink.MultiConnection;
import hu.bme.mit.transima.Simulink.OutPort;
import hu.bme.mit.transima.Simulink.SimulinkElement;
import hu.bme.mit.transima.Simulink.SimulinkReference;
import hu.bme.mit.transima.Simulink.SingleConnection;
import hu.bme.mit.transima.models.simulink.util.FirstOutPortFromBusSpecificationMatcher;
import hu.bme.mit.transima.models.simulink.util.NextOutPortInPathMatcher;
import hu.bme.mit.transima.simulink.api.util.ISimulinkAPILogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.GenericPatternGroup;
import org.eclipse.incquery.runtime.api.IQueryGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * TODO: use logger!
 * 
 * 
 * @author Abel Hegedus
 * 
 */
public class BusSignalMapper {
    protected AdvancedIncQueryEngine iqe;
    protected NextOutPortInPathMatcher nextOutPortInPathMatcher;
    private FirstOutPortFromBusSpecificationMatcher firstOutPortFromBusSpecificationMatcher;
    private ISimulinkAPILogger logger;

    /**
     * Creates a mapper for bus signals in models contained by the given resource set.
     * 
     * @param busMappingResourceSet
     * @throws IllegalStateException
     *             if the provided resource set cannot be used for initializing an EMF-IncQuery engine
     */
    public BusSignalMapper(ResourceSet busMappingResourceSet) {
        checkArgument(busMappingResourceSet != null, "Resource set for bus mapping path finder cannot be null!");
        try {
            iqe = AdvancedIncQueryEngine.createUnmanagedEngine(busMappingResourceSet);
            IQueryGroup group = GenericPatternGroup.of(NextOutPortInPathMatcher.querySpecification(),
                    FirstOutPortFromBusSpecificationMatcher.querySpecification());
            group.prepare(iqe);

            nextOutPortInPathMatcher = NextOutPortInPathMatcher.on(iqe);
            firstOutPortFromBusSpecificationMatcher = FirstOutPortFromBusSpecificationMatcher.on(iqe);
        } catch (IncQueryException e) {
            throw new IllegalStateException("Could not initialize matcher for bus mapping path finder!", e);
        }
    }

    public AdvancedIncQueryEngine getEngine() {
        return iqe;
    }

    protected NextOutPortInPathMatcher getNextOutPortInPathMatcher() {
        return nextOutPortInPathMatcher;
    }

    protected FirstOutPortFromBusSpecificationMatcher getFirstOutPortFromBusSpecificationMatcher() {
        return firstOutPortFromBusSpecificationMatcher;
    }

    public OutPort getConnectedOutPort(InPort selectorInport) {
        SingleConnection connection = selectorInport.getConnection();
        OutPort previousOutPort = null;
        if (connection != null) {
            MultiConnection parent = connection.getParent();
            if (parent != null) {
                previousOutPort = parent.getFrom();
            } else {
                previousOutPort = connection.getFrom();
            }
        }
        return previousOutPort;
    }

    public String getCollisionFreeLineName(InPort inport) {
        Block creator = inport.getContainer();
        int portNumber = creator.getInports().indexOf(inport) + 1;
        String lineName = getNonEmptyLineName(inport, portNumber);
        boolean collision = checkForLineNameCollision(creator, portNumber, lineName);
        if (collision) {
            lineName = lineName + " (signal " + portNumber + ")";
        }
        return lineName;
    }

    public String getNonEmptyLineName(InPort inport, int portNumber) {
        String lineName = inport.getConnection().getLineName();
        if (lineName == null || lineName.startsWith("DERIVED_LINE_NAME")) { // FIXME change to nullOrEmpty
            lineName = "signal" + portNumber;
        }
        lineName = lineName.replace('.', ':').replace(',', ';');
        return lineName;
    }

    public boolean checkForLineNameCollision(Block creator, int portNumber, String lineName) {
        EList<InPort> inports = creator.getInports();
        for (int index = 0; index < inports.size(); index++) {
            int portNo = index + 1;
            if (portNo != portNumber) {
                InPort iP = inports.get(index);
                String otherName = getNonEmptyLineName(iP, portNo);
                if (otherName.equals(lineName)) {
                    // the real or derived name of an other incoming line is the same as the current line
                    return true;
                }
            }
        }
        return false;
    }

    public void logDebug(String formatMessage, Object... arguments) {
        if (logger != null) {
            String formattedMessage = String.format(formatMessage, arguments);
            logger.debug(formattedMessage);
        }
    }

    public boolean isDebugging() {
        return logger != null ? logger.isDebugging() : false;
    }

    public void setLogger(ISimulinkAPILogger logger) {
        this.logger = logger;
    }

    public String getFQNOrEmpty(SimulinkElement element) {
        String fqn = "NULL ELEMENT";
        if (element != null) {
            SimulinkReference ref = element.getSimulinkRef();
            if (ref == null) {
                fqn = String.format("NO REF(%s)", element);
            } else {
                fqn = ref.getFQN();
            }
        }
        return fqn;
    }
}