package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author AbousyllabaNdiaye
 *
 */
@Entity
public class Audit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private LocalDateTime loginDate;
	private String uploadFileName;
	private String errorFileName;
	private String reportFileName;
	private String individuReportCSV;
	private String salarieReportCSV;
	private String contactReportCSV;
	private String paymentReportCSV;
	private String adresseReportCSV;
	private String compteReportCSV;
	private String updateIndividu;
	private String updateSalarie;
	private String updateContact;
	private String updatePayment;
	private String updateAdresse;
	private String updateCompte;
	private String deleteIndividu;
	private String deleteSalarie;
	private String deleteContact;
	private String deletePayment;
	private String deleteAdresse;
	private String deleteCompte;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public LocalDateTime getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(LocalDateTime loginDate) {
		this.loginDate = loginDate;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getErrorFileName() {
		return errorFileName;
	}
	public void setErrorFileName(String errorFileName) {
		this.errorFileName = errorFileName;
	}
	public String getReportFileName() {
		return reportFileName;
	}
	public void setReportFileName(String reportFileName) {
		this.reportFileName = reportFileName;
	}
	public String getIndividuReportCSV() {
		return individuReportCSV;
	}
	public void setIndividuReportCSV(String individuReportCSV) {
		this.individuReportCSV = individuReportCSV;
	}
	public String getSalarieReportCSV() {
		return salarieReportCSV;
	}
	public void setSalarieReportCSV(String salarieReportCSV) {
		this.salarieReportCSV = salarieReportCSV;
	}
	public String getContactReportCSV() {
		return contactReportCSV;
	}
	public void setContactReportCSV(String contactReportCSV) {
		this.contactReportCSV = contactReportCSV;
	}
	public String getPaymentReportCSV() {
		return paymentReportCSV;
	}
	public void setPaymentReportCSV(String paymentReportCSV) {
		this.paymentReportCSV = paymentReportCSV;
	}
	public String getAdresseReportCSV() {
		return adresseReportCSV;
	}
	public void setAdresseReportCSV(String adresseReportCSV) {
		this.adresseReportCSV = adresseReportCSV;
	}
	public String getCompteReportCSV() {
		return compteReportCSV;
	}
	public void setCompteReportCSV(String compteReportCSV) {
		this.compteReportCSV = compteReportCSV;
	}
	public String getUpdateIndividu() {
		return updateIndividu;
	}
	public void setUpdateIndividu(String updateIndividu) {
		this.updateIndividu = updateIndividu;
	}
	public String getUpdateSalarie() {
		return updateSalarie;
	}
	public void setUpdateSalarie(String updateSalarie) {
		this.updateSalarie = updateSalarie;
	}
	public String getUpdateContact() {
		return updateContact;
	}
	public void setUpdateContact(String updateContact) {
		this.updateContact = updateContact;
	}
	public String getUpdatePayment() {
		return updatePayment;
	}
	public void setUpdatePayment(String updatePayment) {
		this.updatePayment = updatePayment;
	}
	public String getUpdateAdresse() {
		return updateAdresse;
	}
	public void setUpdateAdresse(String updateAdresse) {
		this.updateAdresse = updateAdresse;
	}
	public String getUpdateCompte() {
		return updateCompte;
	}
	public void setUpdateCompte(String updateCompte) {
		this.updateCompte = updateCompte;
	}
	public String getDeleteIndividu() {
		return deleteIndividu;
	}
	public void setDeleteIndividu(String deleteIndividu) {
		this.deleteIndividu = deleteIndividu;
	}
	public String getDeleteSalarie() {
		return deleteSalarie;
	}
	public void setDeleteSalarie(String deleteSalarie) {
		this.deleteSalarie = deleteSalarie;
	}
	public String getDeleteContact() {
		return deleteContact;
	}
	public void setDeleteContact(String deleteContact) {
		this.deleteContact = deleteContact;
	}
	public String getDeletePayment() {
		return deletePayment;
	}
	public void setDeletePayment(String deletePayment) {
		this.deletePayment = deletePayment;
	}
	public String getDeleteAdresse() {
		return deleteAdresse;
	}
	public void setDeleteAdresse(String deleteAdresse) {
		this.deleteAdresse = deleteAdresse;
	}
	public String getDeleteCompte() {
		return deleteCompte;
	}
	public void setDeleteCompte(String deleteCompte) {
		this.deleteCompte = deleteCompte;
	}
	public Audit(String username, LocalDateTime loginDate, String uploadFileName, String errorFileName, String reportFileName,
			String individuReportCSV, String salarieReportCSV, String contactReportCSV, String paymentReportCSV,
			String adresseReportCSV, String compteReportCSV, String updateIndividu, String updateSalarie,
			String updateContact, String updatePayment, String updateAdresse, String updateCompte,
			String deleteIndividu, String deleteSalarie, String deleteContact, String deletePayment,
			String deleteAdresse, String deleteCompte) {
		super();
		this.username = username;
		this.loginDate = loginDate;
		this.uploadFileName = uploadFileName;
		this.errorFileName = errorFileName;
		this.reportFileName = reportFileName;
		this.individuReportCSV = individuReportCSV;
		this.salarieReportCSV = salarieReportCSV;
		this.contactReportCSV = contactReportCSV;
		this.paymentReportCSV = paymentReportCSV;
		this.adresseReportCSV = adresseReportCSV;
		this.compteReportCSV = compteReportCSV;
		this.updateIndividu = updateIndividu;
		this.updateSalarie = updateSalarie;
		this.updateContact = updateContact;
		this.updatePayment = updatePayment;
		this.updateAdresse = updateAdresse;
		this.updateCompte = updateCompte;
		this.deleteIndividu = deleteIndividu;
		this.deleteSalarie = deleteSalarie;
		this.deleteContact = deleteContact;
		this.deletePayment = deletePayment;
		this.deleteAdresse = deleteAdresse;
		this.deleteCompte = deleteCompte;
	}
	public Audit() {
		super();
	}
	
	
	
	

}
