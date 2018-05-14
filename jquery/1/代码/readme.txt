一、JavaScript简介
二、函数
三、变量的作用域

--------------------------------------------
一、JavaScript简介
     
     1.为什么使用javaScript?
       a.减轻服务器的压力。
       b.javaScript可以实现各种动态的效果。

     
     2.JavaScript是什么？
        javaScript是一门基于【对象】和【事件驱动】
	 具有安全性的【脚本】。
	
	脚本:寄生在别的运行环境中。(寄生在html中)

	特点：
	 a.可以在html页面中添交互行为。（事件）
	 b.语法与java类似。
	 c.解释性的语言。[无需编译]
	
	javaScript的组成：
           a.ECMAScript 标准的js[欧盟标准]
	   b.BOM  浏览器对象模型
	   c.DOM  文档对象模型


     3.如何使用javaScript?

        a.javaScript的结构

         <script type="text/javaScript">
	   <!--
	      js的语法。
	   -->
	 </script>
	 
	 注意:
	   a-1:script标签理论上可以放在html任何位置。
	      如果没有特殊要求，建议放在<head>中。
	    a-2:在script标记中html注释是为了兼容
	      不支持javascript的浏览器。
	
        javaScripr的第二种格式：
	  引入外部的js文件。
	  先创建*.js文件 [写javascript代码]
	  在要使用的页面引入js文件
<script type="text/javascript" src="js地址"></script>
 



    4.js核心语法.
       变量的定义:

       var 变量名= 值;
       变量名 = 值;(js合法的语法,不建议使用)
      
      数组的定义：
       int[] nums  = new int[10]; java语法

       var arr = new Array(10); js定义数组的语法





       //java的for循环
       for(int i=0;i<5;i++){
       }

       //js的循环
       for(var i=0;i<5;i++){
       }
     
     警告框
     alert("xxx");
     prompt();提示用户输入的组件


二、函数

  1.函数的概述
     
  1.1什么是函数？
 
    类似于Java中的方法，是完成特定任务的代码语句块

 
  1.2使用函数的好处？
    a.实现对某个功能的封装 (代码重用)
    b.使用简单，不用定义在某个类中。



  1.3函数的分类

      a.系统函数

      b.自定义函数(重点)


  2.系统函数
    
    parseInt() 将字符串转成整型
    parseFloat() 将字符串转成浮点型

    isNaN() 判断某个数值是否是非数字
    不是数字返回true
    是数字返回false


  3.自定义函数(重点)

  3.1无参函数
      function functionName(){
          //函数主体
      }
   事件 = "javascript:functionName()"
   事件 = "functionName()"
   <input name="btn" type="button" value="显示5次HelloWorld"
       onclick="javascript:showHello()"/>
 
  3.2有参函数
      funciton functionName(参数1...参数2...){
	 //主体
      }
      注意:参数定义时，只写参数名字
      
  3.3有返回值得函数
      funciton functionName(...){
           return val;
      }


  3.4匿名函数


 三、变量的作用域

   1.全局变量
    <script type="text/javascript">
       var num; //全局变量[在此script的标记中的任何位置使用]
    </script>

   2.局部变量
    <script type="text/javascript">
        
	function test(){
	    
	    var num; //局部变量[只能在当前函数使用]
	}

    </script>
      