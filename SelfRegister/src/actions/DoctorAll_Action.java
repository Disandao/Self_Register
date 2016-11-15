package actions;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import po.Doctor;
import dao.DoctorDAO;
public class DoctorAll_Action  extends ActionSupport{
	private List<Doctor> list_doc;
	public List<Doctor> getList_doc() {
		return list_doc;
	}
	public void setList_doc(List<Doctor> list_doc) {
		this.list_doc = list_doc;
	}
	public String execute() throws Exception{
		 DoctorDAO d = new DoctorDAO();
		 list_doc = d.findAll();
	     return "doc_all";
	}
}
