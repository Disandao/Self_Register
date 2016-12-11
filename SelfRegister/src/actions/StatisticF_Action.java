package actions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Patientinf;
import dao.DepartmentDAO;
import dao.PatientinfDAO;
import dao.DoctorDAO;
public class StatisticF_Action extends ActionSupport
{

	public String execute() throws Exception
	{
		

		DepartmentDAO dep = new DepartmentDAO();
		List q = null;
		q = dep.Listalldep();
		Iterator a = q.iterator();
		int count=0;
		List<String> l = new ArrayList<String>(); 
		while(a.hasNext())
		{
			//System.out.println(a.next());
			String office = (String)a.next();
			//System.out.println(office);
			PatientinfDAO patients = new PatientinfDAO();
			List e = null;
			e = patients.findByoffice(office);
			Iterator b = e.iterator();
			while(b.hasNext())
			{
				count++;
				System.out.println(b.next());
			}
			l.add(String.valueOf(count));
			count =0;
		}
		/*Iterator c = l.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}*/
		ServletActionContext.getRequest().setAttribute("office", q);
		ServletActionContext.getRequest().setAttribute("StatisticF", l);
		return "success";
	}
	/*public static void main(String[] args){
	
		DepartmentDAO dep = new DepartmentDAO();
		List q = null;
		q = dep.Listalldep();
		Iterator a = q.iterator();
		int count=0;
		List<String> l = new ArrayList<String>(); 
		while(a.hasNext())
		{
			//System.out.println(a.next());
			String office = (String)a.next();
			System.out.println(office);
			PatientinfDAO patients = new PatientinfDAO();
			List e = null;
			e = patients.findByoffice(office);
			Iterator b = e.iterator();
			while(b.hasNext())
			{
				count++;
				System.out.println(b.next());
			}
			l.add(String.valueOf(count));
			count =0;
		}
		Iterator c = l.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
	}*/

	
}
