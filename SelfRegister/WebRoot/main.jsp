<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="navigation.jsp" ></IFRAME> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
long idcard = Long.valueOf(String.valueOf(request.getSession().getAttribute("sessionidcard"))).longValue();
 %>
<head>
	<title>Minimalistic template-mianfeimoban.com</title>
	<meta http-equiv="Content-Language" content="English" />
	<meta name="Robots" content="index,follow" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="style/zhuyestyle.css" media="screen" />
<p style=line-height: 150%> 
</head>
<body>

<div id="wrap">
	<div id="subheader">
		
	</div>
    
    <div id="liucheng">
    <h>预约挂号流程</h>
    <p>方式一:直接点击预约挂号填写信息。</p>
    <p>方式二:按科室查询,选择相应科室的医生。</p>
    <p>方式三:填写病情，系统推荐相应医生。</p>
    <p>方式四:直接查询医生信息,完成预约挂号。</p></div>
    
	<div id="jianjie">
    <img src="images/hospital.jpg" />
    <h>医院简介</h>
    <p>XX医院创建于XXXX年，是集医疗、保健、教学、科研于一体的大型现代化综合性医院。医院是XX重要保健基地，承担XX/XX等多个体系单位、XX的医疗保健和各XX/XX转诊、后送的疑难病症治疗任务、医院同时又是XXX医学院，以
   研究生教育为主，是XXX唯一一所XX办学单位。</p>
    </div>
	
	<div id="main">
		<div id="rightside">
			<h2>常见问题:</h2>
			<div class="box"><ul>
			<li><a href="#" title="Articles">[医疗公告]就诊取药提示</a></li>
							<li><a href="#" title="Gallery">[医疗公告]如何预约挂号? </a></li>
							<li><a href="#" title="Affiliates">XXXXXXXX</a></li>
							<li><a href="#" title="Articles">XXXXXX</a></li>
							<li><a href="#" title="Abous us">XXXXXXX</a></li>
							<li><a href="#" title="Contact">XXXXXXXX</a></li>
			</ul></div>
			<h2>预防疾病小知识:</h2>
			<div class="box"><ul>
			<li><a href="#" title="#">如何预防诺拉病毒？</a></li>
							<li><a href="#" title="#">XXXXXXXX.</a></li>
							<li><a href="#" title="#">XXXXXXXX</a></li>
							<li><a href="#" title="#">XXXXXXXX.</a></li>
							<li><a href="#" title="#">XXXXXXXX</a></li>
							<li><a href="#" title="#">XXXXXXXXX</a></li>
			</ul></div>
			
			
		</div>
		
    
		<div id="liuyan">
		<script>
		function GetQueryString(name) {
   			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
   			var r = window.location.search.substr(1).match(reg);
   			if (r!=null) 
   			{
   			location.hash="#000";
   			return (r[2]);
   			}
   		 	return null;
		}
		GetQueryString("pid");
		</script>
        <h>留言区：</h>
         <IFRAME NAME="content_frame"  frameborder="0"  width=100% height=500 marginwidth=0 marginheight=0 SRC="MessagePageDetail.action"></IFRAME>
         <a name="000" id="000"><h>我要评论</h>
     	</a>
         
        <form  action="MessageAdd" method="get">
        	
            <textarea name="message.words" class="required" ></textarea>
             <input name="idcard" type="hidden"  value="<%=idcard%>"/>
           	 <input name="pid" type="hidden" value="<%=request.getParameter("pid") %>"/>
			
            <input type="submit" class="submit" value="提交" /> 
    		<input class="reset" type="button" value="重置" onclick="valid.reset(); return false" />
        </form>
        
   </div>
	
	
	
</div>
	
	
</body>
</html>