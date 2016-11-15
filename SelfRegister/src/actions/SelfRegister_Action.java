package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.PatientinfDAO;
import po.Patientinf;
import po.User;

public class SelfRegister_Action extends ActionSupport {
	private Patientinf pa = new Patientinf();

	public Patientinf getPa() {
		return pa;
	}

	public void setPa(Patientinf pa) {
		this.pa = pa;
	}
	public String execute() throws Exception
	{
		PatientinfDAO t = new PatientinfDAO();
		t.add(pa);
		return "success";
	}

}
