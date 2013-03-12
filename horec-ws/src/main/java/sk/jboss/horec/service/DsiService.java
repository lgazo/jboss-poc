/**
 * 
 */
package sk.jboss.horec.service;

import sk.jboss.horec.dto.CountryDto;

import java.util.List;

/**
 * @author ladislav.gazo
 */
public interface DsiService {
	List<CountryDto> listCountries();
}
