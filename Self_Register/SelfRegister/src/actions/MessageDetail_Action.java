package actions;

import java.util.*;



import com.opensymphony.xwork2.ActionSupport;

import dao.MessageDAO;
import po.Message;
import po.User;

public class MessageDetail_Action extends ActionSupport{
	private Integer message_id;
	private List<Message> list_message;

	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public List<Message> getList_message() {
		return list_message;
	}
	public void setList_message(List<Message> list_message) {
		this.list_message = list_message;
	}
	
	public String execute() throws Exception{
		MessageDAO d = new MessageDAO();
		Message m = new Message();
		if(message_id!=null){
			m=d.findById(message_id);
			m.setAgree(m.getAgree()+1);    //点击一次？实现
			d.update(m);
		}
		list_message =  d.findAll();
		return "message_detail";
		
		
		
	}

}
