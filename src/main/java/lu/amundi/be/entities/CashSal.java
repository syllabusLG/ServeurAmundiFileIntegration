package lu.amundi.be.entities;

import java.io.Serializable;
/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
/*@Entity
@DiscriminatorValue("CASH")*/
public class CashSal extends Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idCptPc;

	public int getIdCptPc() {
		return idCptPc;
	}

	public void setIdCptPc(int idCptPc) {
		this.idCptPc = idCptPc;
	}

	/*public CashSal(int idCptPc) {
		super();
		this.idCptPc = idCptPc;
	}

	public CashSal() {
		super();
		// TODO Auto-generated constructor stub
	}
*/
	/*public CashSal(Long numCompte, String type, String libCompte, String ouvert, String lettrage) {
		super(numCompte, type, libCompte, ouvert, lettrage);
		// TODO Auto-generated constructor stub
	}*/
	

}
