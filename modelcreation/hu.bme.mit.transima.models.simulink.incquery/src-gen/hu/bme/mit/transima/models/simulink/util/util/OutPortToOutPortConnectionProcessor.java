package hu.bme.mit.transima.models.simulink.util.util;

import hu.bme.mit.transima.Simulink.OutPort;
import hu.bme.mit.transima.models.simulink.util.OutPortToOutPortConnectionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.transima.models.simulink.util.outPortToOutPortConnection pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class OutPortToOutPortConnectionProcessor implements IMatchProcessor<OutPortToOutPortConnectionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSourceOutPort the value of pattern parameter sourceOutPort in the currently processed match
   * @param pTargetOutPort the value of pattern parameter targetOutPort in the currently processed match
   * 
   */
  public abstract void process(final OutPort pSourceOutPort, final OutPort pTargetOutPort);
  
  public void process(final OutPortToOutPortConnectionMatch match) {
    process(match.getSourceOutPort(), match.getTargetOutPort());
    
  }
}
