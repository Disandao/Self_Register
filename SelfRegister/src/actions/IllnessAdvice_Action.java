package actions;

import java.util.Iterator;
import java.util.List;

import po.Department;
import po.Doctor;
import po.Illness;

import com.opensymphony.xwork2.ActionSupport;

import dao.DoctorDAO;
import dao.IllnessDAO;



public class IllnessAdvice_Action extends ActionSupport{
	private String illnessName;
	private static  List<Doctor> list_doc;
	public String getIllnessName() {
		return illnessName;
	}
	public void setIllnessName(String illnessName) {
		this.illnessName = illnessName;
	}
	public List<Doctor> getList_doc() {
		return list_doc;
	}
	public void setList_doc(List<Doctor> list_doc) {
		this.list_doc = list_doc;
	}
	/*public static void main(String[] args) {
		 IllnessDAO d0 = new IllnessDAO();
		 Illness illness =  d0.findById("³Õ´ô");
		 DoctorDAO d = new DoctorDAO();
		 Department depart = illness.getDepartment();
		 list_doc = d.findByDepartment(depart);
		 Iterator it = list_doc.iterator();
	     while(it.hasNext())
	     {
	    	Doctor de = (Doctor)it.next();
	    	System.out.println(de.getDocName());	 
	     }		 
	 }*/
	public String execute() throws Exception{
		 IllnessDAO d0 = new IllnessDAO();
		 //illnessName=new String(illnessName.getBytes("iso8859-1"),"utf-8");
		 Illness illness =  d0.findById(illnessName);
		 DoctorDAO d = new DoctorDAO();
		 Department depart = illness.getDepartment();
		 list_doc = d.findByDepartment(depart);
	     return "illnesstodoc_list";
	 }
	
}
