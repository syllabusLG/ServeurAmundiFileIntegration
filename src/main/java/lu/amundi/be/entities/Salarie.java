package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */

@Entity
public class Salarie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotEmpty
	
	private String employeeId;
	@Size(min=0, max=2)
	private String employeeStatus;
	
	private String company_CD;

	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate hireDate;
	//@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate departDate;
	//@Temporal(TemporalType.DATE)
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_IND")
	private Individu individu;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public String getCompany_CD() {
		return company_CD;
	}
	public void setCompany_CD(String company_CD) {
		this.company_CD = company_CD;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public LocalDate getDepartDate() {
		return departDate;
	}
	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}
	
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	
	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Salarie(@NotEmpty String employeeId, @Size(min = 0, max = 2) String employeeStatus, String company_CD,
			LocalDate hireDate, LocalDate departDate, Individu individu) {
		super();
		this.employeeId = employeeId;
		this.employeeStatus = employeeStatus;
		this.company_CD = company_CD;
		this.hireDate = hireDate;
		this.departDate = departDate;
		this.individu = individu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salarie other = (Salarie) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
	
}
