package lu.amundi.be.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */

@Entity
public  class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String numCompte;
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
	@JsonIgnore
	@OneToMany(mappedBy="compte", fetch = FetchType.LAZY)
	private Collection<Positions> positions;
	@JsonIgnore
	@OneToMany(mappedBy="compte", fetch = FetchType.LAZY)
	private Collection<Mouvements> mouvements;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
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
	public Collection<Positions> getPositions() {
		return positions;
	}
	public void setPositions(Collection<Positions> positions) {
		this.positions = positions;
	}
	
	public Collection<Mouvements> getMouvements() {
		return mouvements;
	}
	public void setMouvements(Collection<Mouvements> mouvements) {
		this.mouvements = mouvements;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
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
	public Compte(String numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
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
	public Compte(String numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
			String statutAff, String typage, String typeCompte, Individu individu, Collection<Positions> positions) {
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
		this.positions = positions;
	}
	public Compte(String numCompte, String type, String libCompte, String ouvert, String lettrage, int idCptPc,
			String statutAff, String typage, String typeCompte, Individu individu, Collection<Positions> positions,
			Collection<Mouvements> mouvements) {
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
		this.positions = positions;
		this.mouvements = mouvements;
	}
	
}
