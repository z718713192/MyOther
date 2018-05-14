一、事件

二、动画 
--------------------------------------------------------

一、事件

   1.网页事件
      
      什么是事件？
        
	元素对象(html组件)与功能代码(函数)之间的桥梁。
	
例如:<input type="button" onclick="alert('你好!')">
   

   2.jQuery事件
      
    jQuery事件对原始的网页事件进行了封装。
      功能与原始的事件基本一样。
      
      封装解决了不同浏览器的事件命名的兼容。
      onxxxx onclick
      click

     
    A.基础事件

      window事件
         $(document).ready(); //加载网页结构 

      鼠标事件
         click()单击、 mouseover()、mouseout()

      键盘事件
          keydown()、keyup()、
	  keypress()[当按键产生字符时的一个事件]
         
      表单事件
          focus()获得焦点、
	  blur()失去焦点 
         

    B.绑定事件和移除事件
      

      B-1:绑定单个事件
         
   bind("事件名","处理函数");
   
   $("[type=button]").bind("click",function(){
	     
	     //函数的功能

  });


      B-2:绑定多个事件
         bind({
	   mouseover:function(){
	      //函数内容
	   },
	   mouseout:function(){
	      //函数内容
	   }
	 }); 

      B-3:移除事件
	unbind([类型],[处理函数])


      B-4:复合事件是多个事件的组合
      a.鼠标光标悬停
         hover()相当于mouseover、mouseout的组合
      b.鼠标连续点击
         toggle(fn1,fn2..)

	
二、动画
   
   1.控制元素显示与隐藏
      show()显示、hide()隐藏、
      toggle()//隐藏or显示

   2.控制元素淡入淡出
      fadeIn()、fadeOut()


   3.改变元素高度
      sileDown()、sileUp()

     