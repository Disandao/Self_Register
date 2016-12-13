package actions;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import po.Doctor;
import dao.DoctorDAO;
public class DoctorSearch_Action extends ActionSupport{
	private List<Doctor> list_doc;
	private String docName;
	
	public List<Doctor> getList_doc() {
		return list_doc;
	}
	public void setList_doc(List<Doctor> list_doc) {
		this.list_doc = list_doc;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String execute() throws Exception{
		 DoctorDAO d = new DoctorDAO();
		 list_doc=d.findByName(docName);
	     return "doc_search";
	}
}
