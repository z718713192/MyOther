1.DOM分类

2.Jquery中的DOM

  2.1.样式操作
  2.2.内容及Value属性值操作
  2.3.节点操作
  2.4.节点属性操作
  2.5.节点遍历
  2.6.CSS-DOM操作

------------------------------------------------------------
  1.DOM分类
     
     Document Object Model(文档对象模型)
     
     DOM:

     a.DOM Core
     b.HTML-DOM   处理表单元素的
     c.CSS-DOM 处理CSS部分的

   
  2.jQuery中的DOM 
     
     jQuery的DOM是对原始的DOM进行封装。增强原始DOM的功能
     简化原始DOM的操作。
     

    2.1.样式操作
       css()、addClass()、removeClass()、toggleClass()

    
    2.2.内容及Value属性值操作

       
       html()[获取或设置元素中的HTML内容]、
        
       设置或得到元素中的所有的节点内容。


       
       text()[获取或设置元素中的文本节点]、
        <div>
          <span>dddd</span>
	  <p></p>
	  sd第三方开快点快点 
       </div>

       val()[获取或设置元素的值]

       <input type="text" value="test" id="t" />
       document.getElementById("t").value;
       val()



    2.3.节点操作
        
        a.创建节点 :$()用于获取或创建节点

	b.插入节点: 子节点：append(content)、appendTo(content)/
	      同辈：after、insertAfter、before 、insertBefore
	c.替换节点:replaceWith()和replaceAll()用于替换某个节点
        d.复制节点:clone()用于复制某个节点
	   clone(true):复制节点的同时复制事件
        e.删除节点:
	   remove()：删除整个节点
           detach()：删除整个节点，保留元素的绑定事件、附加的数据
           empty()：清空节点内容

    2.4.节点属性操作
         
	 attr()用来获取与设置元素属性、

	 removeAttr()用来删除元素的属性 
         
	 <input type="text" value="hh">


    2.5.节点遍历
         children()方法可以用来获取元素的所有子元素
	 遍历同辈元素

    2.6.CSS-DOM操作

       css()、height([value])、
       width([value])、offset([value])

 
 