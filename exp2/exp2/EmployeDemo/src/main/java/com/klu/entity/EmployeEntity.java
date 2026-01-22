package com.klu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class EmployeEntity {
	@Id
	int empid;
	String empname;
	int age;
	double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeEntity(int empid, String empname, int age, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeEntity [empid=" + empid + ", empname=" + empname + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
