package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @ClassName SqlSessionUtil
 * @description  
 * @date  
 */
public class SqlSessionUtil {

	private static String CONFIG_FILE_LOCATION = "MyBatisConfig.xml";
	private static final ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	private static SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
	private static SqlSessionFactory sessionFactory;

	static {
		try {

			sessionFactory = sfb.build(Resources
					.getResourceAsStream(CONFIG_FILE_LOCATION));
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	private SqlSessionUtil() {
	}

	public static SqlSession getSession() {
		SqlSession session = (SqlSession) threadLocal.get();

		if (session == null) {

			session = (sessionFactory != null) ? sessionFactory.openSession()
					: null;
			threadLocal.set(session);
		}

		return session;
	}

	public static void closeSession() {
		SqlSession session = (SqlSession) threadLocal.get();
		threadLocal.set(null);

		if (session != null) {
			session.close();
		}
	}

}