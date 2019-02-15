package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Entity Movment
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Entity
public class Mouvements implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String numMouvement;
	private String sens;
	private float quantiteInstrument;
	private float nav;
	private float pruInstrument;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateCompte;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateValeur;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateOperation;
	@OneToOne
	@JoinColumn(name="REF_INSTRUMENT")
	private Instruments instruments;
	@OneToOne
	@JoinColumn(name="ID_POSITION")
	private Positions position;
	@ManyToOne
	@JoinColumn(name="NUM_COMPTE")
	private Compte compte;
	private String idEntityMere;
	
	public String getNumMouvement() {
		return numMouvement;
	}
	public void setNumMouvement(String numMouvement) {
		this.numMouvement = numMouvement;
	}
	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	
	public Instruments getInstruments() {
		return instruments;
	}
	public void setInstruments(Instruments instruments) {
		this.instruments = instruments;
	}
	public float getQuantiteInstrument() {
		return quantiteInstrument;
	}
	public void setQuantiteInstrument(float quantiteInstrument) {
		this.quantiteInstrument = quantiteInstrument;
	}
	public float getNav() {
		return nav;
	}
	public void setNav(float nav) {
		this.nav = nav;
	}
	public float getPruInstrument() {
		return pruInstrument;
	}
	public void setPruInstrument(float pruInstrument) {
		this.pruInstrument = pruInstrument;
	}
	public LocalDate getDateCompte() {
		return dateCompte;
	}
	public void setDateCompte(LocalDate dateCompte) {
		this.dateCompte = dateCompte;
	}
	public LocalDate getDateValeur() {
		return dateValeur;
	}
	public void setDateValeur(LocalDate dateValeur) {
		this.dateValeur = dateValeur;
	}
	public LocalDate getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(LocalDate dateOperation) {
		this.dateOperation = dateOperation;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public Positions getPosition() {
		return position;
	}
	public void setPosition(Positions position) {
		this.position = position;
	}
	public String getIdEntityMere() {
		return idEntityMere;
	}
	public void setIdEntityMere(String idEntityMere) {
		this.idEntityMere = idEntityMere;
	}
	public Mouvements(String numMouvement, String sens, Instruments instruments, float quantiteInstrument, float nav,
			float pruInstrument, LocalDate dateCompte, LocalDate dateValeur, LocalDate dateOperation, Compte compte, Positions position, String idEntityMere) {
		super();
		this.numMouvement = numMouvement;
		this.sens = sens;
		this.instruments = instruments;
		this.quantiteInstrument = quantiteInstrument;
		this.nav = nav;
		this.pruInstrument = pruInstrument;
		this.dateCompte = dateCompte;
		this.dateValeur = dateValeur;
		this.dateOperation = dateOperation;
		this.compte = compte;
		this.position = position;
		this.idEntityMere = idEntityMere;
	}
	public Mouvements() {
		super();
	}
	
	
}
