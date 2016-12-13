package actions;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;






import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import po.Patientinf;
import po.User;
import po.Doctor;
import po.Department;
import po.Roster;
import dao.DoctorDAO;
import dao.DepartmentDAO;
import dao.RosterDAO;
public class LoginDoctorQ_Action extends ActionSupport {
	private Doctor doc;
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public String execute() throws Exception{
		String docId = (String)ServletActionContext.getRequest().getSession().getAttribute("doctorid");
		DoctorDAO d = new DoctorDAO();
		 String[] week = new String[7] ;
		 System.out.println(docId);
		 doc = d.findById(docId);
		 ServletActionContext.getRequest().getSession().setAttribute("doctorname",doc.getDocName());
		 RosterDAO r = new RosterDAO();
		 List<Roster> list = r.findByDoctor(doc);
		 if(list==null||list.isEmpty())
		 {
			 return "failed";
		 }
		 
		 //list_table = r.findByDoctor(doc);
		 Iterator it1 = list.iterator();
		 Roster tab = (Roster)it1.next();
		 if(tab!=null)
		 {
			 week[0]=(String)tab.getRosterMon();
	    	 week[1]=(String)tab.getRosterTue();
	    	 week[2]=(String)tab.getRosterWed();
	    	 week[3]=(String)tab.getRosterThu();
	    	 week[4]=(String)tab.getRosterFri();
	    	 week[5]=(String)tab.getRosterSat();
	    	 week[6]=(String)tab.getRosterSun();
			 ServletActionContext.getRequest().setAttribute("week", week);
			 System.out.println(tab.getRosterMon());
			 System.out.println(tab.getRosterTue());
			 System.out.println(tab.getRosterWed());
		 }
		return "success";
		
	}
}