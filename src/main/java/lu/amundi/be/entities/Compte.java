package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */

@Entity
public  class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long numCompte;
	private String type;
	private String libCompte;
	private String ouvert;
	private String lettrage;
	private int idCptPc;
	private String statutAff;
	private String typage;
	private String typeCompte;
	@ManyToOne
	@JoinColumn(name="ID_IND")
	private Individu individu;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}
	public String getLibCompte() {
		return libCompte;
	}
	public void setLibCompte(String libCompte) {
		this.libCompte = libCompte;
	}
	public String getOuvert() {
		return ouvert;
	}
	public void setOuvert(String ouvert) {
		this.ouvert = ouvert;
	}
	public String getLettrage() {
		return lettrage;
	}
	public void setLettrage(String lettrage) {
		this.lettrage = lettrage;
	}
	
	public int getIdCptPc() {
		return idCptPc;
	}

	public void setIdCptPc(int idCptPc) {
		this.idCptPc = idCptPc;
	}
	
	public String getStatutAff() {
		return statutAff;
	}
	public void setStatutAff(String statutAff) {
		this.statutAff = statutAff;
	}
	public String getTypage() {
		return typage;
	}
	public void setTypage(String typage) {
		this.typage = typage;
	}
	
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
			String statutAff, String typage, String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.type = type;
		this.libCompte = libCompte;
		this.ouvert = ouvert;
		this.lettrage = lettrage;
		this.idCptPc = idCptPc;
		this.statutAff = statutAff;
		this.typage = typage;
		this.typeCompte = typeCompte;
	}
	public Compte(Long numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
			String statutAff, String typage, String typeCompte, Individu individu) {
		super();
		this.numCompte = numCompte;
		this.type = type;
		this.libCompte = libCompte;
		this.ouvert = ouvert;
		this.lettrage = lettrage;
		this.idCptPc = idCptPc;
		this.statutAff = statutAff;
		this.typage = typage;
		this.typeCompte = typeCompte;
		this.individu = individu;
	}
	
	

}
