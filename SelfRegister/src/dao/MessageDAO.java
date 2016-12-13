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
import po.Doctor;
import po.Message;

/**
 * A data access object (DAO) providing persistence and search support for
 * Message entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see po.Message
 * @author MyEclipse Persistence Tools
 */
public class MessageDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(MessageDAO.class);
	// property constants
	public static final String WORDS = "words";
	public static final String TIME = "time";
	public static final String AGREE = "agree";
	public static final String PID = "pid";
	Configuration conf = new Configuration();
	SessionFactory sf = conf.configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction ts = null;
	
	public void add(Message transientInstance) {
		//log.debug("saving Doctor instance");
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(transientInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("MessageDaoImpl.add()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

	public Message findById(Integer message_id) {
		//log.debug("getting Doctor instance with id: " + id);
		try {
			ts = session.beginTransaction();
			Message instance = (Message)session.get("po.Message", message_id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public List findAll() {
		//log.debug("finding all Roster instances");
		try {
			ts = session.beginTransaction();
			String queryString = "from Message";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public void update(Message transientInstance) {
		Session session = sf.openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.update(transientInstance);
			ts.commit();
		} catch (Exception e) {
			System.out.println("MessageDaoImpl.update()方法发生异常:");
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}
	 /**
     * 通过hql语句得到数据库中记录总数
     */
   
    public int getAllRowCount(String hql)
    {
        Session session = sf.openSession();
        Transaction tx = null;
        int allRows = 0;
        try
        {
            tx = session.beginTransaction();
            
            Query query = session.createQuery(hql);
            
            allRows = query.list().size();
            
            tx.commit();
            
        }
        catch (Exception e)
        {
            if(tx != null)
            {
                tx.rollback();
            }
            
            e.printStackTrace();
        }
        finally
        {
            sf.close();
        }
        
        return allRows;
    }
    /**
     * 使用hibernate提供的分页功能，得到分页显示的数据
     */
    @SuppressWarnings("unchecked")
  
    public List<Message> queryByPage(String hql, int offset, int pageSize)
    {
        Session session = sf.openSession();
        Transaction tx = null;
        List<Message> list = null;
        
        try
        {
            tx = session.beginTransaction();
            
            Query query = session.createQuery(hql).setFirstResult(offset).setMaxResults(pageSize);
            
            list = query.list();
            
            tx.commit();
            
        }
        catch (Exception e)
        {
            if(tx != null)
            {
                tx.rollback();
            }
            
            e.printStackTrace();
        }
        finally
        {
        	 sf.close();
        }
        
        
        return list;
    }

/*	
	public void save(Message transientInstance) {
		log.debug("saving Message instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void delete(Message persistentInstance) {
		log.debug("deleting Message instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Message findById(java.lang.Integer id) {
		log.debug("getting Message instance with id: " + id);
		try {
			Message instance = (Message) getSession().get("po.Message", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Message instance) {
		log.debug("finding Message instance by example");
		try {
			List results = getSession().createCriteria("po.Message")
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
		log.debug("finding Message instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Message as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWords(Object words) {
		return findByProperty(WORDS, words);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByAgree(Object agree) {
		return findByProperty(AGREE, agree);
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findAll() {
		log.debug("finding all Message instances");
		try {
			String queryString = "from Message";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Message merge(Message detachedInstance) {
		log.debug("merging Message instance");
		try {
			Message result = (Message) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Message instance) {
		log.debug("attaching dirty Message instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Message instance) {
		log.debug("attaching clean Message instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}