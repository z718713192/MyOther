一、类CSS选择器
  1.基本选择器
  2.层次选择器
  3.属性选择器
 
二、过滤选择器
  1.基本过滤选择器

  2.可见性过滤选择器

--------------------------------------------
一、类CSS选择器
   

    1.基本选择器（标签、class、id、交集、并集、全局）
      
      h2{color:red;}
      .test{
        background-color:green;
      }
      #tt{
         .....
      }

      <input type="text" class="name" />
      $(".name");
      
      <input type="text" id="name" />
      $("#name");

      <h2 class="title">标题</h2>
      $("h2.title"); //选中的是class="title"的h2标签


    2.层次选择器（后代选择器、子选择器、相邻元素选择器、
		 同辈元素选择器）

    
    后代选择器:某个选择器下的所有元素
       $("div span")
       <div class="test">

          <span></span>

	  <p><span></span></p>
       
       </div>
    子选择器:选中某个元素下的【第一级子元素】，
    不包括孙子元素>


    相邻元素选择器:距目标元素，【最近】的【下一个】元素。 
    同辈元素选择器:目标元素和后面要选择的元素是同级关系。 ~
  
   
    3.属性选择器([attribute]、[attribute=value]、
                 [attribute !=value]、[attribute*=value]、
		 [attribute^=value]、[attribute$=value]
		 [selector1][selector2])
      

      [attribute]: $("h2[title]").css("background-color","#09F")
      [attribute=value]： 
      [attribute!=value]：
      [attribute^=value]：属性以某个字符开头
      [attribute$=value]：属性以某个字符串结尾
      [attribute*=value]：属性以包含某个字符
      ["selector1 selector2 selector3..."]：符合选择器
      

二、过滤选择器
   
  
    1.基本过滤选择器（:first、:last、:even、:odd、:eq(index)、
		     :gt(index)、:lt(index)、
		     :not(selector)、:header、:focus）


      注意：基、偶选择器下标从0开始
       eq都是从0开始

    2.可见性过滤选择器(:visible、:hidden)
     
    
