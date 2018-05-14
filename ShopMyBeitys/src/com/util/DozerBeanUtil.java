package com.util;

import java.util.Collection;
import java.util.Iterator;

import org.apache.log4j.Logger;
import net.sf.dozer.util.mapping.DozerBeanMapper;
import net.sf.dozer.util.mapping.MapperIF;

/**
 * JavaBean属�?转换工具�? 采用dozer工具 dozer:javabean之间属�?相互copy的利�? dozer能完成以下自动转�? 原生类型,
 * String互相转换 list-list(NX) set-list(NX) array-array...
 */
@SuppressWarnings("all")
public final class DozerBeanUtil {

	private final static MapperIF mapping = new DozerBeanMapper();

	private DozerBeanUtil() {
	}

	// 饿汉单例模式(线程安全)
	public static MapperIF getDozerObject() {
		return mapping;
	}

	/**
	 * 实例之间属�?copy
	 * 
	 * @param src
	 * @param dest
	 */
	public static void copyProperties(Object src, Object dest) {
		if (src == null || dest == null)
			return;
		mapping.map(src, dest);
	}

	/**
	 * 复制并产生一个新的对�?从src中复制同名属性�?, 以clazz作为构�?器产生实�?(B)cloneBean(new A(),B.class)
	 * 
	 * @param clazz
	 * @param src
	 * @param c
	 * @return Object
	 */
	public static Object cloneBean(Object src, Class clazz) {

		if (src == null || clazz == null)
			return null;
		return mapping.map(src, clazz);
	}

	/**
	 * VO与PO集合之间的相互转�?cloneCollection(new HashSet<Po>,ArrayList.class,Vo.class)
	 * 
	 * @param srcCollection
	 * @param targetCollectionCls
	 * @param itemVoCls
	 * @return
	 */
	public static Collection cloneCollection(Collection srcCollection,
			Class targetCollectionCls, Class itemVoCls) {
		if (srcCollection == null || targetCollectionCls == null
				|| itemVoCls == null)
			return null;
		Collection targetCollection = null;
		try {
			targetCollection = (Collection) targetCollectionCls.newInstance();
			Iterator it = srcCollection.iterator();
			while (it.hasNext()) {
				targetCollection.add(DozerBeanUtil.cloneBean(it.next(),
						itemVoCls));
			}
			return targetCollection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
