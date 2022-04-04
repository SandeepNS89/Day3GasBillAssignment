import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="passport_tbl")
public class Passport {
    @Id
    @GeneratedValue
    @Column(name="pid")
	private int passportId;
    
    @Column(name="issuedby", length=20)
	private String issuedBy;
    
    @Column(name="issueddate")
	private LocalDate issuedDate;
    
    @Column(name="expireddate")
	private LocalDate ExpiryDate;

	public Passport() {
		super();
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}
	
    
    
    
}
