package com.mybatis.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mybatis.domain.User;

public interface UserMapperI {
	
	@Insert("insert into users01(name,age)values(#{name},#{age})")
	public int add(User user);
	
	@Delete("delete from users01 where id=#{id}")
	public int deleteById(int id);
	
	@Update("update users01 set name=#{name},age=#{age} where id=#{id}")
	public int update(User user);
	
	@Select("select * from users01 where id=#{id}")
	public User getById(int id);
	
	@Select("select * from users01")
	public List<User> getAll();

}
