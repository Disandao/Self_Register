package dao;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import po.Department;
import po.Doctor;

/**
 * A data access object (DAO) providing persistence and search support for
 * Department entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Department
 * @author MyEclipse Persistence Tools
 */
public class DepartmentDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(DepartmentDAO.class);
	// property constants
	public static final String DEPART_INFOR = "departInfor";
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;
	public void add(Department transientInstance) {
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(transientInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("DepartmentDaoImpl.add()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

	public void delete(Department persistentInstance) {
		log.debug("deleting Department instance");
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.delete(persistentInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("DepartmentDaoImpl.delete()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

	public Department findById(java.lang.String id) {
		log.debug("getting Department instance with id: " + id);
		try {
			ts = session.beginTransaction();
			Department instance = (Department) session.get(
					"po.Department", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List findAll() {
		//log.debug("finding all Department instances");
		try {
			ts = session.beginTransaction();
			String queryString = "from Department";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	/*public List findByExample(Department instance) {
		log.debug("finding Department instance by example");
		try {
			List results = getSession().createCriteria("po.Department")
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
		log.debug("finding Department instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Department as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDepartInfor(Object departInfor) {
		return findByProperty(DEPART_INFOR, departInfor);
	}
*/
	

/*	public Department merge(Department detachedInstance) {
		log.debug("merging Department instance");
		try {
			Department result = (Department) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Department instance) {
		log.debug("attaching dirty Department instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Department instance) {
		log.debug("attaching clean Department instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}