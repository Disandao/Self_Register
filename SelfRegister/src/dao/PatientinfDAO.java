package dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import po.Patientinf;

/**
 * A data access object (DAO) providing persistence and search support for
 * Patientinf entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Patientinf
 * @author MyEclipse Persistence Tools
 */
public class PatientinfDAO extends UserDao {
	private static final Log log = LogFactory.getLog(PatientinfDAO.class);
	// property constants
	public static final String OFFICE = "office";
	public static final String SEX = "sex";
	public static final String IDCARD = "idcard";
	public static final String CONDITIONS = "conditions";

	public void save(Patientinf transientInstance) {
		log.debug("saving Patientinf instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Patientinf persistentInstance) {
		log.debug("deleting Patientinf instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Patientinf findById(java.lang.Integer id) {
		log.debug("getting Patientinf instance with id: " + id);
		try {
			Patientinf instance = (Patientinf) getSession().get(
					"po.Patientinf", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Patientinf instance) {
		log.debug("finding Patientinf instance by example");
		try {
			List results = getSession().createCriteria("po.Patientinf")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Patientinf instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Patientinf as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOffice(Object office) {
		return findByProperty(OFFICE, office);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

	public List findByConditions(Object conditions) {
		return findByProperty(CONDITIONS, conditions);
	}

	public List findAll() {
		log.debug("finding all Patientinf instances");
		try {
			String queryString = "from Patientinf";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Patientinf merge(Patientinf detachedInstance) {
		log.debug("merging Patientinf instance");
		try {
			Patientinf result = (Patientinf) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Patientinf instance) {
		log.debug("attaching dirty Patientinf instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Patientinf instance) {
		log.debug("attaching clean Patientinf instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}