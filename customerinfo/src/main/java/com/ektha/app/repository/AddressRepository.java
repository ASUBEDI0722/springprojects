package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
