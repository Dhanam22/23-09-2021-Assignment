package com.src.model;

public class Employee {
	 
	 private int id;
	 private String name;
	 private String dateofbirth;
	 private int salary;
	 private String designation;
	 private String startdate;
	 private String enddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + ", salary=" + salary
				+ ", designation=" + designation + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	public Employee(int id, String name, String dateofbirth, int salary, String designation, String startdate,
			String enddate) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.salary = salary;
		this.designation = designation;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	
	 
}
