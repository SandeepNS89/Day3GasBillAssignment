package entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//1. create a pojo

/*
 * create table emp_tbl
 * (
 * 		emp_no int primary key,
 * 		emp_name varchar(20),
 * 		emp_job varchar(20),
 * 		emp_doj date,
 * 		emp_sal int,
 * );
 * 
 * 		Object	Relation	Mapping
 */
@Entity
@Table(name="emp_tbl4")
public class Employee {


	@Id
	//@GeneratedValue
	@Column(name="emp_no")
	private int employeeNumber;
	
	@Column(name="emp_name", length = 20)
	private String name;
	
	@Column(name="emp_job", length = 20)
	private String job;
	
	@Column(name="emp_doj")
	private LocalDate joiningDate;
	
	@Column(name="emp_sal")
	private double salary;
	
	@Column(name="emp_age")
	private Integer age;
	
//	@OneToOne( cascade = CascadeType.ALL)
//	@JoinColumn(name="panno")
//	private Pan pan;
	
	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL)
	Set<Address> address = new HashSet<Address>();
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="EmployeeProjectLink",
	joinColumns = {@JoinColumn(name="eid")},
	inverseJoinColumns = {@JoinColumn(name="pid")})
	Set<Project> subscriptions = new HashSet<Project>();
	
	public Employee() {
		super();
		System.out.println("Employee created....");
	}
	
	
	public Employee(int employeeNumber, String name, String job, LocalDate joiningDate, double salary, Integer age)
			 {
		super();
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.job = job;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.age = age;
		
	}


//	public Employee(int employeeNumber, String name, String job, LocalDate joiningDate, double salary, Integer age,
//			Pan pan) {
//		super();
//		this.employeeNumber = employeeNumber;
//		this.name = name;
//		this.job = job;
//		this.joiningDate = joiningDate;
//		this.salary = salary;
//		this.age = age;
//		this.pan = pan;
//	}


//	public Pan getPan() {
//		return pan;
//	}
//
//
//	public void setPan(Pan pan) {
//		this.pan = pan;
//	}


	public Set<Project> getSubscriptions() {
		return subscriptions;
	}


	public void setSubscriptions(Set<Project> subscriptions) {
		this.subscriptions = subscriptions;
	}


	public Set<Address> getAddress() {
		return address;
	}


	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
	
	