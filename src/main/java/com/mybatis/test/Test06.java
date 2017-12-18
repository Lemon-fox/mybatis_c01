package com.mybatis.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.util.MyBatisUtil;

public class Test06 {
	
	@Test
	public void testGetUserCount(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.mybatis.mapping.userMapper2.getUserCount";
		Map<String, Integer> parameterMap = new HashMap<String,Integer>();
		parameterMap.put("sexid", 1);
		parameterMap.put("usercount", -1);
		sqlSession.selectOne(statement, parameterMap);
		Integer result = parameterMap.get("usercount");
		System.out.println(result);
		sqlSession.close();
	}

}
