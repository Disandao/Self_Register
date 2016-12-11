<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        <!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en-US"> <![endif]-->
        <!--[if IE 7]>    <html class="lt-ie9 lt-ie8" lang="en-US"> <![endif]-->
        <!--[if IE 8]>    <html class="lt-ie9" lang="en-US"> <![endif]-->
        <!--[if gt IE 8]><!--> <html lang="en-US"> <!--<![endif]-->
   
        <head>
                <!-- META TAGS -->
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

                <title>Knowledge Base Theme</title>
                <!-- Style Sheet-->
                
                <link rel='stylesheet' id='bootstrap-css-css'  href='style/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
                
                <link rel='stylesheet' id='main-css-css'  href='style/main5152.css?ver=1.0' type='text/css' media='all' />


        </head>

        <body>


                
                <!-- Start of Page Container -->
                <div class="page-container">
                        <div class="container">
                                <div class="row">

                                        <!-- start of page content -->
                                        <div class="span8 main-listing">
												<s:iterator value="#request.pageBean.list" status="L" id="message">
                                                <article class="format-standard type-post hentry clearfix" id=<s:property value="#L.index+1"/>>

                                                        <header class="clearfix">

                                                                <h3 class="post-title">
                                                                        <s:property value="#message.user.name" />
                                                                       	
                                                                </h3>

                                                                <div class="post-meta clearfix">
                                                                        <span class="date"> <s:property value="#message.time" /></span>
                                                                        <span class="category">回复留言：<s:property value="#message.pidName" /></a></span>
                                                                        <span class="comments"><a href="main.jsp?pid=${message.messageId}" target="_parent">回复</a></span>
                                                                        <span class="like-count"><a href="<s:url action="MessagePageDetail"> <s:param name="message_id" value="#message.messageId"></s:param></s:url>"><s:property value="#message.agree" /></a></span>
                                                                </div><!-- end of post meta -->

                                                        </header>

                                                        <p> <s:property value="#message.words" /></p>

                                                </article>
												</s:iterator>
                                               

                                                <center>
    	 <font size="5">共<font color="red"><s:property value="#request.pageBean.currentPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#request.pageBean.totalPage"/></font>页 </font>&nbsp;&nbsp;
        
       	<br><br>
        <s:if test="#request.pageBean.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="MessagePageDetail.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="MessagePageDetail.action?page=<s:property value="#request.pageBean.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#request.pageBean.currentPage != #request.pageBean.totalPage">
            <a href="MessagePageDetail.action?page=<s:property value="#request.pageBean.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="MessagePageDetail.action?page=<s:property value="#request.pageBean.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center>

                                        </div>
                                        <!-- end of page content -->


                                        