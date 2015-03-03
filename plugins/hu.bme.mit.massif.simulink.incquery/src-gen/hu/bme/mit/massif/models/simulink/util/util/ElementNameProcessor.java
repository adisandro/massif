package hu.bme.mit.massif.models.simulink.util.util;

import hu.bme.mit.massif.models.simulink.util.ElementNameMatch;
import hu.bme.mit.massif.simulink.SimulinkElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.massif.models.simulink.util.elementName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ElementNameProcessor implements IMatchProcessor<ElementNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSE the value of pattern parameter SE in the currently processed match
   * @param pName the value of pattern parameter Name in the currently processed match
   * 
   */
  public abstract void process(final SimulinkElement pSE, final String pName);
  
  @Override
  public void process(final ElementNameMatch match) {
    process(match.getSE(), match.getName());
  }
}
