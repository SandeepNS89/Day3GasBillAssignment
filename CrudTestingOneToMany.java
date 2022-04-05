
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import entity.Address;
import entity.Employee;

public class CrudTestingOneToMany {

	EntityManagerFactory emf;
	EntityManager em ;
	
	public CrudTestingOneToMany() {
		System.out.println("CrudTesting()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}
	
	@Test
	public void createNewEmployeeTest() {
		
		Employee emp = new Employee(100, "Richards", "Sales", LocalDate.of(2019, 3, 4), 46000, 34);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(emp);
		tx.commit();
	}
	

	@Test
	public void createNewEmployeeWithNewAddressTest() {
		Employee emp = new Employee(101, "Lewis", "Marketing", LocalDate.of(2018, 3, 8), 76000, 38);
		Address address1 = new Address(21, "Seawoods", "Navi Mumbai", "Maharastra", "India", 400607,emp);
		Address address2 = new Address(22, "Vijayanagar", "Bengaluru", "Karnataka", "India", 560072,emp);
		Set<Address> address =new HashSet<Address>();
		address.add(address1);
		address.add(address2);
		emp.setAddress(address);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(emp);
		tx.commit();
	}
}
	
	
