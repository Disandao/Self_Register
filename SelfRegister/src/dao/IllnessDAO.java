package dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import po.Illness;

/**
 * A data access object (DAO) providing persistence and search support for
 * Illness entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Illness
 * @author MyEclipse Persistence Tools
 */
public class IllnessDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(IllnessDAO.class);
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;
	// property constants

/*	public void save(Illness transientInstance) {
		log.debug("saving Illness instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Illness persistentInstance) {
		log.debug("deleting Illness instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
*/
	public Illness findById(java.lang.String id) {
		log.debug("getting Illness instance with id: " + id);
		try {
			ts = session.beginTransaction();
			Illness instance = (Illness) session.get("po.Illness", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
/*	public List findByExample(Illness instance) {
		log.debug("finding Illness instance by example");
		try {
			List results = getSession().createCriteria("po.Illness")
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
		log.debug("finding Illness instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Illness as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Illness instances");
		try {
			String queryString = "from Illness";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Illness merge(Illness detachedInstance) {
		log.debug("merging Illness instance");
		try {
			Illness result = (Illness) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Illness instance) {
		log.debug("attaching dirty Illness instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Illness instance) {
		log.debug("attaching clean Illness instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}