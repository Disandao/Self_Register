package actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import po.User;

public class Register_Action extends ActionSupport
{
	/*
	public static void main(String[] args){
		User u = new User();
		u.setIdcard(111);
		u.setName("111");
		u.setPassword("123");
		UserDAO t=new UserDAO();
		t.add(u);
	}*/
			private User user = new User();

			public User getUser() {
				return user;
			}

			public void setUser(User user) {
				this.user = user;
			}
			public String execute() throws Exception
			{
				//System.out.println(form.getTitle());
				UserDAO t=new UserDAO();
				User q=(User)t.findByIdcard(user.getIdcard());
				if (q==null)
				{
					t.add(user);
					return "SUCCESS";
				}
				else
					return "FAILED";
		}
}
