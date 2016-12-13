<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="style/alogin.css" rel="stylesheet" type="text/css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医院自助挂号系统登录 </title>
</head>
<%
String error = (String)request.getAttribute("error");
 %>
<script type="text/javascript">

	
	function loadimage(){
		document.getElementById("randImage").src = "image.jsp?"+Math.random();
	}
</script>
<%
String s=(String)request.getAttribute("sRand");
request.setAttribute("sRand",s);
%>
<body>
<form id="form" action="Login" method="post">
    <div class="Main">
        <ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB"><span>
                <img src="images/login/logo.png" />
            </span></li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li><span class="left">用户名:</span> <span style="left">
                        <input type="text"  name="user.name" id="userName"/>  
                     
                    </span></li>
                    <li><span class="left">密    码:</span> <span style="left">
                       <input type="password"  name="user.password" id="password"/>  
                    </span></li>
                    
                    <li><span class="left">用户:</span> <span style="left">
                    <select name="user.id" class="wenbenkuang" id="f">
        				<option value="1"selected>病人</option>
       					<option value="2">医生</option>
        				<option value="3">管理员</option>
       		           </select>
                        
                     
                    </span></li>
                         <li><span class="left">验证码:</span> <span style="left">
                         <input type="text" value="${imageCode }" name="imageCode" id="imageCode" size="10"/>
                    </span>
                    <span style="left">
                       <img onclick="javascript:loadimage();"  title="换一张试试" name="randImage" id="randImage" src="image.jsp" width="60" height="20" border="1" align="absmiddle">
                    </span>
                    </li>
                
                </ul>
                  
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C">
            <span style="margin:15px"><input type="submit" value="登录" onclick="ale()"/></span>
            <span style="margin:10px"><input type="button" value="注册" onclick="window.location.href='register.jsp'"/></span>
 
             <td style="font-size:25px;color:red;font-family:Microsoft YaHei"><%=error%></td>
            </li>
                   
            <li class="middle_D"></li>
            <li class="bottom_A"></li>
            <li class="bottom_B">
            
            www.java1234.com
            </li>
        </ul>
    </div>
    </form>
</body>
</html>