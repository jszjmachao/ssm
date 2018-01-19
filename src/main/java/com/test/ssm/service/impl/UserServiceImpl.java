package com.test.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.ssm.dao.IUserDao;
import com.test.ssm.entity.User;
import com.test.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}