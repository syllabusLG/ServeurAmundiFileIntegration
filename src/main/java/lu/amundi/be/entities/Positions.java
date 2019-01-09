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
public class Positions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String idPosition;
	private String refInstrument;
	private int quantiteInstrument;
	private float pruInstrument;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateUpdate;
	@ManyToOne
	@JoinColumn(name="NUM_COMPTE")
	private Compte compte;
	
	public String getIdPosition() {
		return idPosition;
	}
	public void setIdPosition(String idPosition) {
		this.idPosition = idPosition;
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
	public float getPruInstrument() {
		return pruInstrument;
	}
	public void setPruInstrument(float pruInstrument) {
		this.pruInstrument = pruInstrument;
	}
	public LocalDate getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(LocalDate dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Positions(String idPosition, String refInstrument, int quantiteInstrument, float pruInstrument,
			LocalDate dateUpdate, Compte compte) {
		super();
		this.idPosition = idPosition;
		this.refInstrument = refInstrument;
		this.quantiteInstrument = quantiteInstrument;
		this.pruInstrument = pruInstrument;
		this.dateUpdate = dateUpdate;
		this.compte = compte;
	}
	public Positions() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
