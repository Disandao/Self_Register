<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
  	<s:iterator value="list_depart">
   <tr>
      	<td><a href="<s:url action="DoctorList"> <s:param name="departName" value="departName"></s:param></s:url>"><s:property value="departName" /></a></td>
   </tr>
   </s:iterator>
  </body>
</html>
