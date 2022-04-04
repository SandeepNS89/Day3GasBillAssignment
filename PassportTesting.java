import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassportTesting {
	
	
	EntityManagerFactory emf;
	EntityManager em;
	public PassportTesting()
	{
		System.out.println("Reading persistence.xml file...");
		this.emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		this.em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}
	
	@Test
	public void addPassportTest()
	{
		EntityTransaction et = em.getTransaction();
		
		Passport passport = new Passport();
		//passport.setPassportId(12345);
		passport.setIssuedBy("GOI");
		passport.setIssuedDate(LocalDate.of(2021, 12, 02));
		passport.setExpiryDate(LocalDate.of(2031, 12, 02));
		
		Passport passport1 = new Passport();
		//passport1.setPassportId(12346);
		passport1.setIssuedBy("GOS");
		passport1.setIssuedDate(LocalDate.of(2021, 1, 02));
		passport1.setExpiryDate(LocalDate.of(2031, 1, 02));
		
		Passport passport2 = new Passport();
		//passport2.setPassportId(12345);
		passport2.setIssuedBy("GON");
		passport2.setIssuedDate(LocalDate.of(2021, 11, 02));
		passport2.setExpiryDate(LocalDate.of(2031, 11, 02));
		et.begin();
		em.persist(passport);
		em.persist(passport1);
		em.persist(passport2);
		et.commit();
	}


@Test
public void findPassportTest()
{
	EntityTransaction et = em.getTransaction();
	Passport passport = em.find(Passport.class, 2);
	Assertions.assertTrue(passport != null);
	System.out.println("Passport number      : "+passport.getPassportId());
	System.out.println("Passport Issued by   : "+passport.getIssuedBy());
	System.out.println("Passport Issued Date : "+passport.getIssuedDate());
	System.out.println("Passport Expiry Date : "+passport.getExpiryDate());
}

@Test
public void findAllPassportTest()
{
		Query query = em.createQuery("from Passport");
		List<Passport> staff = query.getResultList();
		
		Assertions.assertTrue(staff.size() >0);
		for(Passport passport : staff)
		{
			System.out.println("Passport number      : "+passport.getPassportId());
			System.out.println("Passport Issued by   : "+passport.getIssuedBy());
			System.out.println("Passport Issued Date : "+passport.getIssuedDate());
			System.out.println("Passport Expiry Date : "+passport.getExpiryDate());
			System.out.println("---------------------------------------------------");
		}
}

@Test
public void modifyPassportTest()
{
	EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em != null);
	et.begin();
	Passport passport = em.find(Passport.class, 6);
	Assertions.assertTrue(passport != null);
	System.out.println("Passport number      : "+passport.getPassportId());
	System.out.println("Passport Issued by   : "+passport.getIssuedBy());
	System.out.println("Passport Issued Date : "+passport.getIssuedDate());
	System.out.println("Passport Expiry Date : "+passport.getExpiryDate());
	
	System.out.println("updating.....");
	passport.setIssuedBy("GOI");
	em.merge(passport);
	et.commit();
	
}
@Test
public void deletePassportTest()
{
	EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em != null);
	et.begin();
	Passport passport = em.find(Passport.class, 6);
	Assertions.assertTrue(passport != null);
	System.out.println("Passport number      : "+passport.getPassportId());
	System.out.println("Passport Issued by   : "+passport.getIssuedBy());
	System.out.println("Passport Issued Date : "+passport.getIssuedDate());
	System.out.println("Passport Expiry Date : "+passport.getExpiryDate());
	
	System.out.println("updating.....");
	em.remove(passport);
	et.commit();
	
}
}