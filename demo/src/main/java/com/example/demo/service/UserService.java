package com.example.demo.service;

import com.example.demo.base.exception.DemoBussinessException;
import com.example.demo.dto.UserDto;

public interface UserService {
	UserDto getUserInfo(String userId) throws DemoBussinessException ;
}
