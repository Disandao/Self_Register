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
public class PrivateInf_Action extends ActionSupport
{
	

	public String execute() throws Exception
	{
		String username = (String)ServletActionContext.getRequest().getSession().getAttribute("sessionname");
		System.out.println("******privateinf"+username);
		HttpServletRequest request = null;
		PatientinfDAO patients = new PatientinfDAO();
		List q = null;
		q = patients.findByUsername(username);
/*		Iterator a = q.iterator();
		while(a.hasNext())
		{
			Patientinf patient=(Patientinf)a.next();
			System.out.println(patient.getConditions());
		}*/
		ServletActionContext.getRequest().setAttribute("patients", q);
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
