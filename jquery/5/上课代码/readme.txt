һ���¼�

�������� 
--------------------------------------------------------

һ���¼�

   1.��ҳ�¼�
      
      ʲô���¼���
        
	Ԫ�ض���(html���)�빦�ܴ���(����)֮���������
	
����:<input type="button" onclick="alert('���!')">
   

   2.jQuery�¼�
      
    jQuery�¼���ԭʼ����ҳ�¼������˷�װ��
      ������ԭʼ���¼�����һ����
      
      ��װ����˲�ͬ��������¼������ļ��ݡ�
      onxxxx onclick
      click

     
    A.�����¼�

      window�¼�
         $(document).ready(); //������ҳ�ṹ 

      ����¼�
         click()������ mouseover()��mouseout()

      �����¼�
          keydown()��keyup()��
	  keypress()[�����������ַ�ʱ��һ���¼�]
         
      ���¼�
          focus()��ý��㡢
	  blur()ʧȥ���� 
         

    B.���¼����Ƴ��¼�
      

      B-1:�󶨵����¼�
         
   bind("�¼���","������");
   
   $("[type=button]").bind("click",function(){
	     
	     //�����Ĺ���

  });


      B-2:�󶨶���¼�
         bind({
	   mouseover:function(){
	      //��������
	   },
	   mouseout:function(){
	      //��������
	   }
	 }); 

      B-3:�Ƴ��¼�
	unbind([����],[������])


      B-4:�����¼��Ƕ���¼������
      a.�������ͣ
         hover()�൱��mouseover��mouseout�����
      b.����������
         toggle(fn1,fn2..)

	
��������
   
   1.����Ԫ����ʾ������
      show()��ʾ��hide()���ء�
      toggle()//����or��ʾ

   2.����Ԫ�ص��뵭��
      fadeIn()��fadeOut()


   3.�ı�Ԫ�ظ߶�
      sileDown()��sileUp()

     