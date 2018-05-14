  一、JQuery介绍
二、JQuery第一个程序
三、DOM模型
四、DOM对象与JQuery对象之间的转换

-------------------------------------------------------------------
一、JQuery介绍
  
  1.JQuery是什么？
     
  JQuery是对javaScript对象和函数的封装。（jQuery是建立在js基础上的）
  
  设计思想：让更少的代码，做尽可能多的事情。
  
  2.JQuery能做什么？
     
    a.访问和操作DOM(document.getElementByXXX)元素
    b.控制页面样式 
    c.对页面事件进行处理

    d.扩展新的jQuery插件
    e.与Ajax技术完美结合

  
  3.JQuery的优势？

     a.体积小，压缩后只有100KB左右
     b.强大的选择器
     c.出色的DOM封装
     d.可靠的事件处理机制
     e.出色的浏览器兼容性
     f.使用隐式迭代简化编程
     g.丰富的插件支持

  4.如何获取JQuery？
     http://www.jquery.com 
     Jquery库文件：
     jquery-1.8.3.js 
       没有压缩，用于开发环境。
     jquery-1.8.3.min.js
        压缩后的，用于投产后的环境。



二、JQuery第一个程序
      
     1.在html文件中引入jQuery-1.xx.js文件
     
     <script src="xx.js" type="text/javascript"></script>
 
    $(document).ready(function(){
        //jquery代码
    });


三、DOM模型
   
   1.什么是DOM模型？
      
      Javascript
      a.ECAMScript（标准的javascript）
      b.BOM(浏览器对象模型)
      c.DOM(文档对象模型)

     浏览器按照一定的顺序将元素绘制到浏览器窗口中，
     以对象描述文档的方式就是DOM。

     其中每一个元素就是一个DOM对象。
    
   
   2.DOM对象与JQuery对象(jQuery包装了DOM)

      DOM对象和jQuery对象分别拥有
      一套独立的方法，不能混用。
      

   3.JQuery语法结构
     
     3.1.$(selector).action();

     3.2.$等同于jQuery
         $(...)=jQuery(...)

     3.3.操作连缀书写
      $("h2").css("background-color","#CCFFFF").next().css("display","block");

     3.4.JQuery的常用语法
        css()、next()、addClass()
	
四、DOM对象与JQuery对象之间的转换
   
   1.DOM转jQuery对象
      //得到DOM对象
      var txtName =document.getElementById("txtName"); 
      //将DOM转化成jQuery对象
      var $txtName =$(txtName);   

   
   2.jQuery对象转DOM对象
    注意：jQuery获取的对象是类似数组

    形式一：
    var $txtName =$ ("#txtName");    //jQuery对象
    var txtName =$txtName[0];        //DOM对象

    形式二：
    var $txtName =$ ("#txtName");    //jQuery对象
    var txtName =$txtName.get(0);        //DOM对象

   
  

