package com.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@SuppressWarnings("unchecked")
public final class GsonUtil {

	private static Gson gson;

	private GsonUtil() {
	}

	static {
		gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	}

	/**
	 * 把Java对象转换成任意json格式字符�?
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJsonString(Object obj) {
		return gson.toJson(obj);
	}

	/**
	 * 获得Gson对象
	 * 
	 * @return
	 */
	public static Gson getGson() {
		return gson;
	}

	/**
	 * 把json字符串转换成任意javabean对象
	 * 
	 * @param json
	 * @return
	 */
	public static <T> T toBean(String json, Class<T> cls) {
		return (T) gson.fromJson(json, cls);
	}

	/**
	 * 把json字符串转换成指定类型的泛型集合或对象
	 * 
	 * @param json
	 * @return
	 */
	public static <T> T toCollection(String json, TypeToken<T> token) {

		return (T) gson.fromJson(json, token.getType());
	}
}
