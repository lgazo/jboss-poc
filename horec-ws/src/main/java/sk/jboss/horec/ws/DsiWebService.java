/**
 * 
 */
package sk.jboss.horec.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.servlet.annotation.WebServlet;

import sk.jboss.horec.dto.CountryDto;
import sk.jboss.horec.service.DsiService;

/**
 * @author ladislav.gazo
 */
@WebServlet(name = "DsiWebService", urlPatterns = {"/ws/*"})
@WebService
@SOAPBinding(style = Style.RPC)
public class DsiWebService {
	private DsiService dsiService;
	
	@WebMethod
	public List<CountryDto> listCountries() {
		return dsiService.listCountries();
	}
}
