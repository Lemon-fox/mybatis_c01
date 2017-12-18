package com.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.domain.User;
import com.mybatis.util.MyBatisUtil;

public class TestCRUDByXmlMapper {
	
	@Test
	public void testAdd(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "com.mybatis.mapping.userMapper.addUser";
		User user = new User();
		user.setName("用户abc");
		user.setAge(23);
		//执行插入操作
		int retResult = sqlSession.insert(statement,user);
		//手动提交
		//使用SqlSession执行完SQl之后要关闭SqlSession
		sqlSession.close();
		System.out.println(retResult);
		
	}
	@Test
	public void testAdd2(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "com.mybatis.mapping.userMapper.addUser2";
		User user = new User();
		user.setName("用户abc");
		user.setAge(23);
		//执行插入操作
		int retResult = sqlSession.insert(statement,user);
		//手动提交
		//使用SqlSession执行完SQl之后要关闭SqlSession
		sqlSession.close();
		System.out.println(retResult);
		
	}
	
	@Test
	public void testUpdate(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.mybatis.mapping.userMapper.updateUser";
		User user = new User();
		user.setId(3);
		user.setName("木瓜");
		user.setAge(13);
		//执行修改操作
		int retResult = sqlSession.update(statement, user);
		sqlSession.close();
		System.out.println(retResult);
		
	}
	
	@Test
	public void testDelete(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.mybatis.mapping.userMapper.delteUser";
		int retResult = sqlSession.delete(statement,4);
		sqlSession.close();
		System.out.println(retResult);
	}
	
	@Test
	public void testGetAll(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.mybatis.mapping.userMapper.getAllUsers";
		List<User> lstUsers = sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(lstUsers);
	}

}
