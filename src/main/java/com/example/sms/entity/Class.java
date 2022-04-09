package com.example.sms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "classes")
public class Class {
	
	//need to add a PK
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "class_name", nullable = false)
	private String className;
	
	@ManyToMany(mappedBy = "classes")
	private List<User> users = new ArrayList<>();
	
	public Class() {
		
	}
	
	public Class(String className) {
		super();
		this.className = className;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClasstName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "Class [id = " +id+ ", name = " +className+ "]";
	}
}
