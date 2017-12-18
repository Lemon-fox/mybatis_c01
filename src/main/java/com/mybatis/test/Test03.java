package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.domain.Classes;
import com.mybatis.util.MyBatisUtil;

public class Test03 {
	
	@Test
	public void testGetClass(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		/*
		 * 映射sql的标识符字符串
		 * com.mybatis.mapping.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
		 * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.mybatis.mapping.classMapper.getClass";
		Classes clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
	}
	@Test
	public void testGetClazz2(){
		SqlSession sqlSession  =  MyBatisUtil.getSqlSession();
		String statement = "com.mybatis.mapping.classMapper.getClass2";
		Classes clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
	}

}
