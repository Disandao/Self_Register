<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Blog Template - Free CSS Website-mianfeimoban.com</title>
<meta name="keywords" content="Blog Template, Free CSS Website, templatemo" />
<meta name="description" content="Blog Template Layout - Free CSS Website from TemplateMo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="main/index.html" ></IFRAME> 
<p style=line-height: 150%>
</head>
<body>
<div id="templatemo_container_wrapper">
<div id="templatemo_container">
    <div id="templatemo_content">
    	<div id="templatemo_leftcolumn">
           	<h2><s:property value="%{departName}" /><br/><br/><br/></h2>
    		<s:iterator value="list_doc" status="L">
            <div class="post" id=<s:property value="#L.index+1"/>>
            	
                <div class="postdate"><s:property value="#L.index+1"/>
                  </div>
                <div class="postbody">
                    <h2><a href=""><s:property value="docName" /></a></h2>
                    <div class="tagline">职位：<s:property value="docPos" /></span></div>
                <img src="images/photo04.gif" alt="post image" />
                    <div class="posttext">
	                    <p>个人信息：<s:property value="docInfor" /><br>联系电话：<s:property value="docTel" /></p>
                      <div class="comment_more"><a href="#">预约</a></div>
                  </div>
              </div>
            </div>
			</s:iterator>
  <div class="paging">
            	<a href="#1">1</a><a href="#2">2</a><a href="#3">3</a><a href="#4">4</a><a href="#">next</a>                
            </div>
            
		</div>  <!-- end of left column -->
        
        <div id="templatemo_rightcolumn">
        
        	<div class="rc_panel">
                <div class="rc_panelbody">
                    <form method="post" action="#">
                      <input class="textfield" name="search" type="text" value="Search..." id="keyword"/> <input class="button" type="submit" name="Submit" value="Go" />
                    </form>
                </div>
			</div>
		</div>
</div>
	</div>
	</div>		
</body>
</html>			
