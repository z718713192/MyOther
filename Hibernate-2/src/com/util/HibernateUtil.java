package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * ����Hibernate�Ĺ�����
 * 
 * @author ChenShun
 * 
 */
public class HibernateUtil {
	private static Configuration config = null;
	private static SessionFactory sessionFactory = null;
	static {
		config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
	}

	/**
	 * ��ȡHibernate��Session[�൱��jdbc�е�Connection]
	 * @return
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}

	/**
	 * �ر�Hibernate��Session�Ự
	 * @param session
	 */
	public static void closeSession(Session session) {
		if (null != session && session.isOpen()) {
			session.close();
			session = null;
		}
	}

}
