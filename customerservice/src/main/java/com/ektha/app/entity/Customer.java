package com.ektha.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int id;
	private String name;
	private String city;
	private String email;

}
