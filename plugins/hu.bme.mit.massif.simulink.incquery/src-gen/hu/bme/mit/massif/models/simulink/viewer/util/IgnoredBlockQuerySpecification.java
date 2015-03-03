package hu.bme.mit.massif.models.simulink.viewer.util;

import com.google.common.collect.Sets;
import hu.bme.mit.massif.models.simulink.viewer.IgnoredBlockMatch;
import hu.bme.mit.massif.models.simulink.viewer.IgnoredBlockMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate IgnoredBlockMatcher in a type-safe way.
 * 
 * @see IgnoredBlockMatcher
 * @see IgnoredBlockMatch
 * 
 */
@SuppressWarnings("all")
public final class IgnoredBlockQuerySpecification extends BaseGeneratedEMFQuerySpecification<IgnoredBlockMatcher> {
  private IgnoredBlockQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IgnoredBlockQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IgnoredBlockMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IgnoredBlockMatcher.on(engine);
  }
  
  @Override
  public IgnoredBlockMatch newEmptyMatch() {
    return IgnoredBlockMatch.newEmptyMatch();
  }
  
  @Override
  public IgnoredBlockMatch newMatch(final Object... parameters) {
    return IgnoredBlockMatch.newMatch((hu.bme.mit.massif.simulink.Block) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static IgnoredBlockQuerySpecification INSTANCE = make();
    
    public static IgnoredBlockQuerySpecification make() {
      return new IgnoredBlockQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IgnoredBlockQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.massif.models.simulink.viewer.ignoredBlock";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("bl");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("bl", "hu.bme.mit.massif.simulink.Block"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_bl = body.getOrCreateVariableByName("bl");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_bl, "bl")
      	));
      	new TypeUnary(body, var_bl, getClassifierLiteral("http://hu.bme.mit.massif/simulink/1.0", "SubSystem"), "http://hu.bme.mit.massif/simulink/1.0/SubSystem");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_bl = body.getOrCreateVariableByName("bl");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_bl, "bl")
      	));
      	new TypeUnary(body, var_bl, getClassifierLiteral("http://hu.bme.mit.massif/simulink/1.0", "PortBlock"), "http://hu.bme.mit.massif/simulink/1.0/PortBlock");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_bl = body.getOrCreateVariableByName("bl");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_bl, "bl")
      	));
      	new TypeUnary(body, var_bl, getClassifierLiteral("http://hu.bme.mit.massif/simulink/1.0", "Goto"), "http://hu.bme.mit.massif/simulink/1.0/Goto");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_bl = body.getOrCreateVariableByName("bl");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_bl, "bl")
      	));
      	new TypeUnary(body, var_bl, getClassifierLiteral("http://hu.bme.mit.massif/simulink/1.0", "From"), "http://hu.bme.mit.massif/simulink/1.0/From");
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
