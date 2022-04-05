
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import entity.Employees;

import entity.Employee;
import entity.Project;


public class CrudTestingManyToMany {

	EntityManagerFactory emf;
	EntityManager em ;
	
	public CrudTestingManyToMany() {
		System.out.println("CrudTestingManyToMany()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}
	
	

	@Test
	public void createEmployeesTest() {
		
		Employees theEmp = new Employees();
		theEmp.setEmployeeNumber(1111);
		theEmp.setName("Julie");
		theEmp.setJob("Manager");
		theEmp.setJoiningDate(LocalDate.of(2018, 6, 22));
		theEmp.setSalary(52000);
		theEmp.setAge(22); 
		
		Employees theEmp1 = new Employees();
		theEmp1.setEmployeeNumber(1211);
		theEmp1.setName("John");
		theEmp1.setJob("Manager");
		theEmp1.setJoiningDate(LocalDate.of(2018, 6, 22));
		theEmp1.setSalary(52000);
		theEmp1.setAge(22); 
		
		Employees theEmp2 = new Employees();
		theEmp2.setEmployeeNumber(1311);
		theEmp2.setName("Julie");
		theEmp2.setJob("Manager");
		theEmp2.setJoiningDate(LocalDate.of(2018, 6, 22));
		theEmp2.setSalary(52000);
		theEmp2.setAge(22); 
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(theEmp);
			em.persist(theEmp1);
			em.persist(theEmp2);
		tx.commit();
	}
	
	@Test
	public void createProjectsTest() {
		
		Project proj = new Project();
		proj.setProjectId(111);
		proj.setTitle("Payment");
		proj.setComplitionDate(LocalDate.of(2023, 9, 12));
		
		Project proj1 = new Project();
		proj1.setProjectId(112);
		proj1.setTitle("RailWay");
		proj1.setComplitionDate(LocalDate.of(2022, 9, 12));
		
		Project proj2 = new Project();
		proj2.setProjectId(113);
		proj2.setTitle("Air");
		proj2.setComplitionDate(LocalDate.of(2022, 9, 2));
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(proj);
			em.persist(proj1);
			em.persist(proj2);
		tx.commit();
	}
	
	@Test
	public void assingProjectToExistingEmployee() {
		
		Employees theEmp1 = em.find(Employees.class, 1211);
		
		Project proj = new Project();
		proj.setProjectId(111);
		proj.setTitle("Payment");
		proj.setComplitionDate(LocalDate.of(2023, 9, 12));
		
		Project proj1 = new Project();
		proj1.setProjectId(112);
		proj1.setTitle("RailWay");
		proj1.setComplitionDate(LocalDate.of(2022, 9, 12));
		
		Project proj2 = new Project();
		proj2.setProjectId(113);
		proj2.setTitle("Air");
		proj2.setComplitionDate(LocalDate.of(2022, 9, 2));
		
		
		
		theEmp1.getSubscriptions().add(proj);
		theEmp1.getSubscriptions().add(proj1);
		theEmp1.getSubscriptions().add(proj2);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(theEmp1);
		et.commit();
	}
	}