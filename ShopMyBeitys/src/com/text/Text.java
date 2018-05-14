package com.text;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
  
import com.dao.ShopDao;  
import com.dao.Userdao;
import com.pojo.Shops;
import com.pojo.Users;
 

public class Text {
	public static void main(String[] args) {
		Show();
		//AddShops();
		//delete();
		//update();
		//showUser();
		
	}
	
	public static void Show(){ 
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder(); 
		try {
			SqlSessionFactory ssf = sfb.build(Resources
					.getResourceAsStream("MyBatisConfig.xml")); 
			SqlSession session = ssf.openSession(); 
			ShopDao dao = session.getMapper(ShopDao.class);
			Shops shops=new Shops();
			List<Shops> data = dao.querysShops(shops);
			for (Shops temp : data) {
				System.out.println(temp.getSpid()+"\t"+temp.getSpname());
			} 
			session.close();

		} catch (IOException e) {
		 
			e.printStackTrace();
		}

	
	}
	
	public static void AddShops(){
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		 
		try {
			SqlSessionFactory ssf = sfb.build(Resources
					.getResourceAsStream("MyBatisConfig.xml"));
			 
			SqlSession session = ssf.openSession();
			 
			ShopDao dao = session.getMapper(ShopDao.class);
			Shops shops=new Shops("asd","123",12,"asd","1asd");
			dao.addshop(shops);
			 
			session.commit(); 
			session.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void delete(){
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		 
		try {
			SqlSessionFactory ssf = sfb.build(Resources
					.getResourceAsStream("MyBatisConfig.xml"));
			 
			SqlSession session = ssf.openSession();
			 
			ShopDao dao = session.getMapper(ShopDao.class);
			Shops shops=new Shops(3);
			dao.delete(shops);
			 
			session.commit(); 
			session.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void update(){
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
	 
		try {
			SqlSessionFactory ssf = sfb.build(Resources
					.getResourceAsStream("MyBatisConfig.xml"));
			 
			SqlSession session = ssf.openSession();
			 
			ShopDao dao = session.getMapper(ShopDao.class);
			Shops shops=new Shops(4,"qweqwe","123",21,"123","sad");
			dao.update(shops);
			 
			session.commit(); 
			session.close();

		} catch (IOException e) {
			 
			e.printStackTrace();
		}

	}

	public static void showUser(){
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder(); 
		try {
			SqlSessionFactory ssf = sfb.build(Resources
					.getResourceAsStream("MyBatisConfig.xml")); 
			SqlSession session = ssf.openSession(); 
			Userdao dao = session.getMapper(Userdao.class); 
			List<Users> data = dao.list();
			for (Users temp : data) {
				System.out.println(temp.getUserid()+"\t"+temp.getUsername()+"\t");
			} 
			session.close();

		} catch (IOException e) {
		 
			e.printStackTrace();
		}

	}
}
