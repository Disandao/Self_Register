<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>科室医生</title>
<meta name="keywords" content="Blog Template, Free CSS Website, templatemo" />
<meta name="description" content="Blog Template Layout - Free CSS Website from TemplateMo.com" />
<link href="style/templatemo_style.css" rel="stylesheet" type="text/css" />
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="navigation.jsp" ></IFRAME> 
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
                    <h2><a href="<s:url action="DoctorDetail"> <s:param name="docId" value="docId"></s:param></s:url>">
<s:property value="docName" /></a></h2>
                    <div class="tagline">职位：<s:property value="docPos" /></span></div>
                <img src="images/photo04.gif" alt="post image" />
                    <div class="posttext">
	                    <p>个人信息：<s:property value="docInfor" /><br>联系电话：<s:property value="docTel" /></p>
                      
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
                   <s:form action="DoctorSearch" theme="simple"> 
                     	<s:textfield label="医生名字" name="docName" value="查询医生..."/>
   						<s:submit value="Go" cssStyle="width:40px;"/>     
     				</s:form>
                </div>
			</div>
		</div>
</div>
	</div>
	</div>		
</body>
</html>			
