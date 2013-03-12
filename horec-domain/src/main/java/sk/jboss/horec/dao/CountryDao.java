/**
 * 
 */
package sk.jboss.horec.dao;

import java.util.List;

import sk.jboss.horec.domain.Country;

/**
 * @author ladislav.gazo
 *
 */
public interface CountryDao {
	List<Country> getAllCountries();
}
