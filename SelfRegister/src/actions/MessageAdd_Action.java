package actions;
import java.text.SimpleDateFormat;

import java.util.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.MessageDAO;
import po.Message;
import po.User;
public class MessageAdd_Action extends ActionSupport{
	private Message message=new Message();
	private long idcard;
	private Integer pid;
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public long getIdcard() {
		return idcard;
	}

	public void setIdcard(long idcard) {
		this.idcard = idcard;
	}
	
	public String execute() throws Exception{
		Date dt = new Date();//获取当前时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dd =format.format(dt);
		MessageDAO d = new MessageDAO();
		User u = new User();
		u.setIdcard(idcard);
		message.setWords(new String(message.getWords().getBytes("iso8859-1"),"utf-8"));
		message.setUser(u);
		
		message.setAgree(0);
		message.setTime(dd);
		if(pid==null||pid==0)
			message.setPid(0);
		else{
			message.setPid(pid);
			Message m1 = d.findById(pid);
			message.setPidName((m1.getUser().getName()));
		}
		d.add(message);
		return "message_add";
		
	}
}
