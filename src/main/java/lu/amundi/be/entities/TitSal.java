package lu.amundi.be.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@Entity
@DiscriminatorValue("TIT")
public class TitSal extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String statutAff;
	private String typage;
	
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
	public TitSal(String statutAff, String typage) {
		super();
		this.statutAff = statutAff;
		this.typage = typage;
	}
	public TitSal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TitSal(String type, int numCompte, String libCompte, String ouvert, String lettrage) {
		super(type, numCompte, libCompte, ouvert, lettrage);
		// TODO Auto-generated constructor stub
	}
	
	

}
