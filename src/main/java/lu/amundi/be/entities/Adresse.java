package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Entity
public class Adresse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String numberStreet;
	private String street;
	private String additionalAdress_1;
	private String additionalAdress_2;
	private String additionalAdress_3;
	private String codePostal;
	private String city;
	private String country;
	private String country_lib;
	private String resident;
	private String nif;
	private String typeAdresse;
	@ManyToOne
	@JoinColumn(name="ID_IND")
	private Individu individu;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumberStreet() {
		return numberStreet;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAdditionalAdress_1() {
		return additionalAdress_1;
	}
	public void setAdditionalAdress_1(String additionalAdress_1) {
		this.additionalAdress_1 = additionalAdress_1;
	}
	public String getAdditionalAdress_2() {
		return additionalAdress_2;
	}
	public void setAdditionalAdress_2(String additionalAdress_2) {
		this.additionalAdress_2 = additionalAdress_2;
	}
	public String getAdditionalAdress_3() {
		return additionalAdress_3;
	}
	public void setAdditionalAdress_3(String additionalAdress_3) {
		this.additionalAdress_3 = additionalAdress_3;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry_lib() {
		return country_lib;
	}
	public void setCountry_lib(String country_lib) {
		this.country_lib = country_lib;
	}
	public String getResident() {
		return resident;
	}
	public void setResident(String resident) {
		this.resident = resident;
	}
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTypeAdresse() {
		return typeAdresse;
	}
	public void setTypeAdresse(String typeAdresse) {
		this.typeAdresse = typeAdresse;
	}
	public void setNumberStreet(String numberStreet) {
		this.numberStreet = numberStreet;
	}
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	
	public Adresse(String id, String numberStreet, String street, String additionalAdress_1, String additionalAdress_2,
			String additionalAdress_3, String codePostal, String city, String country, String country_lib,
			String resident, String nif, String typeAdresse) {
		super();
		this.id = id;
		this.numberStreet = numberStreet;
		this.street = street;
		this.additionalAdress_1 = additionalAdress_1;
		this.additionalAdress_2 = additionalAdress_2;
		this.additionalAdress_3 = additionalAdress_3;
		this.codePostal = codePostal;
		this.city = city;
		this.country = country;
		this.country_lib = country_lib;
		this.resident = resident;
		this.nif = nif;
		this.typeAdresse = typeAdresse;
	}
	
	public Adresse(String id, String numberStreet, String street, String additionalAdress_1, String additionalAdress_2,
			String additionalAdress_3, String codePostal, String city, String country, String country_lib,
			String resident, String nif, String typeAdresse, Individu individu) {
		super();
		this.id = id;
		this.numberStreet = numberStreet;
		this.street = street;
		this.additionalAdress_1 = additionalAdress_1;
		this.additionalAdress_2 = additionalAdress_2;
		this.additionalAdress_3 = additionalAdress_3;
		this.codePostal = codePostal;
		this.city = city;
		this.country = country;
		this.country_lib = country_lib;
		this.resident = resident;
		this.nif = nif;
		this.typeAdresse = typeAdresse;
		this.individu = individu;
	}
	public Adresse() {
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
		Adresse other = (Adresse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
			
		return true;
	}
	
	
}
