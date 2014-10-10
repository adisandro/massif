package hu.bme.mit.transima.models.simulink.validation;

import hu.bme.mit.transima.Simulink.SimulinkElement;
import hu.bme.mit.transima.models.simulink.validation.util.ClashingChildNamesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.transima.models.simulink.validation.clashingChildNames pattern,
 * to be used in conjunction with {@link ClashingChildNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClashingChildNamesMatcher
 * @see ClashingChildNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClashingChildNamesMatch extends BasePatternMatch {
  private SimulinkElement fParent;
  
  private SimulinkElement fChild;
  
  private static List<String> parameterNames = makeImmutableList("parent", "child");
  
  private ClashingChildNamesMatch(final SimulinkElement pParent, final SimulinkElement pChild) {
    this.fParent = pParent;
    this.fChild = pChild;
    
  }
  
  public Object get(final String parameterName) {
    if ("parent".equals(parameterName)) return this.fParent;
    if ("child".equals(parameterName)) return this.fChild;
    return null;
    
  }
  
  public SimulinkElement getParent() {
    return this.fParent;
    
  }
  
  public SimulinkElement getChild() {
    return this.fChild;
    
  }
  
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("parent".equals(parameterName) ) {
    	this.fParent = (hu.bme.mit.transima.Simulink.SimulinkElement) newValue;
    	return true;
    }
    if ("child".equals(parameterName) ) {
    	this.fChild = (hu.bme.mit.transima.Simulink.SimulinkElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setParent(final SimulinkElement pParent) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParent = pParent;
    
  }
  
  public void setChild(final SimulinkElement pChild) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChild = pChild;
    
  }
  
  public String patternName() {
    return "hu.bme.mit.transima.models.simulink.validation.clashingChildNames";
    
  }
  
  public List<String> parameterNames() {
    return ClashingChildNamesMatch.parameterNames;
    
  }
  
  public Object[] toArray() {
    return new Object[]{fParent, fChild};
    
  }
  
  public ClashingChildNamesMatch toImmutable() {
    return isMutable() ? newMatch(fParent, fChild) : this;
    
  }
  
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parent\"=" + prettyPrintValue(fParent) + ", ");
    result.append("\"child\"=" + prettyPrintValue(fChild));
    return result.toString();
    
  }
  
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParent == null) ? 0 : fParent.hashCode());
    result = prime * result + ((fChild == null) ? 0 : fChild.hashCode());
    return result;
    
  }
  
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClashingChildNamesMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ClashingChildNamesMatch other = (ClashingChildNamesMatch) obj;
    if (fParent == null) {if (other.fParent != null) return false;}
    else if (!fParent.equals(other.fParent)) return false;
    if (fChild == null) {if (other.fChild != null) return false;}
    else if (!fChild.equals(other.fChild)) return false;
    return true;
  }
  
  public ClashingChildNamesQuerySpecification specification() {
    try {
    	return ClashingChildNamesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static ClashingChildNamesMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClashingChildNamesMatch newMutableMatch(final SimulinkElement pParent, final SimulinkElement pChild) {
    return new Mutable(pParent, pChild);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ClashingChildNamesMatch newMatch(final SimulinkElement pParent, final SimulinkElement pChild) {
    return new Immutable(pParent, pChild);
    
  }
  
  private static final class Mutable extends ClashingChildNamesMatch {
    Mutable(final SimulinkElement pParent, final SimulinkElement pChild) {
      super(pParent, pChild);
      
    }
    
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClashingChildNamesMatch {
    Immutable(final SimulinkElement pParent, final SimulinkElement pChild) {
      super(pParent, pChild);
      
    }
    
    public boolean isMutable() {
      return false;
    }
  }
}
