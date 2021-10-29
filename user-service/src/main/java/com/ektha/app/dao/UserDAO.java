package com.ektha.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ektha.app.VO.Department;
import com.ektha.app.VO.ResponseTemplateVO;
import com.ektha.app.entity.User;
import com.ektha.app.repository.IUserRepository;

@Repository
public class UserDAO {

	@Autowired
	private IUserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);

		/*
		 * Department department =
		 * restTemplate.getForObject("http://localhost:9001/departments/" +
		 * user.getDepartmentId(), Department.class);
		 */

		Department department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

		vo.setUser(user);
		vo.setDepartment(department);

		return vo;

	}
}