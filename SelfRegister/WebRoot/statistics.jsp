 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml"> 
<head> 
<title>js柱状统计图</title> 
<style type="text/css"> 
/*样式*/ 
#consuming_time{ font-size:12px; border:solid 1px #ccc; background-color:#f2f6fb; margin:10px 20px; height:40px; line-height:20px; padding:5px 10px; width:260px; } 
#TwentyFourHourChart{ width:700px; height:240px; border:solid 1px #B3B3DC; position:relative; top:40px; left:20px; } 
</style> 
<script type="text/javascript"> 
window.onload = function () { 
var _time = "开始绘制时间：" + thisMomentTime(); 
toDrawingChart([15, 26, 32, 33, 44, 55, 66, 57, 88, 92, 67, 42, 45, 61, 105, 33, 24, 15, 36, 27, 28, 29, 10, 22], [10, 20, 22, 23, 30, 35, 50, 40, 62, 78, 60, 40, 25, 58, 95, 15, 20, 8, 25, 20, 18, 20, 5, 12]); 
_time += "<br>绘制完成时间：" + thisMomentTime(); 
document.getElementById("consuming_time").innerHTML = _time; 
//显示提示信息 
toShowTipMessage(); 
}; 
function thisMomentTime() { 
var m = (new Date).getHours() + "时 " + (new Date).getMinutes() + "分 " + (new Date).getSeconds() + "秒 " + (new Date).getMilliseconds() + "毫秒"; 
return m; 
} 
/*Array 数组扩展*/ 
Array.prototype.max = function () { 
return Math.max.apply({}, this); 
}; 
Array.prototype.min = function () { 
return Math.min.apply({}, this); 
}; 
//绘制24小时分时段呼入图形报表的函数 
function toDrawingChart(/*String*/inCallsPerHour, /*String*/inCompletePerHour) { 
var ic = document.getElementById("TwentyFourHourChart"); //页面上唯一的一个div，作为图表的容器 
if (inCallsPerHour != null) { 
var inCallMax = inCallsPerHour.max(); //从传入的数组中取得数组最大值，用到了一个自己写的array的扩展方法max() 
var topOffsetPercent = 180 / inCallMax; //计算以最大值为基准的每像素显示比例，百分比 
for (var i = 0; i < inCallsPerHour.length; i++) { //循环24小时数据 
var sumrow = document.createElement("div"); //创建一个div元素sumrow 
sumrow.id = "sumrow_" + i + "_" + inCallsPerHour[i];//为刚刚创建的div元素sumrow添加id属性（这里把时间，呼入电话总量数据写入到id中，后面显示这些信息的时候有用） 
sumrow.setAttribute("class", "incallchartsumrow"); //添加属性 
//设置元素的left（每个div宽度为10px，那么第i个元素就应该是i*10，因为还有一列10像素的组装图，所以还要*2，加上距离左侧40px边距 + 每2个柱状图为一组之间的间隔空隙6px，所以得出如下，） 
sumrow.style.left = (i * 10) * 2 + (i * 6) + 40 + "px"; 
//高度的计算，Math.round四舍五入取值，百分比的基数 乘以 当前时段的呼入数据，为统计图的高度 
sumrow.style.height = Math.round(topOffsetPercent * inCallsPerHour[i]) + "px"; 
sumrow.style.width = "10px"; //宽度10px像素 
sumrow.style.position = "absolute"; //绝对定位 
sumrow.style.overflow = "hidden"; //超出部分隐藏 
sumrow.style.background = "none repeat scroll 0 0 #1280ef"; //背景颜色 
sumrow.style.display = "block"; //块状显示 
//距离容器上边框的距离，图表高度200 减去 当前这个柱状图图表高度 
sumrow.style.top = 200 - Math.round(topOffsetPercent * inCallsPerHour[i]) + "px"; 
ic.appendChild(sumrow); //将创建的sumcow元素添加到ic容器中去 
var timerow = document.createElement("div"); 
timerow.id = "timerow_" + i; 
timerow.setAttribute("class", "callnum"); 
timerow.style.left = (10 * i) * 2 + (i * 6) + 40 + "px"; 
timerow.style.width = "10px"; 
timerow.style.position = "absolute"; 
timerow.style.top = "205px"; 
timerow.innerHTML = '<span style="font-size:12px; color:#666666;"> ' + i + '</span>'; 
ic.appendChild(timerow); 
var cptrow = document.createElement("div"); 
cptrow.id = "cptrow_" + i + "_" + inCompletePerHour[i]; 
cptrow.setAttribute("class", "incallchartsumrow"); 
cptrow.style.width = "10px"; 
cptrow.style.height = Math.round(topOffsetPercent * inCompletePerHour[i]) + "px"; 
cptrow.style.position = "absolute"; 
cptrow.style.background = "none repeat scroll 0 0 #92be0f"; 
cptrow.style.left = (i * 10) * 2 + 10 + (i * 6) + 40 + "px"; 
cptrow.style.display = "block"; 
cptrow.style.top = 200 - Math.round(topOffsetPercent * inCompletePerHour[i]) + "px"; 
ic.appendChild(cptrow); 
} 
//绘制标尺线 
for (var i = 0; i < 5; i++) { 
var tity = document.createElement("div"); 
tity.setAttribute("class", "tity"); 
tity.style.width = "30px"; 
tity.style.position = "absolute"; 
tity.style.top = (36 * i) + (20 - 6) + "px"; 
tity.style.left = "15px"; 
tity.innerHTML = '<span style="font-size:12px; color:#666666;"> ' + Math.round(inCallMax - (inCallMax / 5) * i) + '</span>'; 
ic.appendChild(tity); 
var liney = document.createElement("div"); 
liney.setAttribute("style", "width:620px; left:40px; border-top:1px dotted #B9B9B9; height:1px; line-height:1px; display:block; overflow:hidden; position:absolute; "); 
liney.style.top = (36 * i) + 20 + "px"; 
ic.appendChild(liney); 
} 
} else { 
icArea.innerHTML = '<div style="color:#0066cc; font-size:12px; margin:20px 0 0 80px;">暂无统计数据</div>'; 
} 
} 
//鼠标提示显示24小时实时>》呼入《<监控的详细数据 
function toShowTipMessage() { 
var nodes = document.getElementById("TwentyFourHourChart").getElementsByTagName("div"); 
for (var i = 0; i < nodes.length; i++) { 
nodes[i].onmouseover = function () { 
var temp = this.id.split("_"); 
var type = temp[0]; 
var hour = temp[1]; 
var times = temp[2]; 
var tipMessage = ""; 
var tip = document.createElement("div"); 
tip.id = "TipMessage"; 
tip.style.position = "absolute"; 
tip.style.top = (parseInt(document.getElementById(this.id).style.top.replace("px", "")) - 20) + "px"; 
tip.style.left = document.getElementById(this.id).style.left; 
if (type == "sumrow") { 
tipMessage = "今日" + hour + "时呼入" + times; 
} else if (type == "cptrow") { 
tipMessage = "今日" + hour + "时已接" + times; 
} 
tip.innerHTML = '<span style="font-size:12px; display:block; height:20px; background-color:#ffffff; padding:0px 2px; line-height:20px;">' + tipMessage + '</span>'; 
document.getElementById("TwentyFourHourChart").appendChild(tip); 
} 
nodes[i].onmouseout = function () { 
var tip = document.getElementById("TipMessage"); 
document.getElementById("TwentyFourHourChart").removeChild(tip); 
} 
} 
} 
</script> 
</head> 
<body> 
<!-- 下面这个div consuming_time 是为了显示左上角，绘制图表耗时显示之用，在实际使用中午用处 --> 
<div id="consuming_time"></div> 
<div id="TwentyFourHourChart"> 
</div> 
</body> 
</html> 
