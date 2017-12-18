package com.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	/*
	 * 获取SqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		String resource = "conf.xml";
		InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		return factory;
		
	}
	/*
	 * 获取SqlSession
	 */
	public static SqlSession getSqlSession(){
		return getSqlSessionFactory().openSession();
	}
	/*
	 * 获取SqlSession
	 */
	public static SqlSession getSqlSession(Boolean isAutoCommit){
		return getSqlSessionFactory().openSession(isAutoCommit);
	}

}
