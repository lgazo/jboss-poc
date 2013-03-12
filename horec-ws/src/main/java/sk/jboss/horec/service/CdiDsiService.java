package sk.jboss.horec.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import sk.jboss.horec.dao.CountryDao;
import sk.jboss.horec.domain.Country;
import sk.jboss.horec.dto.CountryDto;

public class CdiDsiService implements DsiService {
	@Inject
	private CountryDao countryDao;
	
	@Override
	public List<CountryDto> listCountries() {
		List<Country> allCountries = countryDao.getAllCountries();
		List<CountryDto> result = new ArrayList<CountryDto>();
		CountryDto dto;
		for(Country country: allCountries) {
			dto = new CountryDto();
			dto.setName(country.getName() + "dto");
			result.add(dto);
		}
		return result;
	}

}
