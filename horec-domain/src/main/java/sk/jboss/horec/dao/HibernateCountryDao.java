/**
 * 
 */
package sk.jboss.horec.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sk.jboss.horec.domain.Country;

/**
 * @author ladislav.gazo
 *
 */
@Default
@LocalBean
public class HibernateCountryDao implements CountryDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public HibernateCountryDao() {
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> getAllCountries() {
		return entityManager.createQuery("from Country").getResultList();
	}

}
