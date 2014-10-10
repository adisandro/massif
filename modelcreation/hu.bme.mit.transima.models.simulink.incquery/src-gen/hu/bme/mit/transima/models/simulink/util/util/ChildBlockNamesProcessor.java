package hu.bme.mit.transima.models.simulink.util.util;

import hu.bme.mit.transima.Simulink.SimulinkElement;
import hu.bme.mit.transima.models.simulink.util.ChildBlockNamesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.transima.models.simulink.util.childBlockNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChildBlockNamesProcessor implements IMatchProcessor<ChildBlockNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pElem the value of pattern parameter elem in the currently processed match
   * @param pChild the value of pattern parameter child in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final SimulinkElement pElem, final SimulinkElement pChild, final String pName);
  
  public void process(final ChildBlockNamesMatch match) {
    process(match.getElem(), match.getChild(), match.getName());
    
  }
}
