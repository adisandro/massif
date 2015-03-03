package hu.bme.mit.massif.models.simulink.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mit.massif.models.simulink.derived.HasSourceBlockMatch;
import hu.bme.mit.massif.models.simulink.derived.HasSourceBlockMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate HasSourceBlockMatcher in a type-safe way.
 * 
 * @see HasSourceBlockMatcher
 * @see HasSourceBlockMatch
 * 
 */
@SuppressWarnings("all")
public final class HasSourceBlockQuerySpecification extends BaseGeneratedEMFQuerySpecification<HasSourceBlockMatcher> {
  private HasSourceBlockQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static HasSourceBlockQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasSourceBlockMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return HasSourceBlockMatcher.on(engine);
  }
  
  @Override
  public HasSourceBlockMatch newEmptyMatch() {
    return HasSourceBlockMatch.newEmptyMatch();
  }
  
  @Override
  public HasSourceBlockMatch newMatch(final Object... parameters) {
    return HasSourceBlockMatch.newMatch((hu.bme.mit.massif.simulink.Block) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static HasSourceBlockQuerySpecification INSTANCE = make();
    
    public static HasSourceBlockQuerySpecification make() {
      return new HasSourceBlockQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static HasSourceBlockQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.massif.models.simulink.derived.hasSourceBlock";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Bl");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Bl", "hu.bme.mit.massif.simulink.Block"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_Bl = body.getOrCreateVariableByName("Bl");
      	PVariable var__Src = body.getOrCreateVariableByName("_Src");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_Bl, "Bl")
      	));
      	new TypeBinary(body, CONTEXT, var_Bl, var__Src, getFeatureLiteral("http://hu.bme.mit.massif/simulink/1.0", "Block", "sourceBlock"), "http://hu.bme.mit.massif/simulink/1.0/Block.sourceBlock");
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
