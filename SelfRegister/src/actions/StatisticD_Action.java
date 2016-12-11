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
import dao.PatientinfDAO;
import dao.DoctorDAO;
public class StatisticD_Action extends ActionSupport
{

	public String execute() throws Exception
	{
		

		DoctorDAO doc = new DoctorDAO();
		List q = null;
		List p = null;
		q = doc.Listalldoc();
		p = doc.Listalldocname();
		Iterator a = q.iterator();
		int count=0;
		List<String> l = new ArrayList<String>(); 
		while(a.hasNext())
		{
			//System.out.println(a.next());
			String docid = (String)a.next();
			System.out.println(docid);
			PatientinfDAO patients = new PatientinfDAO();
			List e = null;
			e = patients.findBydoctorID(docid);
			Iterator b = e.iterator();
			while(b.hasNext())
			{
				count++;
				System.out.println(b.next());
			}
			l.add(String.valueOf(count));
			count =0;
		}
		ServletActionContext.getRequest().setAttribute("doctor", q);
		ServletActionContext.getRequest().setAttribute("StatisticD", l);
		ServletActionContext.getRequest().setAttribute("name", p);
		return "success";
	}
	public static void main(String[] args){
	
		DoctorDAO doc = new DoctorDAO();
		List p = null;
		p = doc.Listalldocname();
		Iterator a = p.iterator();
		while(a.hasNext())
		{
			//System.out.println(a.next());
			String docid = (String)a.next();
			System.out.println(docid);
			
		}
		
	}
}
	

