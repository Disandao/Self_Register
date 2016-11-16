<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>医生详细信息</title>	
<link href="style/templatemo_style2.css" rel="stylesheet" type="text/css" />
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="navigation.jsp" ></IFRAME> 
<%
String doctorid = (String)request.getAttribute("id");
 %>
<p style=line-height: 150%>
</head>
<body>
<div id="templatemo_container_wrapper">
<div id="templatemo_container">
    <div id="templatemo_content">
    	<div id="templatemo_leftcolumn">
            <div class="post">
                
                <div class="postbody">
                    <h2>名字：<s:property value="doc.docName" /></a></h2>
                    <div class="tagline">职位:<s:property value="doc.docPos" /></span></div>
                <img src="images/photo04.gif" alt="post image" />
                    <div class="posttext">
	                    <p>
                        	个人信息：<s:property value="doc.docInfor" /><br>联系电话：<s:property value="doc.docTel" /></p>
                      <div class="comment_more"><input type="button" value="预约" onclick="window.location.href='self_register.jsp?id=<%=doctorid%>'"/></span></div>
                  </div>
                  
              </div>
            </div>

		</div>  <!-- end of left column -->
        

</div>
<div class="paiban">
<%
String[] week=(String[])request.getAttribute("week");

String monday = week[0];
String tuesday = week[1];
String wednesday = week[2];
String thursday = week[3];
String friday = week[4];
String saturday = week[5];
String sunday = week[6];

%>
  <script type="text/javascript">    
 function showTime(count){ 
  	var show_day=new Array('星期一','星期二','星期三','星期四','星期五','星期六','星期日'); 
  	var time=new Date(); 
  	//var year=time.getYear(); 
  	var month=time.getMonth(); 
  	var date=time.getDate()+count; 
  	var day=time.getDay()+count; 
  	//var hour=time.getHours(); 
  	//var minutes=time.getMinutes(); 
  	//var second=time.getSeconds(); 
 	 month<10?month='0'+month:month; 
  	month=month+1;
  	if(day%7==0)
  	{
  		day =7;
  	}
  	else
  	{
  		day = day%7;
  	}
  	
  	//hour<10?hour='0'+hour:hour; 
  	//minutes<10?minutes='0'+minutes:minutes; 
  	//second<10?second='0'+second:second; 
  	var now_time=month+'/'+date+' '+show_day[day-1]; 
  	document.getElementById(count).innerHTML=now_time; 
}
function s(s,a)
{
	if(parseInt(s)<6)
		document.getElementById(a).innerHTML="yes";
	else if(parseInt(s)>=6)
		document.getElementById(a).innerHTML="no";
}
</script>
<%
String first = "<script type='text/javascript'>showTime(0)</script>";
String second = "<script type='text/javascript'>showTime(1)</script>";
String third = "<script type='text/javascript'>showTime(2)</script>";
String forth = "<script type='text/javascript'>showTime(3)</script>";
String fifth = "<script type='text/javascript'>showTime(4)</script>";
String sixth = "<script type='text/javascript'>showTime(5)</script>";
String seventh = "<script type='text/javascript'>showTime(6)</script>";



 %>
