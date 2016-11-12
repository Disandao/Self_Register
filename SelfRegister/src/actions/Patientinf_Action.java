package actions;

import java.util.Iterator;
import java.util.List;

import po.Patientinf;
import po.User;
import dao.PatientinfDAO;
import dao.UserDAO;

public class Patientinf_Action {
	public static void main(String[] args) {
	      Patientinf test = new Patientinf();
	      PatientinfDAO t = new PatientinfDAO();
	      test.setName("adison");
	      test.setSex("male");
	      test.setTel("1111133333");
	      test.setIdcard(1234567);
	      test.setConditions("headache and flue");
	      test.setOffice("brain");
	      test.setUsername("acccc");
	      //t.findAll();
	      //t.add(test);
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
	    
	   }
}
