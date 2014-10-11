package hu.bme.mit.massif.simulink.api.adapter.port;

import hu.bme.mit.massif.communication.datatype.IVisitableMatlabData;
import hu.bme.mit.massif.simulink.Block;
import hu.bme.mit.massif.simulink.InPortBlock;
import hu.bme.mit.massif.simulink.OutPortBlock;
import hu.bme.mit.massif.simulink.Port;
import hu.bme.mit.massif.simulink.PortBlock;
import hu.bme.mit.massif.simulink.api.Importer;

import java.util.Map;
import java.util.Set;

public interface IPortAdapter {

    public PortBlock connectToBlock(Port port, IVisitableMatlabData portHandle, Integer portNum,
            Set<InPortBlock> portBlockSet, Set<OutPortBlock> outPortBlockSet, Importer importerApi);

    public Port createPort(Block parent, IVisitableMatlabData currentPortHandle, Map<Double, ? extends Port> inPorts);

}
