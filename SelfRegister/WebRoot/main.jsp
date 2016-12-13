<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="navigation.jsp" frameborder="no"></IFRAME> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
long idcard = Long.valueOf(String.valueOf(request.getSession().getAttribute("sessionidcard"))).longValue();
 %>
<head>
	<title>自助挂号系统</title>
	<meta http-equiv="Content-Language" content="English" />
	<meta name="Robots" content="index,follow" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="style/zhuyestyle.css" media="screen" />
<p style=line-height: 150%> 
</head>
<body>

<div id="wrap">
	<div id="subheader">
		<IFRAME NAME="main" width=100% height=600px marginwidth=0 marginheight=0 SRC="slider/index.html" frameborder="no"></IFRAME> 
	</div>
    
    <div id="liucheng">
    <h>预约挂号流程</h>
    <p style="opacity:0">ss</p>
    <table>
    	<tr>
        <td>方式一：</td>
        	<td>按医生预约</td>
            <td>点击医生</td>
            <td>查看排班</td>
            <td>选择时段</td>
            <td>填写信息</td>
            <td>挂号成功</td>
        </tr>
        <tr>
        <td>方式二：</td>
        	<td>按科室预约</td>
            <td>选择科室</td>
            <td>选择医生</td>
            <td>查看排班</td>
            <td>选择时段</td>
            <td>填写信息</td>
            <td>挂号成功</td>
        </tr>
        <tr>
        <td>方式三：</td>
        	<td>按病情推荐</td>
            <td>选择部位</td>
            <td>选择病情</td>
            <td>推荐科室</td>
            <td>选择医生</td>
            <td>挂号成功</td>
        </tr>
    </table>
    
	
	
	<div id="main">
		<div id="rightside">
			<h2>联系方式</h2>
			<div class="box"><ul>
			<li>电话：12345678910</li>
							<li>微信公众号：guahao123</li>
							<li>网址：http://www.xxx.com</li>
							<li style="opacity:0">s</li><li style="opacity:0">s</li><li style="opacity:0">s</li><li style="opacity:0">s</li><li style="opacity:0">s</li>
							

			</ul></div>
			<h2>常见问题:</h2>
			<div class="box"><ul>
			<li><a href="#" title="Articles">[医疗公告]就诊取药提示</a></li>
							<li><a href="#" title="Gallery">[医疗公告]如何预约挂号? </a></li>
							<li><a href="#" title="Affiliates">[医疗公告]冬季治脚气千万别错过</a></li>
							<li><a href="#" title="Articles">[医疗公告]慢性眼病,膏方调补</a></li>
							<li><a href="#" title="Abous us">[医疗公告]腰腿疼可能是神经在惹祸</a></li>
							<li><a href="#" title="Contact">[医疗公告]感冒重复用药你中招了吗？</a></li>
			</ul></div>
			<h2>预防疾病小知识:</h2>
			<div class="box"><ul>
			<li><a href="#" title="#">如何预防诺拉病毒？</a></li>
							<li><a href="#" title="#">如何预防心脑血管病？</a></li>
							<li><a href="#" title="#">如何预防流感？</a></li>
							<li><a href="#" title="#">如何预防脚气?</a></li>
							<li><a href="#" title="#">如何护理糖尿病?</a></li>
							<li><a href="#" title="#">女性如何预防妇科疾病?</a></li>
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