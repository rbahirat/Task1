package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="students")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	
	private long id;
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="batch")
	private long batch;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBatch() {
		return batch;
	}
	public void setBatch(long batch) {
		this.batch = batch;
	}
	

	
	
}
