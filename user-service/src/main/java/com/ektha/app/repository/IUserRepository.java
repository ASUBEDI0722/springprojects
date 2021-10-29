package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long userId);


}
