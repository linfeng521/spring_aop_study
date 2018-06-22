package com.linfeng.service.impl;

import org.springframework.stereotype.Service;

import com.linfeng.service.UserInfo;
@Service
public class UserInfoImpl implements UserInfo {

	@Override
	public void add() {
		System.out.println("增加一个新的用户信息");
		System.out.println("删除一个用户的信息");
	}
	
	public void addUser() {
		System.out.println("addUser添加了一个用户+:林峰");
	}

}
