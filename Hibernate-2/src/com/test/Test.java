package com.test;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Clazz;
import com.pojo.Student;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		addSTudent();
	}

	public static void addSTudent() {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		try {
			// ����Student����
			Student stu = new Student();
			stu.setStuname("С��");
			stu.setAge(23);
			stu.setBrithday(new Date(111000000L));
			// �����༶����
			Clazz cl = new Clazz();
			cl.setName("1��");
			session.save(cl);//�־û��༶
			
			stu.setClazz(cl); //����ѧ����༶�Ĺ�ϵ
			
			session.save(stu);
			
			tran.commit();
		} catch (HibernateException e) {
			tran.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

	}

}