<table align="center" width="100%" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF" bgcolor="#FFCC99"  >
  <tr align="center" bgcolor="#e3F4F7">
   <td width="5%" bgcolor="#F9D16B"></td>
    <td width="12%" bgcolor="#F9D16B" id=0><%=first%></td>  
    <td width="12%" bgcolor="#F9D16B" id=1><%=second%></td>
    <td width="12%" bgcolor="#F9D16B" id=2><%=third%></td>
    <td width="12%" bgcolor="#F9D16B" id=3><%=forth%></td>
    <td width="12%" bgcolor="#F9D16B" id=4><%=fifth%></td>
     <td width="12%" bgcolor="#F9D16B" id=5><%=sixth%></td>
    <td width="12%" bgcolor="#F9D16B" id=6><%=seventh%></td>
   
  </tr>
	
  <tr>
    <td style="padding:5px;"  name= ISBN align="center">8:00-10:00</td>  
    
   <td style="padding:5px;" align="center" id="a"><a href=""></a><script type='text/javascript'>s(<%=monday.charAt(0)%>,"a")</script></td>
    <td style="padding:5px;" align="center" id="b"><script type='text/javascript'>s(<%=tuesday.charAt(0)%>,"b")</script></td>  
    <td style="padding:5px;" align="center" id="c"><script type='text/javascript'>s(<%=wednesday.charAt(0)%>,"c")</script></td>  
    <td style="padding:5px;" align="center" id="d"><script type='text/javascript'>s(<%=thursday.charAt(0)%>,"d")</script></td>
    <td style="padding:5px;" align="center" id="e"><script type='text/javascript'>s(<%=friday.charAt(0)%>,"e")</script></td>  
	
    <td align="center" ><a href="" id="f"><script type='text/javascript'>s(<%=saturday.charAt(0)%>,"f")</script></a></td>
    <td align="center" ><a href="" id="g"><script type='text/javascript'>s(<%=sunday.charAt(0)%>,"g")</script></a></td>
  </tr>
  
  <tr>
    <td style="padding:5px;"  name= ISBN align="center">10:00-12:00</td>  
    
   <td style="padding:5px;" align="center" id="aa"><a href=""></a><script type='text/javascript'>s(<%=monday.charAt(1)%>,"aa")</script></td>
    <td style="padding:5px;" align="center" id="bb"><script type='text/javascript'>s(<%=tuesday.charAt(1)%>,"bb")</script></td>  
    <td style="padding:5px;" align="center" id="cc"><script type='text/javascript'>s(<%=wednesday.charAt(1)%>,"cc")</script></td>  
    <td style="padding:5px;" align="center" id="dd"><script type='text/javascript'>s(<%=thursday.charAt(1)%>,"dd")</script></td>
    <td style="padding:5px;" align="center" id="ee"><script type='text/javascript'>s(<%=friday.charAt(1)%>,"ee")</script></td>  
	
    <td align="center" ><a href="" id="ff"><script type='text/javascript'>s(<%=saturday.charAt(1)%>,"ff")</script></a></td>
    <td align="center" ><a href="" id="gg"><script type='text/javascript'>s(<%=sunday.charAt(1)%>,"gg")</script></a></td>
  </tr>
  <tr>
    <td style="padding:5px;"  name= ISBN align="center">13:00-15:00</td>  
    
    <td style="padding:5px;" align="center" id="aaa"><a href=""></a><script type='text/javascript'>s(<%=monday.charAt(2)%>,"aaa")</script></td>
    <td style="padding:5px;" align="center" id="bbb"><script type='text/javascript'>s(<%=tuesday.charAt(2)%>,"bbb")</script></td>  
    <td style="padding:5px;" align="center" id="ccc"><script type='text/javascript'>s(<%=wednesday.charAt(2)%>,"ccc")</script></td>  
    <td style="padding:5px;" align="center" id="ddd"><script type='text/javascript'>s(<%=thursday.charAt(2)%>,"ddd")</script></td>
    <td style="padding:5px;" align="center" id="eee"><script type='text/javascript'>s(<%=friday.charAt(2)%>,"eee")</script></td>  
	
    <td align="center" ><a href="" id="fff"><script type='text/javascript'>s(<%=saturday.charAt(2)%>,"fff")</script></a></td>
    <td align="center" ><a href="" id="ggg"><script type='text/javascript'>s(<%=sunday.charAt(2)%>,"ggg")</script></a></td>
  </tr>
  <tr>
    <td style="padding:5px;"  name= ISBN align="center">15:00-17:00</td>  
    
   <td style="padding:5px;" align="center" id="aaaa"><a href=""></a><script type='text/javascript'>s(<%=monday.charAt(3)%>,"aaaa")</script></td>
    <td style="padding:5px;" align="center" id="bbbb"><script type='text/javascript'>s(<%=tuesday.charAt(3)%>,"bbbb")</script></td>  
    <td style="padding:5px;" align="center" id="cccc"><script type='text/javascript'>s(<%=wednesday.charAt(3)%>,"cccc")</script></td>  
    <td style="padding:5px;" align="center" id="dddd"><script type='text/javascript'>s(<%=thursday.charAt(3)%>,"dddd")</script></td>
    <td style="padding:5px;" align="center" id="eeee"><script type='text/javascript'>s(<%=friday.charAt(3)%>,"eeee")</script></td>  
	
    <td align="center" ><a href="" id="ffff"><script type='text/javascript'>s(<%=saturday.charAt(3)%>,"ffff")</script></a></td>
    <td align="center" ><a href="" id="gggg"><script type='text/javascript'>s(<%=sunday.charAt(3)%>,"gggg")</script></a></td>
  </tr>

</table></td>
</div>
</body>
</html>