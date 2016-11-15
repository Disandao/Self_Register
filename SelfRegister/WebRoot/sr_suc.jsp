<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%

response.setHeader("refresh", "3;URL=main.jsp");//这里的3,是你要确定的时间秒URL是要跳转的地址
%>
<font color="red" size="5"> 预约成功<br> <br>
三秒后将跳转到主页面 <br> <br> 如果没有跳转,请按 <a href="main.jsp">这里</a>!!!
<br> </font>
