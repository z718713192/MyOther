һ��BOMģ��(���������ģ��)[�ص�] 
����Window����
����history�����location����
�ġ�Document����
�塢JavaScript���ö���
-----------------------------------------------------------

    javascript

    ECMAScript(js�ı�׼)  BOM(���������)  DOM 



-----------------------------------------------
һ��BOMģ��

1.ʲô��BOMģ�ͣ�
     ���������ģ�ͣ���JS���������һ��������
       Window: ��������
          history(ǰ��������) ��
	  location(��ַ��) ��
	  document(html��ǩ����������)

����Window����
	
   1����������
   2�����÷���
   3�������¼�

   ע�⣺window��������ԡ��������ÿ���ʡ��window
         window.alert(); 
	 alert();


����history�����location����
   
    history�ķ�����
    history.back()     history.go(-1)����
    �ص���һ��ҳ��
    history.forward()  history.go(1)ǰ��
    ǰ��������ǰ��ҳ��

    ����������ĵ�ַ����
    location�����Ժͷ�����

    location.href ���û򷵻�������URL
    location.reload()ˢ��ҳ��

�ġ�Document����(�ĵ����� �ص�)
    document������:
    referrer	�������뵱ǰ�ĵ����ĵ���URL��
	     
	     �����ǰ�ĵ�����ͨ���������ӷ��ʵ�
		����Ϊ null

    URL	���ص�ǰ�ĵ���URL

    
    document�ķ���:(�ص�)
    
    Ԫ�ص�name��id����:<intpu type="text" name="tname" id="tid">
    name:Ԫ�ص����֣�������ͬ
    id:Ψһ��ʾԪ��

    getElementById()  ͨ��id���Ҷ���
    getElementsByName()ͨ��name��Ԫ�أ����ص���Ԫ�ص�����
    getElementsByTagName()ͨ����ǩ����Ԫ�أ����ص���Ԫ�ص�����
    
    <input type="text" />
    <input type="password" />

�塢JavaScript���ö���

    Array ��String ��Math��Date

    �ص���Date��getXX����

    ����Date
    
    var  today=new Date();   //���ص�ǰ���ں�ʱ��
    var tdate=new Date("september 1,2013,14:58:12");
    ������ʽ��MM  DD,YYYY,hh:mm:ss
    
    setTimeout("Ҫִ�еĺ���","������")
    ����n�����ִ��һ�κ���

    SetInterval("Ҫִ�еĺ���","������")
    ����ÿ��n����,ִ��һ�κ���
    



