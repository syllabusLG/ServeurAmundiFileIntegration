package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@Entity
public class Fiscalite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nif;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ADR")
	private Adresse adresse;
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Fiscalite(String nif, Adresse adresse) {
		super();
		this.nif = nif;
		this.adresse = adresse;
	}
	public Fiscalite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	

}
