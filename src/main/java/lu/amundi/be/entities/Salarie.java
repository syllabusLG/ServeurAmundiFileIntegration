package lu.amundi.be.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author AbousyllabaNdiaye
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
	@Size(min=0, max=20)
	private String employeeId;
	@Size(min=0, max=2)
	private String employeeStatus;
	@Size(min=0, max=10)
	private String company_CD;
	@Size(min=0, max=50)
	private String spc;

	private String level_1;
	
	private String level_2;

	private String level_3;

	private String level_4;

	private String level_5;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date hireDate;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date departDate;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date lastHireDate;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date lastDepartDate;
	@Size(min=0, max=15)
	private String branch_CD;
	@Size(min=0, max=6)
	private String statut; 
	@Size(min=0, max=2)
	private String vip;
	@Size(min=0, max=2)
	private String mySensitive;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dateEndSensitive;
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
	public String getSpc() {
		return spc;
	}
	public void setSpc(String spc) {
		this.spc = spc;
	}
	public String getLevel_1() {
		return level_1;
	}
	public void setLevel_1(String level_1) {
		this.level_1 = level_1;
	}
	public String getLevel_2() {
		return level_2;
	}
	public void setLevel_2(String level_2) {
		this.level_2 = level_2;
	}
	public String getLevel_3() {
		return level_3;
	}
	public void setLevel_3(String level_3) {
		this.level_3 = level_3;
	}
	public String getLevel_4() {
		return level_4;
	}
	public void setLevel_4(String level_4) {
		this.level_4 = level_4;
	}
	public String getLevel_5() {
		return level_5;
	}
	public void setLevel_5(String level_5) {
		this.level_5 = level_5;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getLastHireDate() {
		return lastHireDate;
	}
	public void setLastHireDate(Date lastHireDate) {
		this.lastHireDate = lastHireDate;
	}
	public Date getLastDepartDate() {
		return lastDepartDate;
	}
	public void setLastDepartDate(Date lastDepartDate) {
		this.lastDepartDate = lastDepartDate;
	}
	public String getBranch_CD() {
		return branch_CD;
	}
	public void setBranch_CD(String branch_CD) {
		this.branch_CD = branch_CD;
	}
	public String getStatus() {
		return statut;
	}
	public void setStatus(String status) {
		this.statut = status;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	
	public String getMySensitive() {
		return mySensitive;
	}
	public void setMySensitive(String mySensitive) {
		this.mySensitive = mySensitive;
	}
	public Date getDateEndSensitive() {
		return dateEndSensitive;
	}
	public void setDateEndSensitive(Date dateEndSensitive) {
		this.dateEndSensitive = dateEndSensitive;
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
	
	public Salarie(@NotEmpty @Size(min = 2, max = 20) String employeeId, @Size(min = 1, max = 2) String employeeStatus,
			@Size(min = 2, max = 10) String company_CD, @Size(min = 2, max = 50) String spc,
			@Size(min = 2, max = 50) String level_1, @Size(min = 2, max = 50) String level_2,
			@Size(min = 2, max = 50) String level_3, @Size(min = 2, max = 50) String level_4,
			@Size(min = 2, max = 50) String level_5, Date hireDate, Date departDate, Date lastHireDate,
			Date lastDepartDate, @Size(min = 2, max = 15) String branch_CD, @Size(min = 1, max = 6) String status,
			@Size(min = 1, max = 2) String vip, @Size(min = 1, max = 2) String mySensitive, Date dateEndSensitive,
			Individu individu) {
		super();
		this.employeeId = employeeId;
		this.employeeStatus = employeeStatus;
		this.company_CD = company_CD;
		this.spc = spc;
		this.level_1 = level_1;
		this.level_2 = level_2;
		this.level_3 = level_3;
		this.level_4 = level_4;
		this.level_5 = level_5;
		this.hireDate = hireDate;
		this.departDate = departDate;
		this.lastHireDate = lastHireDate;
		this.lastDepartDate = lastDepartDate;
		this.branch_CD = branch_CD;
		this.statut = status;
		this.vip = vip;
		this.mySensitive = mySensitive;
		this.dateEndSensitive = dateEndSensitive;
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
