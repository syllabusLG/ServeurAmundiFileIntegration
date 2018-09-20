package lu.amundi.be.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author AbousyllabaNdiaye
 * Entity Individu
 */

@Entity
public class Individu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nui;
	private int civility; 
	private String lastName;
	private String useName;
	private String firstName;
	private Date birthDate;
	private String birthPlace;
	private String birthCountry;
	private String nationality;
	@OneToMany(mappedBy="individu")
	private Collection<Compte> comptes;
	@OneToMany(mappedBy="individu")
	private Collection<Adresse> adresses;
	@OneToMany(mappedBy="individu")
	private Collection<Contact> contacts;
	@OneToMany(mappedBy="individu")
	private Collection<Iban> ibans;
	
	public String getNui() {
		return nui;
	}
	public void setNui(String nui) {
		this.nui = nui;
	}
	public int getCivility() {
		return civility;
	}
	public void setCivility(int civility) {
		this.civility = civility;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getBirthCountry() {
		return birthCountry;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public Collection<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(Collection<Adresse> adresses) {
		this.adresses = adresses;
	}
	public Collection<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}
	public Collection<Iban> getIbans() {
		return ibans;
	}
	public void setIbans(Collection<Iban> ibans) {
		this.ibans = ibans;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nui == null) ? 0 : nui.hashCode());
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
		Individu other = (Individu) obj;
		if (nui == null) {
			if (other.nui != null)
				return false;
		} else if (!nui.equals(other.nui))
			return false;
		return true;
	}
	public Individu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Individu(String nui, int civility, String lastName, String useName, String firstName, Date birthDate,
			String birthPlace, String birthCountry, String nationality) {
		super();
		this.nui = nui;
		this.civility = civility;
		this.lastName = lastName;
		this.useName = useName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.birthCountry = birthCountry;
		this.nationality = nationality;
	}
	public Individu(int civility, String lastName, String useName, String firstName, Date birthDate, String birthPlace,
			String birthCountry, String nationality) {
		super();
		this.civility = civility;
		this.lastName = lastName;
		this.useName = useName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.birthCountry = birthCountry;
		this.nationality = nationality;
	}
	public Individu(String nui, int civility, String lastName, String useName, String firstName, Date birthDate,
			String birthPlace, String birthCountry, String nationality, Collection<Compte> comptes,
			Collection<Adresse> adresses, Collection<Contact> contacts, Collection<Iban> ibans) {
		super();
		this.nui = nui;
		this.civility = civility;
		this.lastName = lastName;
		this.useName = useName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.birthCountry = birthCountry;
		this.nationality = nationality;
		this.comptes = comptes;
		this.adresses = adresses;
		this.contacts = contacts;
		this.ibans = ibans;
	}
	
}
