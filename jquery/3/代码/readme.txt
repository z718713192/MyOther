  һ��JQuery����
����JQuery��һ������
����DOMģ��
�ġ�DOM������JQuery����֮���ת��

-------------------------------------------------------------------
һ��JQuery����
  
  1.JQuery��ʲô��
     
  JQuery�Ƕ�javaScript����ͺ����ķ�װ����jQuery�ǽ�����js�����ϵģ�
  
  ���˼�룺�ø��ٵĴ��룬�������ܶ�����顣
  
  2.JQuery����ʲô��
     
    a.���ʺͲ���DOM(document.getElementByXXX)Ԫ��
    b.����ҳ����ʽ 
    c.��ҳ���¼����д���

    d.��չ�µ�jQuery���
    e.��Ajax�����������

  
  3.JQuery�����ƣ�

     a.���С��ѹ����ֻ��100KB����
     b.ǿ���ѡ����
     c.��ɫ��DOM��װ
     d.�ɿ����¼��������
     e.��ɫ�������������
     f.ʹ����ʽ�����򻯱��
     g.�ḻ�Ĳ��֧��

  4.��λ�ȡJQuery��
     http://www.jquery.com 
     Jquery���ļ���
     jquery-1.8.3.js 
       û��ѹ�������ڿ���������
     jquery-1.8.3.min.js
        ѹ����ģ�����Ͷ����Ļ�����



����JQuery��һ������
      
     1.��html�ļ�������jQuery-1.xx.js�ļ�
     
     <script src="xx.js" type="text/javascript"></script>
 
    $(document).ready(function(){
        //jquery����
    });


����DOMģ��
   
   1.ʲô��DOMģ�ͣ�
      
      Javascript
      a.ECAMScript����׼��javascript��
      b.BOM(���������ģ��)
      c.DOM(�ĵ�����ģ��)

     ���������һ����˳��Ԫ�ػ��Ƶ�����������У�
     �Զ��������ĵ��ķ�ʽ����DOM��

     ����ÿһ��Ԫ�ؾ���һ��DOM����
    
   
   2.DOM������JQuery����(jQuery��װ��DOM)

      DOM�����jQuery����ֱ�ӵ��
      һ�׶����ķ��������ܻ��á�
      

   3.JQuery�﷨�ṹ
     
     3.1.$(selector).action();

     3.2.$��ͬ��jQuery
         $(...)=jQuery(...)

     3.3.������׺��д
      $("h2").css("background-color","#CCFFFF").next().css("display","block");

     3.4.JQuery�ĳ����﷨
        css()��next()��addClass()
	
�ġ�DOM������JQuery����֮���ת��
   
   1.DOMתjQuery����
      //�õ�DOM����
      var txtName =document.getElementById("txtName"); 
      //��DOMת����jQuery����
      var $txtName =$(txtName);   

   
   2.jQuery����תDOM����
    ע�⣺jQuery��ȡ�Ķ�������������

    ��ʽһ��
    var $txtName =$ ("#txtName");    //jQuery����
    var txtName =$txtName[0];        //DOM����

    ��ʽ����
    var $txtName =$ ("#txtName");    //jQuery����
    var txtName =$txtName.get(0);        //DOM����

   
  

