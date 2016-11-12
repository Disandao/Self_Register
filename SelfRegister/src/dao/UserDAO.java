package dao;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import po.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see po.User
 * @author MyEclipse Persistence Tools
 */
public class UserDAO extends DefaultDao {
	private static final Log log = LogFactory.getLog(UserDAO.class);
	// property constants
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String PASSWORD = "password";
	static Configuration conf = new Configuration();
	static SessionFactory sf = conf.configure().buildSessionFactory();
	static Session session = sf.openSession();
	static Transaction ts = null;
	 /**
	     * �����û�
	     * @param user Ҫ���ӵ��û�
	     */
	   public static void add(User user){
	        Transaction ts = null;
	        try{
	            ts = session.beginTransaction();
	            session.save(user);
	            ts.commit();
	        }catch(Exception e){
	            System.out.println("UserDaoImpl.add()���������쳣:");
	            e.printStackTrace();
	        }finally{
	           sf.close();
	        }
	    }
	    
	    /**
	     * ��¼��֤
	     * @param name
	     * @param password
	     * @return -1:�������û��� ; -2:���벻��ȷ ; >0:��¼�ɹ�(�����ظü�¼ID)
	     */
	    public int isExist(String name,String password){
	        //int state = 0 ;        //��ʼ��״̬����
	        try{
	            Query query = session.createQuery("from User u where u.name = ?");
	            query.setString(0, name);
	            List list = query.list();
	            if(null == list || 0 == list.size()){
	                return -1 ;     //�û���������
	            }
	            Query query2 = session.createQuery("from User u where u.name = ? and u.password = ?");
	            query2.setString(0, name);
	            query2.setString(1, password);
	            List<User> list2 = query2.list();
	            if(null == list2||list2.isEmpty()){
	                return -2 ;        //���벻��ȷ
	            }
	            Iterator it = list2.iterator();
	            User user = (User)it.next();
	            return user.getId();    //��֤�ɹ�,ȡIDֵ
	            
	        }catch(Exception e){
	            System.out.println("UserDaoImpl.isExist()���������쳣:");
	            e.printStackTrace();
	            return 0;    //�쳣ʱ����0
	        }finally{
	        	sf.close();
	        }
	    }

	public void delete(long idcard) {
		try {
			 	ts = session.beginTransaction();
			   Query query = session.createQuery("delete from User u where u.idcard=?");  
			    query.setLong(0, idcard);//�趨��������  
			    query.executeUpdate();
			    System.out.println("ɾ���ɹ���");
			    ts.commit();
		} catch (RuntimeException re) {
			throw re;
		}finally{
        	sf.close();
        }
	}

	public static User findByIdcard(long idcard) {
		try {
			ts = session.beginTransaction();
			Query query = session.createQuery("from User u where u.idcard=?");  
			 query.setLong(0, idcard);//�趨�������� 
			 List list = query.list();
	         Iterator it = list.iterator();
	         if(it.hasNext())
	         {
	        	 User user = (User)it.next();
		         return user;
	         }
	         else
	         {
	        	System.out.println("�û�������");
		        return null;
	         }
	         
		} catch (RuntimeException re){
			log.error("get failed", re);
			throw re;
		}
		
	}
/*
	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List results = getSession().createCriteria("po.User")
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
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findById(Object id) {
		return findByProperty(ID, id);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}
*/
	public List findAll() {
		try {
			ts = session.beginTransaction();
			String queryString = "from User";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
/*
	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}*/
}