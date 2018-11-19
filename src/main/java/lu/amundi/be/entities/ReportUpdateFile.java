package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Entity
public class ReportUpdateFile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String module;
	private int nbreLinesUpdated;
	private int nbreLinesRejected;
	private String role;
	private String username;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	public int getNbreLinesUpdated() {
		return nbreLinesUpdated;
	}
	public void setNbreLinesUpdated(int nbreLinesUpdated) {
		this.nbreLinesUpdated = nbreLinesUpdated;
	}
	public int getNbreLinesRejected() {
		return nbreLinesRejected;
	}
	public void setNbreLinesRejected(int nbreLinesRejected) {
		this.nbreLinesRejected = nbreLinesRejected;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ReportUpdateFile(String module, int nbreLinesUpdated, int nbreLinesRejected, String role, String username) {
		super();
		this.module = module;
		this.nbreLinesUpdated = nbreLinesUpdated;
		this.nbreLinesRejected = nbreLinesRejected;
		this.role = role;
		this.username = username;
	}
	public ReportUpdateFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ReportUpdateFile other = (ReportUpdateFile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
