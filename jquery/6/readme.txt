1.DOM����

2.Jquery�е�DOM

  2.1.��ʽ����
  2.2.���ݼ�Value����ֵ����
  2.3.�ڵ����
  2.4.�ڵ����Բ���
  2.5.�ڵ����
  2.6.CSS-DOM����

------------------------------------------------------------
  1.DOM����
     
     Document Object Model(�ĵ�����ģ��)
     
     DOM:

     a.DOM Core
     b.HTML-DOM   �����Ԫ�ص�
     c.CSS-DOM ����CSS���ֵ�

   
  2.jQuery�е�DOM 
     
     jQuery��DOM�Ƕ�ԭʼ��DOM���з�װ����ǿԭʼDOM�Ĺ���
     ��ԭʼDOM�Ĳ�����
     

    2.1.��ʽ����
       css()��addClass()��removeClass()��toggleClass()

    
    2.2.���ݼ�Value����ֵ����

       
       html()[��ȡ������Ԫ���е�HTML����]��
        
       ���û�õ�Ԫ���е����еĽڵ����ݡ�


       
       text()[��ȡ������Ԫ���е��ı��ڵ�]��
        <div>
          <span>dddd</span>
	  <p></p>
	  sd������������� 
       </div>

       val()[��ȡ������Ԫ�ص�ֵ]

       <input type="text" value="test" id="t" />
       document.getElementById("t").value;
       val()



    2.3.�ڵ����
        
        a.�����ڵ� :$()���ڻ�ȡ�򴴽��ڵ�

	b.����ڵ�: �ӽڵ㣺append(content)��appendTo(content)/
	      ͬ����after��insertAfter��before ��insertBefore
	c.�滻�ڵ�:replaceWith()��replaceAll()�����滻ĳ���ڵ�
        d.���ƽڵ�:clone()���ڸ���ĳ���ڵ�
	   clone(true):���ƽڵ��ͬʱ�����¼�
        e.ɾ���ڵ�:
	   remove()��ɾ�������ڵ�
           detach()��ɾ�������ڵ㣬����Ԫ�صİ��¼������ӵ�����
           empty()����սڵ�����

    2.4.�ڵ����Բ���
         
	 attr()������ȡ������Ԫ�����ԡ�

	 removeAttr()����ɾ��Ԫ�ص����� 
         
	 <input type="text" value="hh">


    2.5.�ڵ����
         children()��������������ȡԪ�ص�������Ԫ��
	 ����ͬ��Ԫ��

    2.6.CSS-DOM����

       css()��height([value])��
       width([value])��offset([value])

 
 