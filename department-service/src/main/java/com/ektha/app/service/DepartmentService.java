package com.ektha.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.DepartmentDAO;
import com.ektha.app.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	public Department saveDepartment(Department department) {
		return departmentDAO.saveDepartment(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentDAO.findByDepartmentId(departmentId);
	}
}
