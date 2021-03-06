package lu.amundi.be.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
/**
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long id;
	@Column(unique=true)
	private String username;
	private String password;
	private String oldPassword;
	private String firstName;
	private String lastName;
	private boolean enable;
	@Size(min=0, max=5)
	private String changePassword;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="USERS_ROLES",
	joinColumns= {@JoinColumn(name= "USER_ID")},
	inverseJoinColumns= {@JoinColumn(name="ROLE_ID")})
	private Collection<Role> roles;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
	public String getChangePassword() {
		return changePassword;
	}
	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(String username, String password, String oldPassword, String firstName, String lastName, boolean enable, 
			String changePassword) {
		super();
		this.username = username;
		this.password = password;
		this.oldPassword = oldPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enable = enable;
		this.changePassword = changePassword;
	}
	public User(String username, String password, String oldPassword, String firstName, String lastName, boolean enable,
			String changePassword, Collection<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.oldPassword = oldPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enable = enable;
		this.changePassword = changePassword;
		this.roles = roles;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
