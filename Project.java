package entity;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project_tbl3")
public class Project {
	
	@Id
	//@GeneratedValue
	@Column(name="prodid")
	private int projectId;
	
	@Column(name="prodtitle",length=20)
	private String Title;
	
	@Column(name="prodcompdate")
	private LocalDate complitionDate;
	
	@ManyToMany
	@JoinTable(name="CustomerSubscriptionLink",
	joinColumns = {@JoinColumn(name="pid")},
	inverseJoinColumns = {@JoinColumn(name="eid")})
	Set<Employees> customers = new HashSet<Employees>();

	public Project() {
		super();
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public LocalDate getComplitionDate() {
		return complitionDate;
	}

	public void setComplitionDate(LocalDate complitionDate) {
		this.complitionDate = complitionDate;
	}
	
	

}
