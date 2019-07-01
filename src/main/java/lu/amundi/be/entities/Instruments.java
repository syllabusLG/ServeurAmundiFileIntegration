package lu.amundi.be.entities;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 */
@Entity
public class Instruments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String code;
	private String nom;
	private String codeSocieteGestion;
	private String statut;
	private String nature;
	private String classification;
	private String codeEmploiRevenu;
	private String periodicite;
	private int precisionPart;
	private int precisionVL;
	private int precisionPlusValue;
	@JsonFormat(pattern="HH:mm")
	private LocalTime cutOffStp;
	private String idDevise;
	private int niveauRisque;
	private int horizonPlacement;
	@JsonFormat(pattern="HH:mm")
	private LocalTime cutOff;
	@JsonFormat(pattern="HH:mm")
	private LocalTime cutOffFax;
	private String codeFundLife;
	private String idPlateforme;
	private String idSocieteGestion;
	private String idDepositaire;
	private String idAgentTransfert;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodeSocieteGestion() {
		return codeSocieteGestion;
	}
	public void setCodeSocieteGestion(String codeSocieteGestion) {
		this.codeSocieteGestion = codeSocieteGestion;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getCodeEmploiRevenu() {
		return codeEmploiRevenu;
	}
	public void setCodeEmploiRevenu(String codeEmploiRevenu) {
		this.codeEmploiRevenu = codeEmploiRevenu;
	}
	public String getPeriodicite() {
		return periodicite;
	}
	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
	public int getPrecisionPart() {
		return precisionPart;
	}
	public void setPrecisionPart(int precisionPart) {
		this.precisionPart = precisionPart;
	}
	public int getPrecisionVL() {
		return precisionVL;
	}
	public void setPrecisionVL(int precisionVL) {
		this.precisionVL = precisionVL;
	}
	public int getPrecisionPlusValue() {
		return precisionPlusValue;
	}
	public void setPrecisionPlusValue(int precisionPlusValue) {
		this.precisionPlusValue = precisionPlusValue;
	}
	public LocalTime getCutOffStp() {
		return cutOffStp;
	}
	public void setCutOffStp(LocalTime cutOffStp) {
		this.cutOffStp = cutOffStp;
	}
	public String getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(String idDevise) {
		this.idDevise = idDevise;
	}
	public int getNiveauRisque() {
		return niveauRisque;
	}
	public void setNiveauRisque(int niveauRisque) {
		this.niveauRisque = niveauRisque;
	}
	public int getHorizonPlacement() {
		return horizonPlacement;
	}
	public void setHorizonPlacement(int horizonPlacement) {
		this.horizonPlacement = horizonPlacement;
	}
	public LocalTime getCutOff() {
		return cutOff;
	}
	public void setCutOff(LocalTime cutOff) {
		this.cutOff = cutOff;
	}
	public LocalTime getCutOffFax() {
		return cutOffFax;
	}
	public void setCutOffFax(LocalTime cutOffFax) {
		this.cutOffFax = cutOffFax;
	}
	public String getCodeFundLife() {
		return codeFundLife;
	}
	public void setCodeFundLife(String codeFundLife) {
		this.codeFundLife = codeFundLife;
	}
	public String getIdPlateforme() {
		return idPlateforme;
	}
	public void setIdPlateforme(String idPlateforme) {
		this.idPlateforme = idPlateforme;
	}
	public String getIdSocieteGestion() {
		return idSocieteGestion;
	}
	public void setIdSocieteGestion(String idSocieteGestion) {
		this.idSocieteGestion = idSocieteGestion;
	}
	public String getIdDepositaire() {
		return idDepositaire;
	}
	public void setIdDepositaire(String idDepositaire) {
		this.idDepositaire = idDepositaire;
	}
	public String getIdAgentTransfert() {
		return idAgentTransfert;
	}
	public void setIdAgentTransfert(String idAgentTransfert) {
		this.idAgentTransfert = idAgentTransfert;
	}
	
	public Instruments() {
		super();
	}
	public Instruments(String code, String nom, String codeSocieteGestion, String statut, String nature,
			String classification, String codeEmploiRevenu, String periodicite, int precisionPart, int precisionVL,
			int precisionPlusValue, LocalTime cutOffStp, String idDevise, int niveauRisque, int horizonPlacement,
			LocalTime cutOff, LocalTime cutOffFax, String codeFundLife, String idPlateforme, String idSocieteGestion,
			String idDepositaire, String idAgentTransfert) {
		super();
		this.code = code;
		this.nom = nom;
		this.codeSocieteGestion = codeSocieteGestion;
		this.statut = statut;
		this.nature = nature;
		this.classification = classification;
		this.codeEmploiRevenu = codeEmploiRevenu;
		this.periodicite = periodicite;
		this.precisionPart = precisionPart;
		this.precisionVL = precisionVL;
		this.precisionPlusValue = precisionPlusValue;
		this.cutOffStp = cutOffStp;
		this.idDevise = idDevise;
		this.niveauRisque = niveauRisque;
		this.horizonPlacement = horizonPlacement;
		this.cutOff = cutOff;
		this.cutOffFax = cutOffFax;
		this.codeFundLife = codeFundLife;
		this.idPlateforme = idPlateforme;
		this.idSocieteGestion = idSocieteGestion;
		this.idDepositaire = idDepositaire;
		this.idAgentTransfert = idAgentTransfert;
	}
	
	
}
