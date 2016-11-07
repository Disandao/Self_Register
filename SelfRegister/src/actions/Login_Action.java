package actions;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import po.Patientinf;
import po.User;
import po.UserDAO;
public class Login_Action {
	   private static SessionFactory factory; 
	   public static void main(String[] args) {
		  Configuration conf = new Configuration();
		  SessionFactory sf = conf.configure().buildSessionFactory();
		  Session sess = sf.openSession();
		  Transaction tx = sess.beginTransaction();
		  
	      User test = new User();
	      test.setId(22);
	      test.setIdcard(445);
	      test.setName("accccc");
	      test.setPassword("12313213");
	      Patientinf n = new Patientinf();
	      n.setConditions("ssss");
	      n.setIdcard(122);
	      n.setOffice("sss");
	      n.setSerial(1212);
	      n.setSex("man");
	      sess.save(n);
	      sess.save(test);
	      tx.commit();
	      sf.close();
	   }
	 
	
	}

