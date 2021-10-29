package com.ektha.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.VO.ResponseTemplateVO;
import com.ektha.app.dao.UserDAO;
import com.ektha.app.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public User saveUser(User user) {
		return userDAO.saveUser(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		return userDAO.getUserWithDepartment(userId);
	}

}
