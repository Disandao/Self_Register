package actions;

import java.util.*;

import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;

import po.Message;
import po.PageBean;

import com.opensymphony.xwork2.ActionSupport;

import dao.MessageDAO;


public class MessagePageDetail_Action  extends ActionSupport{
	private int page;
	private Integer message_id;
    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }
    public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	
	
	public String execute() throws Exception{
			MessageDAO md = new MessageDAO();
			Message m = new Message();
			if(message_id!=null){
				m=md.findById(message_id);
				m.setAgree(m.getAgree()+1);    //点击一次？实现
				md.update(m);
			}
		 	PageBean pageBean = new PageBean();
	        
	        String hql = "from Message";
	        int pageSize = 5;
	        int allRows = md.getAllRowCount(hql);
	        
	        int totalPage = pageBean.getTotalPages(pageSize, allRows);
	        
	        int currentPage = pageBean.getCurPage(page);
	        
	        int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);
	        
	        List<Message> list = md.queryByPage(hql, offset, pageSize);
	        pageBean.setList(list);
	        pageBean.setAllRows(allRows);
	        pageBean.setCurrentPage(currentPage);
	        pageBean.setTotalPage(totalPage);
	        
	        HttpServletRequest request = ServletActionContext.getRequest();
	        request.setAttribute("pageBean", pageBean);
		return "messagepage_detail";
	}

}
