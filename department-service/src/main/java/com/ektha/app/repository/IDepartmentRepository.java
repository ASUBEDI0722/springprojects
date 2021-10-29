package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Department;


public interface IDepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentId(Long departmentId);


}
