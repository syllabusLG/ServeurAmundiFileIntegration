package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
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
	private String refInstrument;
	private int quantiteInstrument;
	private String nav;
	private String pruInstrument;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateCompte;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateValeur;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateOperation;
	@ManyToOne
	@JoinColumn(name="NUM_COMPTE")
	private Compte compte;
	
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
	public String getRefInstrument() {
		return refInstrument;
	}
	public void setRefInstrument(String refInstrument) {
		this.refInstrument = refInstrument;
	}
	public int getQuantiteInstrument() {
		return quantiteInstrument;
	}
	public void setQuantiteInstrument(int quantiteInstrument) {
		this.quantiteInstrument = quantiteInstrument;
	}
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}
	public String getPruInstrument() {
		return pruInstrument;
	}
	public void setPruInstrument(String pruInstrument) {
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
	public Mouvements(String numMouvement, String sens, String refInstrument, int quantiteInstrument, String nav,
			String pruInstrument, LocalDate dateCompte, LocalDate dateValeur, LocalDate dateOperation, Compte compte) {
		super();
		this.numMouvement = numMouvement;
		this.sens = sens;
		this.refInstrument = refInstrument;
		this.quantiteInstrument = quantiteInstrument;
		this.nav = nav;
		this.pruInstrument = pruInstrument;
		this.dateCompte = dateCompte;
		this.dateValeur = dateValeur;
		this.dateOperation = dateOperation;
		this.compte = compte;
	}
	public Mouvements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
