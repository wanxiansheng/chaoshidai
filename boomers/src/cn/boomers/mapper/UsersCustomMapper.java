package cn.boomers.mapper;

import cn.boomers.po.Users;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsersCustomMapper {
	public Users isLogin(Users user);
	
	public void insert(Users user);
	
	public Users selectById(Users user);
	
	public List<Users> userList();
}