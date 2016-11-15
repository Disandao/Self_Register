package actions;
import java.util.*;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import po.Doctor;
import po.Department;
import dao.DoctorDAO;
import dao.DepartmentDAO;
public class DoctorDetail_Action {
/*	public static void main(String[] args) {
		 DoctorDAO d = new DoctorDAO();
		 //遍历
		 List list = d.findAll();
		 Iterator it = list.iterator();
	     while(it.hasNext())
	     {
	    	 Doctor doc = (Doctor)it.next();
	    	 System.out.println(doc.getDocId());
	     }
	     //科室查询
	     Department depart = new Department();
		 depart.setDepartName("外科");
		 List list1 = d.findByDepartment(depart);
		 Iterator it1 = list1.iterator();
	     while(it1.hasNext())
	     {
	    	 Doctor doc = (Doctor)it1.next();
	    	 System.out.println(doc.getDocId());
	     }
	}*/
	
}
