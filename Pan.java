package entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pan_tbl2")
public class Pan {
	@Id
	//@GeneratedValue
	@Column(name="pan_no",length=20)
	private String panNumber;
	
	@Column(name="pan_issuedate")
	private LocalDate issuedDate;
	
	@Column(name="pan_issuedby",length=20)
	private String IssuedBy;
	
	@OneToOne
	private Employee emp;

	
	public Pan() {
		super();
	}


	public Pan(String panNumber, LocalDate issuedDate, String issuedBy, Employee emp) {
		super();
		this.panNumber = panNumber;
		this.issuedDate = issuedDate;
		IssuedBy = issuedBy;
		this.emp = emp;
	}


	public String getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}


	public LocalDate getIssuedDate() {
		return issuedDate;
	}


	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}


	public String getIssuedBy() {
		return IssuedBy;
	}


	public void setIssuedBy(String issuedBy) {
		IssuedBy = issuedBy;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	
}
