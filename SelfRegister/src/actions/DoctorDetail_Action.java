package actions;
import java.util.*;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;

import po.Doctor;
import po.Department;
import po.Roster;
import dao.DoctorDAO;
import dao.DepartmentDAO;
import dao.RosterDAO;
public class DoctorDetail_Action extends ActionSupport{
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
	private String docId;

	private Doctor doc;
	private List<Roster> list_table;
	private String[] week=new String[6];
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public List<Roster> getList_table() {
		return list_table;
	}
	public void setList_table(List<Roster> list_table) {
		this.list_table = list_table;
	}
	public String execute() throws Exception{
		 DoctorDAO d = new DoctorDAO();
		 String[] week = new String[7] ;
		 System.out.println(docId);
		 ServletActionContext.getRequest().setAttribute("id", docId);
		 doc = d.findById(docId);
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
		

		 }
		 
		/* if(it1.hasNext())
		 {
			 while(it1.next() != null)
		     {
		    	 Roster tab = (Roster)it1.next();
		    	 //System.out.println(tab.getRosterId());
		    	// System.out.println(tab.getRosterMon());
		    	 
		    	 week[0]=(String)tab.getRosterMon();
		    	 week[1]=(String)tab.getRosterTue();
		    	 week[2]=(String)tab.getRosterWed();
		    	 week[3]=(String)tab.getRosterThu();
		    	 week[4]=(String)tab.getRosterFri();
		    	 week[5]=(String)tab.getRosterSat();
		    	 week[6]=(String)tab.getRosterSun();
		    	 System.out.println(week);
		     }
		 }*/
	    
		 
	     return "doctor_detail";
	 }

	
	
	
	
	
	
	
	
}
