package actions;
import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;


import po.Doctor;
import po.Roster;
import dao.DoctorDAO;
import dao.RosterDAO;
public class RosterDetail_Action extends ActionSupport{
	private List<Roster> list_table;
	private String docID;
	/*public static void main(String[] args) {
		// Doctor doc = new Doctor("004");
		 //Roster table = new Roster("2",doc,"0001","0010","0001","0010","0001","0010","0001");
		 
		 //r.delete(table);
		//查询全部
		 RosterDAO r = new RosterDAO();
		 List list = r.findAll();
		 Iterator it = list.iterator();
	     while(it.hasNext())
	     {
	    	 Roster tab = (Roster)it.next();
	    	 System.out.println(tab.getRosterId());
	     }
	     //查询医生表格
	     //Doctor doc = new Doctor("002");
	     Doctor doc = new Doctor();
	     doc.setDocId("002");
	     List list1 = r.findByDoctor(doc);
	     Iterator it1 = list1.iterator();
	     while(it1.hasNext())
	     {
	    	 Roster tab = (Roster)it1.next();
	    	 System.out.println(tab.getRosterId());
	     }
	}*/
	public List<Roster> getList_table() {
		return list_table;
	}
	public void setList_table(List<Roster> list_table) {
		this.list_table = list_table;
	}
	public String getDocID() {
		return docID;
	}
	public void setDocID(String docID) {
		this.docID = docID;
	}
	public String execute() throws Exception{
		 RosterDAO r = new RosterDAO();
		 Doctor doc = new Doctor();
		 docID=new String(docID.getBytes("iso8859-1"),"utf-8");
		 doc.setDocId(docID);
		 list_table = r.findByDoctor(doc);
	     return "table_list";
	 }
}
