package hu.bme.mit.transima.simulink.api.adapter.port;

import hu.bme.mit.transima.Simulink.Block;
import hu.bme.mit.transima.Simulink.InPortBlock;
import hu.bme.mit.transima.Simulink.OutPortBlock;
import hu.bme.mit.transima.Simulink.Port;
import hu.bme.mit.transima.Simulink.PortBlock;
import hu.bme.mit.transima.simulink.api.Importer;
import hu.bme.mit.transima.simulink.communication.datatype.IVisitableMatlabData;

import java.util.Map;
import java.util.Set;

public interface IPortAdapter {

    public PortBlock connectToBlock(Port port, IVisitableMatlabData portHandle, Integer portNum,
            Set<InPortBlock> portBlockSet, Set<OutPortBlock> outPortBlockSet, Importer importerApi);

    public Port createPort(Block parent, IVisitableMatlabData currentPortHandle, Map<Double, ? extends Port> inPorts);

}
