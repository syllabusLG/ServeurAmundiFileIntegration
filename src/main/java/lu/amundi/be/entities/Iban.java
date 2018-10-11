package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */

@Entity
public class Iban implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String iban;
	private String bic;
	private String iso;
	private String type;
	private String statut;
	private String utilisation;
	private String origin;
	@ManyToOne
	@JoinColumn(name="ID_IND")
	private Individu individu;
	
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getUtilisation() {
		return utilisation;
	}
	public void setUtilisation(String utilisation) {
		this.utilisation = utilisation;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Iban() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Individu getIndividu() {
		return individu;
	}
	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
	
	public Iban(String iban, String bic, String iso, String type, String statut, String utilisation, String origin,
			Individu individu) {
		super();
		this.iban = iban;
		this.bic = bic;
		this.iso = iso;
		this.type = type;
		this.statut = statut;
		this.utilisation = utilisation;
		this.origin = origin;
		this.individu = individu;
	}
	public Iban(String iban, String bic, String iso, String type, String statut, String utilisation, String origin) {
		super();
		this.iban = iban;
		this.bic = bic;
		this.iso = iso;
		this.type = type;
		this.statut = statut;
		this.utilisation = utilisation;
		this.origin = origin;
	}
	
	

}
