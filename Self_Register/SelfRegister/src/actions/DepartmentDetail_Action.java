package actions;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;

import po.Department;
import po.Doctor;
import dao.DepartmentDAO;
public class DepartmentDetail_Action extends ActionSupport{
	private List<Department> list_depart;
	public List<Department> getList_depart() {
		return list_depart;
	}
	public void setList_depart(List<Department> list_depart) {
		this.list_depart = list_depart;
	}
/*	 public static void main(String[] args) {
		 DepartmentDAO de = new DepartmentDAO();
		 //±éÀú
		 List list = de.findAll();
		 Iterator it = list.iterator();
	     while(it.hasNext())
	     {
	    	 Department depart = (Department)it.next();
	    	 list_depart.add(depart);
	    	 System.out.println(depart.getDepartName());
	     }		 
	 }*/
	 public String execute() throws Exception{
		 DepartmentDAO de = new DepartmentDAO();
		 //±éÀú
		 list_depart = de.findAll();
	     return "depart_list";
	 }
	
}
