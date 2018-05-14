一、BOM模型(浏览器对象模型)[重点] 
二、Window对象
三、history对象和location对象
四、Document对象
五、JavaScript内置对象
-----------------------------------------------------------

    javascript

    ECMAScript(js的标准)  BOM(浏览器对象)  DOM 



-----------------------------------------------
一、BOM模型

1.什么是BOM模型？
     浏览器对象模型，是JS对浏览器的一个描述。
       Window: 顶级对象
          history(前进、后退) 、
	  location(地址栏) 、
	  document(html标签包含的内容)

二、Window对象
	
   1、常用属性
   2、常用方法
   3、常用事件

   注意：window对象的属性、方法调用可以省略window
         window.alert(); 
	 alert();


三、history对象和location对象
   
    history的方法：
    history.back()     history.go(-1)返回
    回到上一个页面
    history.forward()  history.go(1)前进
    前进到回退前的页面

    代表浏览器的地址栏：
    location的属性和方法：

    location.href 设置或返回完整的URL
    location.reload()刷新页面

四、Document对象(文档对象 重点)
    document的属性:
    referrer	返回载入当前文档的文档的URL，
	     
	     如果当前文档不是通过超级链接访问的
		，则为 null

    URL	返回当前文档的URL

    
    document的方法:(重点)
    
    元素的name和id属性:<intpu type="text" name="tname" id="tid">
    name:元素的名字，可以相同
    id:唯一标示元素

    getElementById()  通过id查找对象
    getElementsByName()通过name找元素，返回的是元素的数组
    getElementsByTagName()通过标签名找元素，返回的是元素的数组
    
    <input type="text" />
    <input type="password" />

五、JavaScript内置对象

    Array 、String 、Math、Date

    重点是Date的getXX方法

    构造Date
    
    var  today=new Date();   //返回当前日期和时间
    var tdate=new Date("september 1,2013,14:58:12");
    参数格式：MM  DD,YYYY,hh:mm:ss
    
    setTimeout("要执行的函数","毫秒数")
    设置n毫秒后执行一次函数

    SetInterval("要执行的函数","毫秒数")
    设置每隔n毫秒,执行一次函数
    



