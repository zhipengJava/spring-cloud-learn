package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.exception.DemoBussinessException;
import com.example.demo.dto.UserDto;
import com.example.demo.email.MailBean;
import com.example.demo.email.DemoMailSender;
@RestController
@RequestMapping("/learnAction")
public class LearnAction {
	Log logger = LogFactory.getLog(LearnAction.class);
	
	@Autowired
	private DemoMailSender mailSender;
	
	@RequestMapping(path="/getUserInfo/{userId}")
	public UserDto getUserInfo(@PathVariable("userId")  String userId) throws DemoBussinessException {
		logger.info("获取用户信息开始,用户id为:"+userId);
		UserDto user = new UserDto();
		MailBean mailBean = new MailBean();
		 StringBuilder sb = new StringBuilder();
         sb.append("<h1>SpirngBoot测试邮件HTML</h1>")
                 .append("\"<p style='color:#F00'>你是真的太棒了！</p>")
                 .append("<p style='text-align:right'>右对齐</p>");
		mailBean.setContent(sb.toString());
		mailBean.setRecipient("841393415@qq.com");
		mailBean.setSubject("测试");
		mailSender.sendSimpleMail(mailBean);
		logger.info("获取用户信息结束,用户id为:"+userId);
		return user;
	}
	
}
