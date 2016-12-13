package dao;

import java.util.List;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import po.Doctor;
import po.Roster;


/**
 * A data access object (DAO) providing persistence and search support for
 * Roster entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Roster
 * @author MyEclipse Persistence Tools
 */
public class RosterDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(RosterDAO.class);
	// property constants
	public static final String ROSTER_MON = "rosterMon";
	public static final String ROSTER_TUE = "rosterTue";
	public static final String ROSTER_WED = "rosterWed";
	public static final String ROSTER_THU = "rosterThu";
	public static final String ROSTER_FRI = "rosterFri";
	public static final String ROSTER_SAT = "rosterSat";
	public static final String ROSTER_SUN = "rosterSun";
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;

	/**
	 * 增加排班表
	 * 
	 * @param roster
	 */
	public void add(Roster roster) {
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(roster);
			ts.commit();
		} catch (Exception e) {
			System.out.println("RosterDaoImpl.add()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
/*	public void save(Roster transientInstance) {
		log.debug("saving Roster instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}*/
	public void delete(Roster roster) {
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.delete(roster);
			ts.commit();
		} catch (Exception e) {
			System.out.println("RosterDaoImpl.delete()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
	
/*	public void delete(Roster persistentInstance) {
		log.debug("deleting Roster instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}*/
	public void update(String mon,String tue,String wed,String thu,String fri,String sat,String sun,String id) {
		try {
			ts = session.beginTransaction();
			String hql = "update from Roster p set p.rosterMon = ?,p.rosterTue = ?,p.rosterWed = ?,p.rosterThu = ?,p.rosterFri = ?,p.rosterSat = ?,p.rosterSun = ? where p.rosterId=?";
			Query query = session.createQuery(hql);
			query.setString(0, mon);
			query.setString(1, tue);
			query.setString(2, wed);
			query.setString(3, thu);
			query.setString(4, fri);
			query.setString(5, sat);
			query.setString(6, sun);
			query.setString(7, id);
			query.executeUpdate();
			ts.commit();
		} catch (RuntimeException re) {
			log.error("modify failed", re);
			throw re;
			}finally{
	        	sf.close();
		}
		}
	public Roster findById(java.lang.String id) {
		//log.debug("getting Roster instance with id: " + id);
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			Roster instance = (Roster) session.get("po.Roster", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
			sf.close();
		}
	}
	public List findByDoctor(Doctor doc) {
		//log.debug("finding Roster instance with property: " + propertyName
		//		+ ", value: " + value);
		try {
			ts = session.beginTransaction();
			String queryString = "select r from Roster r where r.doctor.docId='"+doc.getDocId()+"'";
			Query queryObject = session.createQuery(queryString);
			//queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
/*	public Roster findById(java.lang.String id) {
		log.debug("getting Roster instance with id: " + id);
		try {
			Roster instance = (Roster) getSession().get("po.Roster", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}*/
	/*public List findByExample(Roster instance) {
		log.debug("finding Roster instance by example");
		try {
			List results = getSession().createCriteria("po.Roster")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}*/

/*	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Roster instance with property: " + propertyName
				+ ", value: " + value);
		try {
			ts = session.beginTransaction();
			String queryString = "from Roster as model where model."
					+ propertyName + "= ?";
			Query queryObject = session.createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRosterMon(Object rosterMon) {
		return findByProperty(ROSTER_MON, rosterMon);
	}

	public List findByRosterTue(Object rosterTue) {
		return findByProperty(ROSTER_TUE, rosterTue);
	}

	public List findByRosterWed(Object rosterWed) {
		return findByProperty(ROSTER_WED, rosterWed);
	}

	public List findByRosterThu(Object rosterThu) {
		return findByProperty(ROSTER_THU, rosterThu);
	}

	public List findByRosterFri(Object rosterFri) {
		return findByProperty(ROSTER_FRI, rosterFri);
	}

	public List findByRosterSat(Object rosterSat) {
		return findByProperty(ROSTER_SAT, rosterSat);
	}

	public List findByRosterSun(Object rosterSun) {
		return findByProperty(ROSTER_SUN, rosterSun);
	}*/

	public List findAll() {
		//log.debug("finding all Roster instances");
		try {
			ts = session.beginTransaction();
			String queryString = "from Roster";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

/*	public Roster merge(Roster detachedInstance) {
		log.debug("merging Roster instance");
		try {
			Roster result = (Roster) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Roster instance) {
		log.debug("attaching dirty Roster instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Roster instance) {
		log.debug("attaching clean Roster instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}