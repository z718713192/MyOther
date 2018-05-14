package com.dao;

import java.util.List;

import com.pojo.Shops;

public interface ShopDao {
	public List<Shops> querysShops(Shops shops);
	public Shops findshops1(Shops shops);
	public void update(Shops shops);
	public void addshop(Shops shops);
	public void delete(Shops shops);
}
