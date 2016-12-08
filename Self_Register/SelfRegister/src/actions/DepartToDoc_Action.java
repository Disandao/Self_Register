package actions;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import po.Department;
import po.Doctor;
import dao.DoctorDAO;
public class DepartToDoc_Action extends ActionSupport{
	private List<Doctor> list_doc;
	private String departName;
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public List<Doctor> getList_doc() {
		return list_doc;
	}
	public void setList_doc(List<Doctor> list_doc) {
		this.list_doc = list_doc;
	}
	public String execute() throws Exception{
		 DoctorDAO d = new DoctorDAO();
		 Department depart = new Department();
		 
		 departName=new String(departName.getBytes("iso8859-1"),"utf-8");
		 depart.setDepartName(departName);
		 //System.out.println(departName);
		 list_doc = d.findByDepartment(depart);
	     return "departtodoc_list";
	 }
}
