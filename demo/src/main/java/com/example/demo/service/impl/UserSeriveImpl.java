package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.base.exception.DemoBussinessException;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@Service
public class UserSeriveImpl implements UserService{

	@Override
	public UserDto getUserInfo(String userId) throws DemoBussinessException {
		if("123".equals(userId)) {
			throw new DemoBussinessException("123", "不是id为123");
		}
		if("1234".equals(userId)) {
			String s = null;
			s.getBytes();
		}
		UserDto user = new UserDto();
		user.setUserId(userId);
		user.setUserName("zhangsan");
		user.setPwd("123");
		return user;
	}

}
