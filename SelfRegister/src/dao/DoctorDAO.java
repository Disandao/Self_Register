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
 * Doctor entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Doctor
 * @author MyEclipse Persistence Tools
 */
public class DoctorDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(DoctorDAO.class);
	// property constants
	public static final String DOC_NAME = "docName";
	public static final String DOC_TEL = "docTel";
	public static final String DOC_INFOR = "docInfor";
	public static final String DOC_POS = "docPos";
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;
	
	public void add(Doctor transientInstance) {
		//log.debug("saving Doctor instance");
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(transientInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("DoctorDaoImpl.add()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

	public void delete(Doctor persistentInstance) {
		//log.debug("deleting Doctor instance");
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.delete(persistentInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("DoctorDaoImpl.delete()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

	public Doctor findById(java.lang.String id) {
		//log.debug("getting Doctor instance with id: " + id);
		try {
			ts = session.beginTransaction();
			Doctor instance = (Doctor)session.get("po.Doctor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List findByName(java.lang.String Name) {
		//log.debug("getting Doctor instance with id: " + id);
		try {
			ts = session.beginTransaction();
			String queryString = "from Doctor d where d.docName='"+Name+"'";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List findAll() {
		//log.debug("finding all Roster instances");
		try {
			ts = session.beginTransaction();
			String queryString = "from Doctor";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List findByDepartment(Department depart) {
		//log.debug("finding Roster instance with property: " + propertyName
		//		+ ", value: " + value);
		try {
			ts = session.beginTransaction();
			String queryString = "select d from Doctor d where d.department.departName='"+depart.getDepartName()+"'";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
/*	public List findByExample(Doctor instance) {
		log.debug("finding Doctor instance by example");
		try {
			List results = getSession().createCriteria("po.Doctor")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}*/

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Doctor instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Doctor as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public List findByDocName(Object docName) {
		return findByProperty(DOC_NAME, docName);
	}
	/*

	public List findByDocTel(Object docTel) {
		return findByProperty(DOC_TEL, docTel);
	}

	public List findByDocInfor(Object docInfor) {
		return findByProperty(DOC_INFOR, docInfor);
	}

	public List findByDocPos(Object docPos) {
		return findByProperty(DOC_POS, docPos);
	}

	public List findAll() {
		log.debug("finding all Doctor instances");
		try {
			String queryString = "from Doctor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Doctor merge(Doctor detachedInstance) {
		log.debug("merging Doctor instance");
		try {
			Doctor result = (Doctor) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Doctor instance) {
		log.debug("attaching dirty Doctor instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Doctor instance) {
		log.debug("attaching clean Doctor instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}