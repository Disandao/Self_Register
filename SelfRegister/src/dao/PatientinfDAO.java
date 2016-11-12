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

import po.Patientinf;
import po.User;

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
public class PatientinfDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(PatientinfDAO.class);
	// property constants
	public static final String OFFICE = "office";
	public static final String SEX = "sex";
	public static final String IDCARD = "idcard";
	public static final String CONDITIONS = "conditions";
	public static final String USERNAME = "username";
	public static final String TEL = "tel";
	public static final String NAME = "name";
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;
	 /**
	     * 增加用户
	     * @param user 要增加的用户
	     */
	   public void add(Patientinf patient){
	        Transaction ts = null;
	        try{
	            ts = session.beginTransaction();
	            session.save(patient);
	            ts.commit();
	        }catch(Exception e){
	            System.out.println("Patientinf.add()方法发生异常:");
	            e.printStackTrace();
	        }finally{
	           sf.close();
	        }
	    }

	   public void delete(Integer serial) {
			try {
				 	ts = session.beginTransaction();
				   Query query = session.createQuery("delete from Patientinf p where p.serial=?");  
				    query.setLong(0, serial);//设定条件参数  
				    query.executeUpdate();
				    System.out.println("删除成功！");
				    ts.commit();
			} catch (RuntimeException re) {
				throw re;
			}finally{
	        	sf.close();
	        }
		}
/*
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

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
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
	}*/
	public List findAll() {
		try {
			ts = session.beginTransaction();
			String queryString = "from Patientinf";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
			}
		}
	public void update(String name,String tel,String conditions,long idcard,String office,String username,int serial) {
		try {
			ts = session.beginTransaction();
			String hql = "update from Patientinf p set p.name = ?,p.tel = ?,p.conditions = ?,p.idcard = ?,p.office = ?,p.username = ? where p.serial=?";
			Query query = session.createQuery(hql);
			query.setString(0, name);
			query.setString(1, tel);
			query.setString(2, conditions);
			query.setLong(3, idcard);
			query.setString(4, office);
			query.setString(5, username);
			query.setInteger(6, serial);
			query.executeUpdate();
			ts.commit();
		} catch (RuntimeException re) {
			log.error("modify failed", re);
			throw re;
			}finally{
	        	sf.close();
		}
		}
}