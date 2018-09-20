package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@Entity
public class Pays implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int code;
	private String alpha2;
	private String alpha3;
	private String nom_en_gb;
	private String nom_fr_fr;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getAlpha2() {
		return alpha2;
	}
	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}
	public String getAlpha3() {
		return alpha3;
	}
	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}
	public String getNom_en_gb() {
		return nom_en_gb;
	}
	public void setNom_en_gb(String nom_en_gb) {
		this.nom_en_gb = nom_en_gb;
	}
	public String getNom_fr_fr() {
		return nom_fr_fr;
	}
	public void setNom_fr_fr(String nom_fr_fr) {
		this.nom_fr_fr = nom_fr_fr;
	}
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pays(int code, String alpha2, String alpha3, String nom_en_gb, String nom_fr_fr) {
		super();
		this.code = code;
		this.alpha2 = alpha2;
		this.alpha3 = alpha3;
		this.nom_en_gb = nom_en_gb;
		this.nom_fr_fr = nom_fr_fr;
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
		Pays other = (Pays) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
