import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectTest {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public ProjectTest()
	{
		System.out.println("Reading persistence.xml file...");
		this.emf=Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		this.em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}
	
	@Test
	public void addProjectTest() {
		
		EntityTransaction et =em.getTransaction();
		Project proj = new Project();
		//proj.setProjectId(111);
		proj.setTitle("Payment");
		proj.setComplitionDate(LocalDate.of(2023, 9, 12));
		
		Project proj1 = new Project();
		//proj1.setProjectId(111);
		proj1.setTitle("RailWay");
		proj1.setComplitionDate(LocalDate.of(2022, 9, 12));
		
		Project proj2 = new Project();
		//proj2.setProjectId(111);
		proj2.setTitle("Air");
		proj2.setComplitionDate(LocalDate.of(2022, 9, 2));
		et.begin();
		em.persist(proj);
		em.persist(proj1);
		em.persist(proj2);
		et.commit();
	}
	
	@Test
	public void findProjectTest()
	{
		EntityTransaction et =em.getTransaction();
		Project proj =em.find(Project.class, 8);
		Assertions.assertTrue(proj != null);
		System.out.println("Project number      : "+proj.getProjectId());
		System.out.println("Project name   : "+proj.getTitle());
		System.out.println("Project completion Date : "+proj.getComplitionDate());	
	}
	
	@Test
	public void modifyProjectTest()
	{
		EntityTransaction et =em.getTransaction();
		et.begin();
		Project proj =em.find(Project.class, 8);
		Assertions.assertTrue(proj != null);
		System.out.println("Project number      : "+proj.getProjectId());
		System.out.println("Project name   : "+proj.getTitle());
		System.out.println("Project completion Date : "+proj.getComplitionDate());	
	
		System.out.println("updating.....");
		proj.setTitle("Banking");
		em.merge(proj);
		et.commit();
		
	
	}
	@Test
	public void deleteProjectTest()
	{
		EntityTransaction et =em.getTransaction();
		et.begin();
		Project proj =em.find(Project.class, 8);
		Assertions.assertTrue(proj != null);
		System.out.println("Project number      : "+proj.getProjectId());
		System.out.println("Project name   : "+proj.getTitle());
		System.out.println("Project completion Date : "+proj.getComplitionDate());	
	
		System.out.println("deleting.....");
		em.remove(proj);
		et.commit();
		
	
	}
	
	

}
