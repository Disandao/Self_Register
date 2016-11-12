<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="style/alogin.css" rel="stylesheet" type="text/css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社区医院远程挂号系统注册 </title>
</head>

<body>
<form id="form" action="Register" method="post">
    <div class="Main">
        <ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB"><span>
                <img src="images/login/logo.png" alt="" style="" />
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
                         <li><span class="left">身份证:</span> <span style="left">
                         <input type="text"  name="user.idcard" id="idcard" size="20"/>
                    </span>
                    
                    </li>
                  
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C">
            <span style="margin:15px"><input type="submit" value="注册"/></span>
            <span style="margin:10px"><input type="button" value="返回" onClick="history.back()"/></span>
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