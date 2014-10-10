package hu.bme.mit.transima.models.simulink.validation.util;

import com.google.common.collect.Sets;
import hu.bme.mit.transima.models.simulink.util.util.ChildBlockNamesQuerySpecification;
import hu.bme.mit.transima.models.simulink.validation.ClashingChildNamesMatch;
import hu.bme.mit.transima.models.simulink.validation.ClashingChildNamesMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ClashingChildNamesMatcher in a type-safe way.
 * 
 * @see ClashingChildNamesMatcher
 * @see ClashingChildNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class ClashingChildNamesQuerySpecification extends BaseGeneratedQuerySpecification<ClashingChildNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClashingChildNamesQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  protected ClashingChildNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClashingChildNamesMatcher.on(engine);
  }
  
  public String getFullyQualifiedName() {
    return "hu.bme.mit.transima.models.simulink.validation.clashingChildNames";
    
  }
  
  public List<String> getParameterNames() {
    return Arrays.asList("parent","child");
  }
  
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("parent", "hu.bme.mit.transima.Simulink.SimulinkElement"),new PParameter("child", "hu.bme.mit.transima.Simulink.SimulinkElement"));
  }
  
  public ClashingChildNamesMatch newEmptyMatch() {
    return ClashingChildNamesMatch.newEmptyMatch();
  }
  
  public ClashingChildNamesMatch newMatch(final Object... parameters) {
    return ClashingChildNamesMatch.newMatch((hu.bme.mit.transima.Simulink.SimulinkElement) parameters[0], (hu.bme.mit.transima.Simulink.SimulinkElement) parameters[1]);
  }
  
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_parent = body.getOrCreateVariableByName("parent");
      PVariable var_child = body.getOrCreateVariableByName("child");
      PVariable var_name = body.getOrCreateVariableByName("name");
      PVariable var_child2 = body.getOrCreateVariableByName("child2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_parent, "parent"), 
        new ExportedParameter(body, var_child, "child")
      ));
      
      new TypeUnary(body, var_parent, getClassifierLiteral("http://hu.bme.mit.transima/simulink/1.0", "SimulinkElement"), "http://hu.bme.mit.transima/simulink/1.0/SimulinkElement");
      
      new TypeUnary(body, var_child, getClassifierLiteral("http://hu.bme.mit.transima/simulink/1.0", "SimulinkElement"), "http://hu.bme.mit.transima/simulink/1.0/SimulinkElement");
      new PositivePatternCall(body, new FlatTuple(var_parent, var_child, var_name), ChildBlockNamesQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_parent, var_child2, var_name), ChildBlockNamesQuerySpecification.instance());
      new Inequality(body, var_child, var_child2);
      bodies.add(body);
    }
    {
      PAnnotation annotation = new PAnnotation("Constraint");
      annotation.addAttribute("message","Child $child$ has a sibling in $parent$ with the same name!");
      annotation.addAttribute("targetEditorId","hu.bme.mit.transima.simulink.ui.editor1");
      annotation.addAttribute("location",new ParameterReference("child"));
      annotation.addAttribute("severity","error");
      addAnnotation(annotation);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static ClashingChildNamesQuerySpecification INSTANCE = make();
    
    public static ClashingChildNamesQuerySpecification make() {
      return new ClashingChildNamesQuerySpecification();					
      
    }
  }
}
