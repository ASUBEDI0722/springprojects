package com.ektha.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Department;
import com.ektha.app.repository.IDepartmentRepository;

@Repository
public class DepartmentDAO {

	@Autowired
	private IDepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		System.out.println(department);
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
