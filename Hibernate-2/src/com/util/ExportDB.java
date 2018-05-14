package com.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportDB {

	public static void main(String[] args) {
		createTable();
	}
	/**
	 * hibernate创建表的方法
	 */
	public static void createTable() {
		Configuration config = new Configuration().configure();
		SchemaExport exp = new SchemaExport(config);
		exp.setFormat(true);
		exp.create(true, true);
	}
}