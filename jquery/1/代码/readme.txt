һ��JavaScript���
��������
����������������

--------------------------------------------
һ��JavaScript���
     
     1.Ϊʲôʹ��javaScript?
       a.�����������ѹ����
       b.javaScript����ʵ�ָ��ֶ�̬��Ч����

     
     2.JavaScript��ʲô��
        javaScript��һ�Ż��ڡ����󡿺͡��¼�������
	 ���а�ȫ�Եġ��ű�����
	
	�ű�:�����ڱ�����л����С�(������html��)

	�ص㣺
	 a.������htmlҳ����������Ϊ�����¼���
	 b.�﷨��java���ơ�
	 c.�����Ե����ԡ�[�������]
	
	javaScript����ɣ�
           a.ECMAScript ��׼��js[ŷ�˱�׼]
	   b.BOM  ���������ģ��
	   c.DOM  �ĵ�����ģ��


     3.���ʹ��javaScript?

        a.javaScript�Ľṹ

         <script type="text/javaScript">
	   <!--
	      js���﷨��
	   -->
	 </script>
	 
	 ע��:
	   a-1:script��ǩ�����Ͽ��Է���html�κ�λ�á�
	      ���û������Ҫ�󣬽������<head>�С�
	    a-2:��script�����htmlע����Ϊ�˼���
	      ��֧��javascript���������
	
        javaScripr�ĵڶ��ָ�ʽ��
	  �����ⲿ��js�ļ���
	  �ȴ���*.js�ļ� [дjavascript����]
	  ��Ҫʹ�õ�ҳ������js�ļ�
<script type="text/javascript" src="js��ַ"></script>
 



    4.js�����﷨.
       �����Ķ���:

       var ������= ֵ;
       ������ = ֵ;(js�Ϸ����﷨,������ʹ��)
      
      ����Ķ��壺
       int[] nums  = new int[10]; java�﷨

       var arr = new Array(10); js����������﷨





       //java��forѭ��
       for(int i=0;i<5;i++){
       }

       //js��ѭ��
       for(var i=0;i<5;i++){
       }
     
     �����
     alert("xxx");
     prompt();��ʾ�û���������


��������

  1.�����ĸ���
     
  1.1ʲô�Ǻ�����
 
    ������Java�еķ�����������ض�����Ĵ�������

 
  1.2ʹ�ú����ĺô���
    a.ʵ�ֶ�ĳ�����ܵķ�װ (��������)
    b.ʹ�ü򵥣����ö�����ĳ�����С�



  1.3�����ķ���

      a.ϵͳ����

      b.�Զ��庯��(�ص�)


  2.ϵͳ����
    
    parseInt() ���ַ���ת������
    parseFloat() ���ַ���ת�ɸ�����

    isNaN() �ж�ĳ����ֵ�Ƿ��Ƿ�����
    �������ַ���true
    �����ַ���false


  3.�Զ��庯��(�ص�)

  3.1�޲κ���
      function functionName(){
          //��������
      }
   �¼� = "javascript:functionName()"
   �¼� = "functionName()"
   <input name="btn" type="button" value="��ʾ5��HelloWorld"
       onclick="javascript:showHello()"/>
 
  3.2�вκ���
      funciton functionName(����1...����2...){
	 //����
      }
      ע��:��������ʱ��ֻд��������
      
  3.3�з���ֵ�ú���
      funciton functionName(...){
           return val;
      }


  3.4��������


 ����������������

   1.ȫ�ֱ���
    <script type="text/javascript">
       var num; //ȫ�ֱ���[�ڴ�script�ı���е��κ�λ��ʹ��]
    </script>

   2.�ֲ�����
    <script type="text/javascript">
        
	function test(){
	    
	    var num; //�ֲ�����[ֻ���ڵ�ǰ����ʹ��]
	}

    </script>
      