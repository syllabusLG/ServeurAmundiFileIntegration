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
@DiscriminatorValue("CASH")
public class CashSal extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idCptPc;

	public int getIdCptPc() {
		return idCptPc;
	}

	public void setIdCptPc(int idCptPc) {
		this.idCptPc = idCptPc;
	}

	public CashSal(int idCptPc) {
		super();
		this.idCptPc = idCptPc;
	}

	public CashSal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashSal(String type, int numCompte, String libCompte, String ouvert, String lettrage) {
		super(type, numCompte, libCompte, ouvert, lettrage);
		// TODO Auto-generated constructor stub
	}
	

}
