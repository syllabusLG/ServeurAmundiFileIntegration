package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Entity
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String idContact;
	private String homePhone;
	private String businessPhone;
	private String personalEmail;
	private String businessEmail;
	private String cellPhone;
	@ManyToOne
	@JoinColumn(name="ID_IND")
	private Individu individu;
	
	public String getIdContact() {
		return idContact;
	}
	public void setIdContact(String idContact) {
		this.idContact = idContact;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getBusinessPhone() {
		return businessPhone;
	}
	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getBusinessEmail() {
		return businessEmail;
	}
	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String idContact, String homePhone, String businessPhone, String personalEmail, String businessEmail,
			String cellPhone) {
		super();
		this.idContact = idContact;
		this.homePhone = homePhone;
		this.businessPhone = businessPhone;
		this.personalEmail = personalEmail;
		this.businessEmail = businessEmail;
		this.cellPhone = cellPhone;
	}
	
	public Contact(String idContact, String homePhone, String businessPhone, String personalEmail, String businessEmail, String cellPhone,
			Individu individu) {
		super();
		this.idContact = idContact;
		this.homePhone = homePhone;
		this.businessPhone = businessPhone;
		this.personalEmail = personalEmail;
		this.businessEmail = businessEmail;
		this.cellPhone = cellPhone;
		this.individu = individu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContact == null) ? 0 : idContact.hashCode());
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
		Contact other = (Contact) obj;
		if (idContact == null) {
			if (other.idContact != null)
				return false;
		} else if (!idContact.equals(other.idContact))
			return false;
		return true;
	}
	
	

}
