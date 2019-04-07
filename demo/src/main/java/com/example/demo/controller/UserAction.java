package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseAction;
import com.example.demo.base.exception.DemoBussinessException;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/userAction")
public class UserAction extends BaseAction{
	Log logger = LogFactory.getLog(UserAction.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/getUserInfo/{userId}")
	public UserDto getUserInfo(@PathVariable("userId") String userId) throws DemoBussinessException {
		logger.info("获取用户信息开始,用户id为:"+userId);
		UserDto user = userService.getUserInfo(userId);
		logger.info("获取用户信息结束,用户id为:"+userId);
		return user;
	}
	
}
