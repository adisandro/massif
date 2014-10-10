package hu.bme.mit.transima.models.simulink.viewer.util;

import hu.bme.mit.transima.Simulink.Block;
import hu.bme.mit.transima.Simulink.Port;
import hu.bme.mit.transima.models.simulink.viewer.HierarchyConnectionEndMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.transima.models.simulink.viewer.hierarchyConnectionEnd pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HierarchyConnectionEndProcessor implements IMatchProcessor<HierarchyConnectionEndMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPort the value of pattern parameter port in the currently processed match
   * @param pBlock the value of pattern parameter block in the currently processed match
   * 
   */
  public abstract void process(final Port pPort, final Block pBlock);
  
  public void process(final HierarchyConnectionEndMatch match) {
    process(match.getPort(), match.getBlock());
    
  }
}
