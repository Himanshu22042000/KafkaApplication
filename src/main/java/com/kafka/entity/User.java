package com.kafka.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class User {
	
	private String name;
	private String dept;
	private long salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public User(String name, String dept, long l) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = l;
	}
	
	
}
