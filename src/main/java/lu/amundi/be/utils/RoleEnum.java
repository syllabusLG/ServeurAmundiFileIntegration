package lu.amundi.be.utils;
/**
 * This enum is used as an useful component to provide all types of user Role.
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
public enum RoleEnum {
	
	ROLE_USER("ROLE_USER"),
	ROLE_ADMIN("ROLE_ADMIN"),
	ROLE_INDIVIDUS("ROLE_INDIVIDUS"),
	ROLE_SALARIE("ROLE_SALARIE"),
	ROLE_ADRESSE("ROLE_ADRESSE"),
	ROLE_PAYMENT("ROLE_PAYMENT"),
	ROLE_COMPTE("ROLE_COMPTE"),
	ROLE_CONTACT("ROLE_CONTACT"),
	ROLE_DASHBOARD("ROLE_DASHBOARD"),
	ROLE_AUDIT("ROLE_AUDIT");
	
	private String name;
	
	RoleEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

