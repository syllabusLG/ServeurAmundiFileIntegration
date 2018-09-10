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
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="MODE", discriminatorType = DiscriminatorType.STRING, length=4)
public abstract class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	private int numCompte;
	private String libCompte;
	private String ouvert;
	private String lettrage;
	@ManyToOne
	@JoinColumn(name="ID_IND")
	private Individu individu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
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
	public Compte(String type, int numCompte, String libCompte, String ouvert, String lettrage) {
		super();
		this.type = type;
		this.numCompte = numCompte;
		this.libCompte = libCompte;
		this.ouvert = ouvert;
		this.lettrage = lettrage;
	}
	public Compte(String type, int numCompte, String libCompte, String ouvert, String lettrage, Individu individu) {
		super();
		this.type = type;
		this.numCompte = numCompte;
		this.libCompte = libCompte;
		this.ouvert = ouvert;
		this.lettrage = lettrage;
		this.individu = individu;
	}
	
	

}
