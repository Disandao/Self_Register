package actions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import po.Patientinf;

import dao.PatientinfDAO;
public class DeleteRegister_Action extends ActionSupport
{
	private String idcard;
	

	public String getIdcard() {
		return idcard;
	}


	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}


	public String execute() throws Exception
	{
		PatientinfDAO patients = new PatientinfDAO();
		patients.delete(idcard);
		String name = (String)ServletActionContext.getRequest().getSession().getAttribute("admin");
		System.out.println(name);
		if(name!=null&&name.equals("admin"))
		{
			System.out.println(name);
			return "admin";
		}
			
		else
			return "success";
	}
	/*public static void main(String[] args){
		PatientinfDAO patients = new PatientinfDAO();
		List q = null;
		q = patients.findAll();
		Iterator a = q.iterator();
		while(a.hasNext())
		{
		
			Patientinf patient=(Patientinf)a.next();
			System.out.println(patient.getConditions());
		}
	}*/

	
}
