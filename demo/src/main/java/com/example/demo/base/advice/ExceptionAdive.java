package com.example.demo.base.advice;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.base.exception.DemoBussinessException;

@Component
@ControllerAdvice
public class ExceptionAdive {
	
	Log logger = LogFactory.getLog(ExceptionAdive.class); 
	@ResponseBody  
	@ExceptionHandler(DemoBussinessException.class)
	public Object DemoBussinessExceptionHandler(DemoBussinessException demoBussinessException) {
		Map<String,Object> result = new HashMap<>();
		result.put("code", "9999");
		result.put("msg", "失败");
		result.put("data", demoBussinessException.getMsg());
		return result;
	}
	
	@ResponseBody  
	@ExceptionHandler(Exception.class)
	public Object ExceptionHandler(Exception exception) {
		logger.error("系统出现异常", exception);
		Map<String,Object> result = new HashMap<>();
		result.put("code", "9999");
		result.put("msg", "失败");
		result.put("data", "系统异常,请稍后重试");
		return result;
	}

}
