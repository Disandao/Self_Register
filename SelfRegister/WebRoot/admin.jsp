<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="po.Patientinf"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
String username = (String)request.getSession().getAttribute("admin");
 %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="style/Untitled-2.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="style/style.css" media="screen" />

</head>

<body>
<div id="wrap">

	<div id="top">
				<div class="rights">	</div>
				<div id="search">
						<h2><li><%=username%></li>
						<br>
						<li><a href="index.jsp" target="_top">退出</a></li></h2>
					</div>
				<div class="lefts">
					<h1>用户挂号信息</h1>
					<h2></h2>
				</div>
	</div>
	
	<div id="topmenu">
				<div class="rights"></div>
				<div class="lefts"><ul>
				<li><a href="PatientALL" title="home" target="_top">首页</a></li>
							<li><a href="StatisticF" title="" target="_top">按科室统计信息</a></li>
							<li><a href="StatisticD" target="_top">按医生统计信息</a></li>

				
				</ul></div>
	</div>

<%

List coll=new ArrayList();
coll = (List)request.getAttribute("patients");
%>
 <td align="center" valign="top">
<%
if(coll==null || coll.isEmpty()){
%>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0"><tr><td align="center" valign="middle">
          <table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
          
            <tr>
              <td valign="middle" align="center" style="font-size:42px;color:red;font-family:Microsoft YaHei ;padding:100px" >
抱歉，暂无挂号信息！</td>
</td>
            </tr>
          </table>
          <table width="100%"  border="0" cellspacing="0" cellpadding="0" bgcolor="#FFCC99">
  <tr>
  <%
}else{
%>
<table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td valign="middle" align="center" style="font-size:40px;color:black;font-family:Microsoft YaHei; padding-top:50px;padding-bottom:100px" >以下是所有挂号信息:
</td>
            </tr>
          </table>
<table id="customers">
<tr>
<th>所属用户</th>
<th>科室</th>
<th>性别</th>
<th>姓名</th>
<th>身份证</th>
<th>电话</th>
<th>病情</th>
<th>操作</th>
</tr>
<% 
Iterator it=coll.iterator();
String conditions="";
long idcard=0;
String name="";
String office="";
String sex="";
String tel="";
String user="";
  while(it.hasNext()){
    Patientinf patient=(Patientinf)it.next();
	office = patient.getOffice();
	sex = patient.getSex();
	name = patient.getName();
	idcard = patient.getIdcard();
	tel = patient.getTel();
	conditions = patient.getConditions();
	user = patient.getUsername();
	%> 
	
  <tr>
  <td style="padding:5px;"  name= ISBN align="center">&nbsp;<%=user%></td>  
    <td style="padding:5px;"  name= ISBN align="center">&nbsp;<%=office%></td>  
    
   <td style="padding:5px;" align="center"><%=sex%></a></td>
    <td style="padding:5px;" align="center">&nbsp;<%=name%></td>  
    <td style="padding:5px;" align="center">&nbsp;<%=idcard%></td>  
    <td style="padding:5px;" align="center">&nbsp;<%=tel%></td>
    <td style="padding:5px;" align="center">&nbsp;<%=conditions%></td>  
	<td style="padding:5px; " ><a href="DeleteRegister?idcard=<%=idcard%>" style="color:#000000" >删除</a></td>
  </tr>
<%
  }
}
%>  



</table>
</body>
</html>
