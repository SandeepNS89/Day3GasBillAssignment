import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_tbl")
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name="prodid")
	private int projectId;
	
	@Column(name="prodtitle",length=20)
	private String Title;
	
	@Column(name="prodcompdate")
	private LocalDate complitionDate;

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
