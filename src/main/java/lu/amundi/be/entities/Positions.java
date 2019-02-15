package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPosition;
	private float quantiteInstrument;
	private float pruInstrument;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dateUpdate;
	@OneToOne
	@JoinColumn(name="REF_INSTRUMENT")
	private Instruments instruments;
	@ManyToOne
	@JoinColumn(name="NUM_COMPTE")
	private Compte compte;
	
	public Long getIdPosition() {
		return idPosition;
	}
	public void setIdPosition(Long idPosition) {
		this.idPosition = idPosition;
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
	public Positions(Long idPosition, Instruments instruments, float quantiteInstrument, float pruInstrument,
			LocalDate dateUpdate, Compte compte) {
		super();
		this.idPosition = idPosition;
		this.instruments = instruments;
		this.quantiteInstrument = quantiteInstrument;
		this.pruInstrument = pruInstrument;
		this.dateUpdate = dateUpdate;
		this.compte = compte;
	}
	public Positions() {
		super();
	}
	

}
