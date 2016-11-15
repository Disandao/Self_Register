<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>科室</title>
<style>
body {
    padding: 0;
    margin: 0;
    font-size: 12px;
    font-family: "Hiragino Sans GB","Microsoft YaHei","微软雅黑","宋体",Arial,Verdana,sans-serif;
    background: #fff;
    color: #4c4948;
}
/*按科室挂号下面内容*/
#ksgh_c_content{width:1000px;margin:0 auto;overflow:hidden;position:relative;}

/*左侧*/
.ksgh_c_left{width:211px;overflow:hidden;}
.ksgh_c_left,.ksgh_c_right{float:left;}
#ksgh_c_guid{width:209px;	border: 1px solid #dcdddd;}
#ksgh_c_guid ul.ksgh_c_nav li {cursor: pointer;width: 209px;height: 34px;text-align:left;line-height: 24px;margin:0 auto;}
#ksgh_c_guid ul.ksgh_c_nav li a{font-size:13px;width: 200px;height: 26px;display: block;color: #555;text-decoration: none;background:url(../images/ksgh_jt.png) 192px center no-repeat;_background:url(../images/ksgh_jt_1.png) 192px center no-repeat;padding:4px 0px 4px 9px;}
#ksgh_c_guid ul.ksgh_c_nav li a:hover{color:#54c2f0;}
.ksgh_c_nav_color{background:#1fa4f0;}
#ksgh_c_guid ul.ksgh_c_nav li .ksgh_c_nav_a{background:url(../images/ksgh_jt1.png) 192px center no-repeat;_background:url(../images/ksgh_jt1_1.png) 192px center no-repeat;color: #ffffff}
#ksgh_c_guid ul.ksgh_c_nav li .ksgh_c_nav_a:hover{color:#fff;}

.ksgh_c_nav li span{display:inline-block;background:url(../../hps/icon/index_icon.jpg) 0 0 no-repeat;width:22px;height:22px;font-size:1px;vertical-align: bottom;margin-right:4px;}




	/*内科*/
	.ksgh_c_nav li .ksgh_aico1{background-position: 0px 0px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico1{background-position:-22px 0px;}
	/*外科*/
	.ksgh_c_nav li .ksgh_aico2{background-position: 0px -22px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico2{background-position:-22px -22px;}	
	/*妇产科*/
	.ksgh_c_nav li .ksgh_aico3{background-position: 0px -44px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico3{background-position:-22px -44px;}
	/*生殖中心*/
	.ksgh_c_nav li .ksgh_aico4{background-position: 0px -66px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico4{background-position:-22px -66px;}
	/*儿科*/
	.ksgh_c_nav li .ksgh_aico5{background-position: 0px -88px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico5{background-position:-22px -88px;}
	/*骨外科*/
	.ksgh_c_nav li .ksgh_aico6{background-position: 0px -110px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico6{background-position:-22px -110px;}
	/*眼科*/
	.ksgh_c_nav li .ksgh_aico7{background-position: 0px -132px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico7{background-position:-22px -132px;}
	/*口腔科*/
	.ksgh_c_nav li .ksgh_aico8{background-position: 0px -154px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico8{background-position:-22px -154px;}
	/*耳鼻咽喉头颈科*/
	.ksgh_c_nav li .ksgh_aico9{background-position: 0px -176px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico9{background-position:-22px -176px;}
	/*肿瘤科*/
	.ksgh_c_nav li .ksgh_aico10{background-position: 0px -198px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico10{background-position:-22px -198px;}
	/*皮肤性病科*/
	.ksgh_c_nav li .ksgh_aico11{background-position: 0px -220px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico11{background-position:-22px -220px;}
	/*男性学科*/
	.ksgh_c_nav li .ksgh_aico12{background-position: 0px -242px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico12{background-position:-22px -242px;}
	/*医疗美容*/
	.ksgh_c_nav li .ksgh_aico13{background-position: 0px -264px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico13{background-position:-22px -264px;}
	/*烧伤科*/
	.ksgh_c_nav li .ksgh_aico14{background-position: 0px -286px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico14{background-position:-22px -286px;}
	/*精神心理科*/
	.ksgh_c_nav li .ksgh_aico15{background-position: 0px -308px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico15{background-position:-22px -308px;}
	/*中医科*/
	.ksgh_c_nav li .ksgh_aico16{background-position: 0px -330px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico16{background-position:-22px -330px;}
	/*中西医结合科*/
	.ksgh_c_nav li .ksgh_aico17{background-position: 0px -352px;}	
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico17{background-position:-22px -352px;}
	/*感染性疾病科*/
	.ksgh_c_nav li .ksgh_aico18{background-position: 0px -374px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico18{background-position:-22px -374px;}
	/*结核病科*/
	.ksgh_c_nav li .ksgh_aico19{background-position: 0px -396px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico19{background-position:-22px -396px;}
	/*介入医学科*/
	.ksgh_c_nav li .ksgh_aico20{background-position: 0px -418px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico20{background-position:-22px -418px;}
	/*康复医学科*/
	.ksgh_c_nav li .ksgh_aico21{background-position: 0px -440px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico21{background-position:-22px -440px;}
	/*运动医学科*/
	.ksgh_c_nav li .ksgh_aico22{background-position: 0px -462px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico22{background-position:-22px -462px;}
	/*麻醉学科*/
	.ksgh_c_nav li .ksgh_aico23{background-position: 0px -484px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico23{background-position:-22px -484px;}
	/*职业病科*/
	.ksgh_c_nav li .ksgh_aico24{background-position: 0px -506px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico24{background-position:-22px -506px;}
	/*地方病科*/
	.ksgh_c_nav li .ksgh_aico25{background-position: 0px -528px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico25{background-position:-22px -528px;}
	/*营养科*/
	.ksgh_c_nav li .ksgh_aico26{background-position: 0px -550px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico26{background-position:-22px -550px;}
	/*医学影像学*/
	.ksgh_c_nav li .ksgh_aico27{background-position: 0px -572px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico27{background-position:-22px -572px;}
	/*病理科*/
	.ksgh_c_nav li .ksgh_aico28{background-position: 0px -594px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico28{background-position:-22px -594px;}
	/*其他*/
	.ksgh_c_nav li .ksgh_aico29{background-position: 0px -616px;}
	.ksgh_c_nav .ksgh_c_nav_color .ksgh_aico29{background-position:-22px -616px;}




/*右侧*/
.ksgh_c_right{ width: 735px;overflow: hidden;border: 1px solid #dcdddd;padding-top: 23px;padding-left: 18px;padding-right: 15px;  margin-left: 17px;   margin-bottom: 22px;  font-size: 12px;}
.ksgh_c_right_p{border-bottom:1px dashed #dcdddd;}
.ksgh_c_right_p span{    display: inline-block;width: 117px;height: 34px;text-align: left;line-height: 34px;border-bottom: none;color: #00B3EA;padding-left: 22px;    font-size: 13px;}
.ksgh_c_right_table{width:672px;overflow: hidden;}
.ksgh_c_right_table tr td{text-align:left;width:120px;}
.ksgh_c_right_table tr td a{color:#777; line-height: 26px;}
.ksgh_c_right_table tr td a:hover{color:#006DB3;}
.ksgh_c_right_table{margin:10px 0 10px 19px;}

div {
    display: block;
}


</style>
<IFRAME NAME="content_frame" width=100% height=150 marginwidth=0 marginheight=0 SRC="navigation.jsp" ></IFRAME>
</head>

<body>
	<div id="ksgh_c_content">
		<div class="ksgh_c_left">
			<div id="ksgh_c_guid">
				<ul class="ksgh_c_nav" style=" border:none;">
					<li><a href="#ks1"><span class="ksgh_aico1"></span>内科</a></li>
					<li><a href="#ks2"><span class="ksgh_aico2"></span>外科</a></li>
					<li><a href="#ks3"><span class="ksgh_aico3"></span>妇产科</a></li>
					<li><a href="#ks4"><span class="ksgh_aico4"></span>生殖中心</a></li>
					<li><a href="#ks5"><span class="ksgh_aico5"></span>儿科</a></li>
					<li><a href="#ks6"><span class="ksgh_aico6"></span>骨外科</a></li>
					<li><a href="#ks7"><span class="ksgh_aico7"></span>眼科</a></li>
					<li><a href="#ks8"><span class="ksgh_aico8"></span>口腔科</a></li>
					<li><a href="#ks9"><span class="ksgh_aico9"></span>耳鼻咽喉头颈科</a></li>
					<li><a href="#ks10"><span class="ksgh_aico10"></span>肿瘤科</a></li>
					<li><a href="#ks11"><span class="ksgh_aico11"></span>皮肤性病科</a></li>
					<li><a href="#ks12"><span class="ksgh_aico12"></span>男性学科</a></li>
					<li><a href="#ks13"><span class="ksgh_aico13"></span>皮肤美容</a></li>
					<li><a href="#ks14"><span class="ksgh_aico14"></span>烧伤科</a></li>
					<li><a href="#ks15"><span class="ksgh_aico15"></span>精神心理科</a></li>
					<li><a href="#ks16"><span class="ksgh_aico16"></span>中医科</a></li>
					<li><a href="#ks17"><span class="ksgh_aico17"></span>中西医结合科</a></li>
					<li><a href="#ks18"><span class="ksgh_aico18"></span>传染病科</a></li>
					<li><a href="#ks19"><span class="ksgh_aico19"></span>结核病科</a></li>
					<li><a href="#ks20"><span class="ksgh_aico20"></span>介入医学科</a></li>
					<li><a href="#ks21"><span class="ksgh_aico21"></span>康复医学科</a></li>
					<li><a href="#ks22"><span class="ksgh_aico22"></span>运动医学科</a></li>
					<li><a href="#ks23"><span class="ksgh_aico23"></span>麻醉医学科</a></li>
					<li><a href="#ks24"><span class="ksgh_aico24"></span>职业病科</a></li>
					<li><a href="#ks25"><span class="ksgh_aico25"></span>地方病科</a></li>
					<li><a href="#ks26"><span class="ksgh_aico26"></span>营养科</a></li>
					<li><a href="#ks27"><span class="ksgh_aico27"></span>医学影像学</a></li>
					<li><a href="#ks28"><span class="ksgh_aico28"></span>病理科</a></li>
					<li style="border-bottom-width: 0px;"><a href="#ks29"><span
							class="ksgh_aico29"></span>其他科室</a></li>
				</ul>
			</div>
		</div>
		<div class="ksgh_c_right">
			<p class="ksgh_c_right_p">
				<a name="ks1"></a><span>内科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="<s:url action="DoctorList"> <s:param name="departName" value="{'心血管内科'}"></s:param></s:url>">心血管内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,31.htm">神经内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,32.htm">消化内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,33.htm">内分泌科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,34.htm">免疫科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,35.htm">呼吸科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,36.htm">肾病内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,37.htm">血液科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,38.htm">感染内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,39.htm">过敏反应科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,40.htm">老年病科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,41.htm">普通内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,42.htm">高压氧科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks2"></a><span>外科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,43.htm">神经外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,44.htm">功能神经外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,45.htm">心血管外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,46.htm">胸外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,47.htm">整形科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,48.htm">乳腺外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,49.htm">泌尿外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,50.htm">肝胆外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,51.htm">肛肠科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,52.htm">血管外科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,53.htm">器官移植</a></td>
						<td><a href="/dpt/hps/1,0,0,0,54.htm">微创外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,55.htm">普外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,198.htm">脑外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,199.htm">烧伤科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks3"></a><span>妇产科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,56.htm">妇科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,57.htm">产科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,58.htm">妇科内分泌</a></td>
						<td><a href="/dpt/hps/1,0,0,0,59.htm">妇泌尿科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,61.htm">遗传咨询科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,62.htm">计划生育科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,63.htm">妇产科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks4"></a><span>生殖中心</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,64.htm">生殖中心</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks5"></a><span>儿科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,65.htm">儿科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,66.htm">新生儿科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,67.htm">小儿呼吸科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,69.htm">小儿营养保健科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,71.htm">小儿心内科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,75.htm">小儿皮肤科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,79.htm">小儿精神科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,81.htm">小儿外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,82.htm">小儿心外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,84.htm">小儿骨科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,86.htm">小儿神经外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,88.htm">小儿康复科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks6"></a><span>骨外科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,90.htm">骨科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,91.htm">脊柱外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,92.htm">手外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,93.htm">创伤骨科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,94.htm">骨关节科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,95.htm">矫形骨科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,96.htm">骨质疏松科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,203.htm">骨伤专科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks7"></a><span>眼科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,97.htm">眼科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,98.htm">小儿眼科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,99.htm">眼底</a></td>
						<td><a href="/dpt/hps/1,0,0,0,100.htm">角膜科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,101.htm">青光眼</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,102.htm">白内障</a></td>
						<td><a href="/dpt/hps/1,0,0,0,103.htm">眼外伤</a></td>
						<td><a href="/dpt/hps/1,0,0,0,104.htm">眼眶及肿瘤</a></td>
						<td><a href="/dpt/hps/1,0,0,0,105.htm">屈光</a></td>
						<td><a href="/dpt/hps/1,0,0,0,106.htm">眼整形</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,107.htm">中医眼科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks8"></a><span>口腔科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,108.htm">口腔科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,109.htm">颌面外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,110.htm">正畸科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,111.htm">牙体牙髓科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,112.htm">牙周科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,113.htm">口腔粘膜科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,114.htm">儿童口腔科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,115.htm">口腔修复科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,116.htm">种植科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,117.htm">口腔预防科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,118.htm">口腔特诊科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,119.htm">口腔急诊科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks9"></a><span>耳鼻咽喉头颈科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,120.htm">耳鼻喉</a></td>
						<td><a href="/dpt/hps/1,0,0,0,121.htm">头颈外科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks10"></a><span>肿瘤科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,122.htm">肿瘤内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,123.htm">肿瘤外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,124.htm">肿瘤妇科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,125.htm">放疗科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,126.htm">骨肿瘤科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,127.htm">肿瘤康复科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,128.htm">肿瘤综合科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks11"></a><span>皮肤性病科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,129.htm">皮肤科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,130.htm">性病科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks12"></a><span>男性学科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,131.htm">男性学科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks13"></a><span>皮肤美容</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,132.htm">皮肤美容</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks14"></a><span>烧伤科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,133.htm">烧伤科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks15"></a><span>精神心理科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,134.htm">精神科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,135.htm">心理咨询科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,136.htm">司法鉴定科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,137.htm">双相障碍科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,138.htm">药物依赖科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks16"></a><span>中医科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,139.htm">中医妇产科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,140.htm">中医儿科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,141.htm">中医骨科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,142.htm">中医皮肤科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,143.htm">中医内分泌</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,144.htm">中医消化科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,145.htm">中医呼吸科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,146.htm">中医肾病内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,147.htm">中医免疫内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,148.htm">中医心内科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,149.htm">中医神经内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,150.htm">中医肿瘤科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,151.htm">中医血液科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,153.htm">中医肝病科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,154.htm">中医五官科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,155.htm">中医男科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,156.htm">针灸科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,157.htm">中医按摩科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,158.htm">中医外科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,159.htm">中医乳腺外科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,160.htm">中医肛肠科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,161.htm">中医老年病科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,162.htm">中医科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,205.htm">中医内科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,206.htm">中医脾胃科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,207.htm">膏方门诊</a></td>
						<td><a href="/dpt/hps/1,0,0,0,208.htm">中医骨伤科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks17"></a><span>中西医结合科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,163.htm">中西医结合科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks18"></a><span>传染病科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,164.htm">肝病科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,165.htm">传染科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks19"></a><span>结核病科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,167.htm">结核病科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks20"></a><span>介入医学科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,168.htm">介入医学科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks21"></a><span>康复医学科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,169.htm">康复科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,170.htm">理疗科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks22"></a><span>运动医学科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,171.htm">运动医学科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks23"></a><span>麻醉医学科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,172.htm">疼痛科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,173.htm">麻醉科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks24"></a><span>职业病科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,174.htm">职业病科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks25"></a><span>地方病科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,175.htm">地方病科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks26"></a><span>营养科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,176.htm">营养科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks27"></a><span>医学影像学</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,177.htm">核医学科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,178.htm">放射科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,179.htm">超声科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,180.htm">医学影像科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks28"></a><span>病理科</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,181.htm">病理科</a></td>
					</tr>
				</tbody>
			</table>
			<p class="ksgh_c_right_p">
				<a name="ks29"></a><span>其他科室</span>
			</p>
			<table width="672" height="44" border="0" class="ksgh_c_right_table">
				<tbody>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,182.htm">急诊科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,183.htm">特色医疗科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,184.htm">干部诊疗科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,185.htm">重症监护室</a></td>
						<td><a href="/dpt/hps/1,0,0,0,186.htm">特诊科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,187.htm">检验科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,188.htm">预防保健科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,189.htm">功能检查科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,190.htm">全科</a></td>
						<td><a href="/dpt/hps/1,0,0,0,192.htm">体检科</a></td>
					</tr>
					<tr>
						<td><a href="/dpt/hps/1,0,0,0,193.htm">血透中心</a></td>
						<td><a href="/dpt/hps/1,0,0,0,194.htm">实验中心</a></td>
						<td><a href="/dpt/hps/1,0,0,0,195.htm">碎石中心</a></td>
						<td><a href="/dpt/hps/1,0,0,0,209.htm">变态反应科</a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
