package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 操作Hibernate的工具类
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
	 * 获取Hibernate的Session[相当于jdbc中的Connection]
	 * @return
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}

	/**
	 * 关闭Hibernate的Session会话
	 * @param session
	 */
	public static void closeSession(Session session) {
		if (null != session && session.isOpen()) {
			session.close();
			session = null;
		}
	}

}
