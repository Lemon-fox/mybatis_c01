package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.domain.Order;
import com.mybatis.util.MyBatisUtil;

public class Test02 {
	
	@Test
	public void testGetOrderById(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.mybatis.mapping.orderMapper.getOrderById";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	@Test
	public void testGetOrderById2(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.mybatis.mapping.orderMapper.selectOrder";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	@Test
	public void testGetOrderById3(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.mybatis.mapping.orderMapper.selectOrderResultMap";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}

}
