//
//import java.time.LocalDate;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import org.junit.jupiter.api.Test;
//
//import entity.Employee;
//import entity.Pan;
//
//
//public class CrudTestingOneToOne {
//
//	
//	EntityManagerFactory emf;
//	EntityManager em ;
//	
//	public CrudTestingOneToOne() {
//		System.out.println("CrudTesting()....");
//		// TODO Auto-generated method stub
//				System.out.println("Trying to read persistence.xml file...");
//				
//				//3
//				this.emf = Persistence.createEntityManagerFactory("MyJPA");
//				System.out.println("EntityManagerFactory created....");
//				
//				this.em = emf.createEntityManager();
//				System.out.println("EntityManager created....");
//	}
//
//	@Test
//	public void createNewEmployeeWithNewPanTest() {
//		
//		Employee theEmp = new Employee();
//		theEmp.setEmployeeNumber(11);
//		theEmp.setName("Julie");
//		theEmp.setJob("Manager");
//		theEmp.setJoiningDate(LocalDate.of(2018, 6, 22));
//		theEmp.setSalary(52000);
//		theEmp.setAge(22); 
//		
//		Pan pan = new Pan();
//		pan.setIssuedBy("Govt. Of. India");
//		pan.setIssuedDate(LocalDate.of(2011, 12, 25));
//		pan.setPanNumber("DYSPW2342R");
//		
//		theEmp.setPan(pan);
//		pan.setEmp(theEmp);
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//			em.persist(theEmp);
//			em.persist(pan);
//		tx.commit();
//	}
//	
//	@Test
//	public void addNewEmployeeWithoutPanTest() {
//		Employee theEmp = new Employee();
//		theEmp.setEmployeeNumber(16);
//		theEmp.setName("KUMAR");
//		theEmp.setJob("PROGRAMMER");
//		theEmp.setJoiningDate(LocalDate.of(2016, 6, 22));
//		theEmp.setSalary(162000);
//		theEmp.setAge(31); 
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//			em.persist(theEmp);
//		tx.commit();
//	}
//	
//	@Test
//	public void addNewPanWithoutAnEmployeeTest() {
//		Pan pan = new Pan();
//		pan.setIssuedBy("Govt. Of. India");
//		pan.setIssuedDate(LocalDate.of(2018, 12, 25));
//		pan.setPanNumber("RWQPW1322R");
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//			em.persist(pan);
//		tx.commit();
//	}
//	
//	@Test
//	public void assignExistingPanToExistingEmployee() {
//		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//			Pan pan = em.find(Pan.class, "DYSPW1342R");
//			Employee theEmp   = em.find(Employee.class, 12);
//		
//			pan.setEmp(theEmp);
//			theEmp.setPan(pan);
//			
//			em.merge(pan);
//			em.merge(theEmp);
//		tx.commit();	
//	}
//	
//	@Test
//	public void assignExistingPanToNewEmployee() {
//		EntityTransaction tx1 = em.getTransaction();
//		tx1.begin();
//		
//		Pan pan = em.find(Pan.class, "RWSPW1342R"); //ATTACHED
//			
//			Employee theEmp = new Employee(); //TRANSIENT
//			theEmp.setEmployeeNumber(14);
//			theEmp.setName("JONES");
//			theEmp.setJob("CLERK");
//			theEmp.setJoiningDate(LocalDate.of(2015, 6, 22));
//			theEmp.setSalary(72000);
//			theEmp.setAge(33);
//			theEmp.setPan(pan);
//			
//			pan.setEmp(theEmp);
//
//			em.persist(theEmp);
//			em.merge(pan);
//					
//		tx1.commit();
//	}
//	
//	@Test
//	public void assignNewPanToExistingEmployee() {
//		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//			
//			Employee theEmp   = em.find(Employee.class, 15);
//
//			Pan pan = new Pan();
//			pan.setIssuedBy("Govt. Of. India");
//			pan.setIssuedDate(LocalDate.of(2015, 12, 25));
//			pan.setPanNumber("DYPW1342R");
//			
//			pan.setEmp(theEmp);
//			theEmp.setPan(pan);
//			
//			em.persist(pan);
//			em.merge(theEmp);
//		tx.commit();
//	}
//	
//	
//	
//}