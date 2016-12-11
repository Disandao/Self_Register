package actions;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;




import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import po.Patientinf;
import po.User;
public class Login_Action extends ActionSupport {
		private User user = new User();
		private String imageCode;
		private String error;
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		public String getImageCode() {
			return imageCode;
		}

		public void setImageCode(String imageCode) {
			this.imageCode = imageCode;
		}
		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}
		public String execute() throws Exception
		{
			//System.out.println(ServletActionContext.getRequest().getSession().getAttribute("sRand"));
			
			
			int id;
			if(user.getName().isEmpty()||user.getPassword().isEmpty()){
				error="用户名或密码为空！";
				ServletActionContext.getRequest().setAttribute("error", error);
				return ERROR;
			}
			if(imageCode.isEmpty()){
				error="验证码为空！";
				ServletActionContext.getRequest().setAttribute("error", error);
				return ERROR;
			}
			if(!imageCode.equals(ServletActionContext.getRequest().getSession().getAttribute("sRand"))){
				error="验证码错误！";
				ServletActionContext.getRequest().setAttribute("error", error);
				return ERROR;
			}
			try {
				//System.out.println(user.getName());
				//
				int i = dao.UserDAO.isExist(user.getName(),user.getPassword());
				User u = dao.UserDAO.findByName(user.getName());
				//ServletActionContext.getRequest().setAttribute("idcard", u.getIdcard());
				//System.out.println("***************"+i);
				if(i==-1)
				{
					System.out.println("***************nininii");
					error = "用户名不存在！";
					ServletActionContext.getRequest().setAttribute("error", error);
					return ERROR;
				}
				else if(i==-2)
				{
					System.out.println("***************lalalla");
					error = "密码不正确！";
					ServletActionContext.getRequest().setAttribute("error", error);
					return ERROR;
				}
				else 
					id = i;
				if(id==1)
				{
					ServletActionContext.getRequest().getSession().setAttribute("sessionname",user.getName());
					ServletActionContext.getRequest().getSession().setAttribute("sessionidcard",u.getIdcard());
					return "patient";
				}
					
				else if(id==2)
				{
					ServletActionContext.getRequest().getSession().setAttribute("admin",user.getName());
					return "admin";
				}
					
				else if(id==3)
				{
					System.out.println(user.getName());
					ServletActionContext.getRequest().getSession().setAttribute("doctorid",user.getName());
					return "doctor";
				}
					
				else
					return ERROR;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			return error;
	   
		}
		/*
		   public static void main(String[] args) {
		 // Configuration conf = new Configuration();
		  ///SessionFactory sf = conf.configure().buildSessionFactory();
		  //Session sess = sf.openSession();
		  //Transaction tx = sess.beginTransaction();
	      User test = new User(2,3,"4","5");
	      UserDAO t = new UserDAO();
	      //t.delete(445);
	      int a = t.isExist("111", "123");
	      System.out.println(a);
	      //System.out.println(test.getName());
	      //System.out.println(t.isExist("accccc", "1"));
	      //Patientinf n = new Patientinf();
	     // n.setConditions("ssss");
	      //n.setIdcard(122);
	      //n.setOffice("sss");
	      //n.setSerial(1212);
	      //n.setSex("man");
	      
	      //sess.save(n);
	      //sess.save(test);
	     // tx.commit();
	    //  sf.close();
		   */
	}

