<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
String username = (String)request.getSession().getAttribute("sessionname");
 %>

<head>
	<title>Minimalistic template-mianfeimoban.com</title>
	<meta http-equiv="Content-Language" content="English" />
	<meta name="Robots" content="index,follow" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="style/style.css" media="screen" />
</head>
<body>

<div id="wrap">

	<div id="top">
				<div class="rights">	</div>
				<div id="search">
						<h2><li>当前用户:<%=username%></li>
						<br>
						<li><a href="index.jsp" target="_top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</a></li></h2>
					</div>
				<div class="lefts">
					<h1>自助挂号系统</h1>
					<h2></h2>
				</div>
	</div>
	
	<div id="topmenu">
				<div class="rights"></div>
				<div class="lefts"><ul>
				<li><a href="main.jsp" title="home" target="_top">首页</a></li>
							<li><a href="self_register_D.jsp" title="" target="_top">预约挂号</a></li>
							<li><a href="<s:url action="DoctorAll"></s:url>" target="_top">医生信息展示</a></li>
							<li><a href="Privateinf" target="_top">查看预约信息</a></a></li>
							<li><a href="depart1.jsp" title="" target="_top">按科室挂号</a></li>
							<li><a href="illness_advice.jsp" title="" target="_top">病情推荐</a></li>
							<li><a href="#" title="">ABOUTS US</a></li>
							<li><a href="#" title="">CONTACT</a></li>
				
				</ul></div>
	</div>
	
	
