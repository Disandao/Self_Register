<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="js/scriptaculous/lib/prototype.js" type="text/javascript"></script>
<script src="js/scriptaculous/src/effects.js" type="text/javascript"></script>
<script type="text/javascript" src="js/validation.js"></script>
<script type="text/javascript">
//<![CDATA[
<!--
// Alternative Style: Working With Alternate Style Sheets
// http://www.alistapart.com/articles/alternate/
function setActiveStyleSheet(title) {
var i, a, main;
for(i=0; (a = document.getElementsByTagName("link")[i]); i++) {
if(a.getAttribute("rel").indexOf("style") != -1 && a.getAttribute("title")) {
a.disabled = true;
if(a.getAttribute("title") == title) a.disabled = false;
}
}
}
//-->
//]]>
</script>
<link title="style01" rel="stylesheet" href="style/style01.css" type="text/css" />
<link title="style02" rel="alternate stylesheet" href="style/style02.css" type="text/css" />
<link title="style03" rel="alternate stylesheet" href="style/style03.css" type="text/css" />
</head>
<body>
    <div class="style_changer">
    	
    </div>

	<div class="form_content">
    <form id="test" action="Patientinf" method="get">
    <fieldset>
        <legend>个人信息</legend>
        <div class="form-row">
            <div class="field-label"><label for="field1">姓名</label>:</div>
            <div class="field-widget"><input name="pa.name" id="field1" class="required" title="Enter your name" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field2">性别</label>:</div>
            <div class="field-widget"><input name="pa.sex" id="field2" class="required" title="Enter your sex" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field3">身份证号</label>:</div>
            <div class="field-widget"><input name="pa.idcard" id="field3" class="required" title="Enter your number" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field4">电话</label>:</div>
            <div class="field-widget"><input name="pa.tel" id="field4" class="required" title="Enter your name" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field5">科室</label>:</div>
            <div class="field-widget">
                <select id="field6" name="pa.office" class="validate-selection" title="Choose your department">
                    <option>Select one...</option>
                    <option>Accounts</option>
                    <option>Human Resources</option>
                    <option>Information Technology</option>
                    <option>Animal Management</option>
                    <option>Ultimate Frisby</option>
                </select>
            </div>
        </div>
    </fieldset>  
    <fieldset>
        
            
        <div class="form-row">
            <div class="field-label"><label for="field12">病情描述</label>:</div>
            <div class="field-widget"><textarea class="optional" name=pa.conditions></textarea></div>
        </div>
        
    </fieldset>
    <input type="submit" class="submit" value="提交" /> 
    <input class="reset" type="button" value="重置" onclick="valid.reset(); return false" />
    </form>
    </div>
    <script type="text/javascript">
        function formCallback(result, form) {
            window.status = "valiation callback for form '" + form.id + "': result = " + result;
        }
        
        var valid = new Validation('test', {immediate : true, onFormValidate : formCallback});
        Validation.addAllThese([
            ['validate-password', '> 6 characters', {
                minLength : 7,
                notOneOf : ['password','PASSWORD','1234567','0123456'],
                notEqualToField : 'field1'
            }],
            ['validate-password-confirm', 'please try again.', {
                equalToField : 'field8'
            }]
        ]);
    </script>

</body>
</html>