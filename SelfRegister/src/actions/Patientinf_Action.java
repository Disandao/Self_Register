package actions;

import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import po.Doctor;
import po.Patientinf;
import po.Roster;
import po.User;
import dao.PatientinfDAO;
import dao.RosterDAO;
import dao.UserDAO;
import dao.DoctorDAO;
public class Patientinf_Action extends ActionSupport{
	
	
	private Patientinf pa = new Patientinf();

	public Patientinf getPa() {
		return pa;
	}

	public void setPa(Patientinf pa) {
		this.pa = pa;
	}
	public String execute() throws Exception
	{
		Doctor doc = new Doctor();
		DoctorDAO d = new DoctorDAO();
		doc = d.findById(pa.getDoctorid());
		RosterDAO r = new RosterDAO();
		List<Roster> list = r.findByDoctor(doc);
		 Iterator it1 = list.iterator();
		 Roster tab = (Roster)it1.next();
		 System.out.println("old"+tab.getRosterMon());
		 String str=pa.getTime();
		 System.out.println("time"+str);
		 int i= (int)str.charAt(1)-48;
		 System.out.println(str.charAt(1));
		 System.out.println("i"+i);
		 if(i==1)
		 {
			 int temp = Integer.parseInt(tab.getRosterMon());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterMon(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
		 else if(i==2)
		 {
			 int temp = Integer.parseInt(tab.getRosterTue());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterTue(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 
		 }
		 else if(i==3)
		 {
			 int temp = Integer.parseInt(tab.getRosterWed());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterWed(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
		 else if(i==4)
		 {
			 int temp = Integer.parseInt(tab.getRosterThu());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterThu(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
		 else if(i==5)
		 {
			 int temp = Integer.parseInt(tab.getRosterFri());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterFri(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
		 else if(i==6)
		 {
			 int temp = Integer.parseInt(tab.getRosterSat());
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 int ntemp = temp + strsub;
			 tab.setRosterSat(String.valueOf(ntemp));
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
		 else if(i==7)
		 {
			 int temp = Integer.parseInt(tab.getRosterSun());
			 System.out.println(temp);
			 int strsub=Integer.parseInt(str.substring(str.length()- 5,str.length()- 1));
			 System.out.println(strsub);
			 int ntemp = temp + strsub;
			 System.out.println(ntemp);
			 tab.setRosterSun(String.valueOf(ntemp));
			 System.out.println(tab.getRosterSun());
			 r.update(tab.getRosterMon(), tab.getRosterTue(), tab.getRosterWed(), tab.getRosterThu(), tab.getRosterFri(), tab.getRosterSat(), tab.getRosterSun(), tab.getRosterId());
		 }
			 
		String username = (String)ServletActionContext.getRequest().getSession().getAttribute("sessionname");
		PatientinfDAO t = new PatientinfDAO();
		/*if(pa.getDoctorid()==null||pa.getDoctorid().isEmpty())
		{
			pa.setDoctorid("2233");
		}*/
		System.out.println("@@@"+pa.getDoctorid());
		pa.setUsername(username);
		t.add(pa);
		System.out.println("@@@"+pa.getDoctorid());
		return "SUCCESS";
	}
	/*
	public static void main(String[] args) {
	      Patientinf test = new Patientinf();
	      PatientinfDAO t = new PatientinfDAO();
	      test.setName("adisson");
	      test.setSex("male");
	      test.setTel("1111133333");
	      test.setIdcard(1234567);
	      test.setConditions("headache and flue");
	      test.setOffice("brain");
	      test.setUsername("acccc");
	      test.setDoctorid("22");
	      //t.findAll();
	      t.add(test);
	      //System.out.println(test.getSerial());
	     // t.update("dalao", "33331111", test.getConditions(), 7654, test.getOffice(), "haha",1);
	      //t.delete(1);
	     List list = t.findAll();
	      Iterator it = list.iterator();
	     while(it.hasNext())
	      {
	    	  Patientinf p = (Patientinf)it.next();
	    	  System.out.println(p.getName());
	      }
	    
	   }*/
}
