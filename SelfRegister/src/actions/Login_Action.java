package actions;
import java.util.List;


 

import java.util.Date;
import java.util.Iterator; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.UserDAO;
import po.Patientinf;
import po.User;
public class Login_Action {
	   private static SessionFactory factory; 
	 /*  public static void main(String[] args) {
		 // Configuration conf = new Configuration();
		  ///SessionFactory sf = conf.configure().buildSessionFactory();
		  //Session sess = sf.openSession();
		  //Transaction tx = sess.beginTransaction();
	      User test = new User(2,3,"4","5");
	      UserDAO t = new UserDAO();
	      t.delete(445);
	      List list = t.findAll();
	      Iterator it = list.iterator();
	      while(it.hasNext())
	      {
	    	  User user = (User)it.next();
	    	  System.out.println(user.getName());
	      }
	      //System.out.println(test.getName());
	      //System.out.println(t.isExist("accccc", "1"));
	      //Patientinf n = new Patientinf();
	     // n.setConditions("ssss");
	      //n.setIdcard(122);
	      //n.setOffice("sss");
	      //n.setSerial(1212);
	      //n.setSex("man");
	      
	      //sess.save(n);
	      //sess.save(test);
	     // tx.commit();
	    //  sf.close();
	   }*/
	 
	
	}

