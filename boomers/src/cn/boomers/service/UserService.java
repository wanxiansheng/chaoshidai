package cn.boomers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.boomers.mapper.UsersCustomMapper;
import cn.boomers.po.Users;



@Service
public class UserService
{
	@Autowired
	private UsersCustomMapper usersCustomMapper;
	
	
	//用户信息
	//登录
	public Users isLogin(Users user){
		return usersCustomMapper.isLogin(user);
	}
	
	public void insert(Users user){
		usersCustomMapper.insert(user);
	}
}