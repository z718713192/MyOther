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
			// 创建Student对象
			Student stu = new Student();
			stu.setStuname("小花");
			stu.setAge(23);
			stu.setBrithday(new Date(111000000L));
			// 创建班级对象
			Clazz cl = new Clazz();
			cl.setName("1班");
			session.save(cl);//持久化班级
			
			stu.setClazz(cl); //设置学生与班级的关系
			
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
