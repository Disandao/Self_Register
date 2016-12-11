<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="po.Patientinf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
List doctor=new ArrayList();
doctor = (List)request.getAttribute("doctor");
List name=new ArrayList();
name = (List)request.getAttribute("name");
List Static=new ArrayList();
Static = (List)request.getAttribute("StatisticD");
%>
 <td align="center" valign="top">
<table id="customers">
<tr>
<th>ID</th>
<th>姓名</th>
<th>人数</th>
</tr>
<% 
Iterator it=doctor.iterator();
Iterator nu=Static.iterator();
Iterator na=name.iterator();
String doc="";
String num="";
String nam="";
  while(it.hasNext()){
	doc = (String)it.next();
	num = (String)nu.next();
	nam = (String)na.next();
	%> 
	
  <tr>
    <td style="padding:5px;"  name= ISBN align="center"><%=doc%></td>  
    <td style="padding:5px;" align="center"><%=nam%></a></td>
   <td style="padding:5px;" align="center"><%=num%></a></td>

  </tr>
<%
  }
%>  



</table>
</body>
</html>
