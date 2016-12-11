<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="po.Patientinf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="style/Untitled-2.css" rel="stylesheet" type="text/css" />
<IFRAME frameborder="no" NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="doctor_navigation.jsp"></IFRAME> 
</head>

<body>


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
              <td valign="middle" align="center" style="font-size:42px;color:red;font-family:Microsoft YaHei" bgcolor="#FFCC99">
暂无病人信息
</td>
            </tr>
          </table>
          <table width="100%"  border="0" cellspacing="0" cellpadding="0" bgcolor="#FFCC99">
  <tr>
  <%
}else{
%>
<table id="customers">
<tr>
<th>科室</th>
<th>性别</th>
<th>姓名</th>
<th>身份证</th>
<th>电话</th>
<th>病情描述</th>
</tr>
<% 
Iterator it=coll.iterator();
String conditions="";
long idcard=0;
String name="";
String office="";
String sex="";
String tel="";
  while(it.hasNext()){
    Patientinf patient=(Patientinf)it.next();
	office = patient.getOffice();
	sex = patient.getSex();
	name = patient.getName();
	idcard = patient.getIdcard();
	tel = patient.getTel();
	conditions = patient.getConditions();
	%> 
	
  <tr>
    <td style="padding:5px;"  name= ISBN align="center">&nbsp;<%=office%></td>  
    
   <td style="padding:5px;" align="center"><%=sex%></a></td>
    <td style="padding:5px;" align="center">&nbsp;<%=name%></td>  
    <td style="padding:5px;" align="center">&nbsp;<%=idcard%></td>  
    <td style="padding:5px;" align="center">&nbsp;<%=tel%></td>
    <td style="padding:5px;" align="center">&nbsp;<%=conditions%></td>  

  </tr>
<%
  }
}
%>  



</table>
</body>
</html>
