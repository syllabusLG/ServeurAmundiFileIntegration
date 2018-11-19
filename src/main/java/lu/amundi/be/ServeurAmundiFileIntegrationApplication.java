package lu.amundi.be;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lu.amundi.be.dao.RoleRepository;
import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.Individu;
import lu.amundi.be.entities.Role;
import lu.amundi.be.entities.Salarie;
import lu.amundi.be.entities.User;
import lu.amundi.be.service.ICrudService;
import lu.amundi.be.utils.EncodePassword;
import lu.amundi.be.utils.RoleEnum;

/**
 * The project entry point
 * this class scan all classes and triggers auto configuration
 * 
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@SpringBootApplication
public class ServeurAmundiFileIntegrationApplication implements CommandLineRunner{

	@Autowired
	private ICrudService<Individu, String> service1;
	@Autowired
	private ICrudService<Salarie, String> service2;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServeurAmundiFileIntegrationApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Individu individu = new Individu();
		Individu individu2 = new Individu();
		individu.setNui("123DF456");
		individu.setFirstName("Abou");
		individu.setLastName("Ndiaye");
		individu2.setNui("12323456");
		individu2.setFirstName("Aida");
		individu2.setLastName("Ndiaye");
		service1.add(individu);
		service1.add(individu2);
		Salarie salarie = new Salarie();
		salarie.setIndividu(individu);
		salarie.setCompany_CD("FD");
		salarie.setEmployeeId("12");
		service2.add(salarie);
		service1.getAll().forEach(i -> {
			System.out.println(i.getFirstName());
		});
		service2.getAll().forEach(s -> {
			System.out.println("le salarié: "+ s.getEmployeeId()+" de nom "+s.getIndividu().getFirstName());
		});
		

		
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		Role roleIndividu = new Role(RoleEnum.ROLE_INDIVIDUS);
		Role roleSalarie = new Role(RoleEnum.ROLE_SALARIE);
		Role roleAdresse = new Role(RoleEnum.ROLE_ADRESSE);
		Role rolePayment = new Role(RoleEnum.ROLE_PAYMENT);
		Role roleDashboard = new Role(RoleEnum.ROLE_DASHBOARD);
		Role roleCompte = new Role(RoleEnum.ROLE_COMPTE);
		Role roleContact = new Role(RoleEnum.ROLE_CONTACT);
		Role roleAudit = new Role(RoleEnum.ROLE_AUDIT);
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		roleRepository.save(roleIndividu);
		roleRepository.save(roleSalarie);
		roleRepository.save(roleAdresse);
		roleRepository.save(rolePayment);
		roleRepository.save(roleDashboard);
		roleRepository.save(roleCompte);
		roleRepository.save(roleContact);
		roleRepository.save(roleAudit);
		
		
		
		User user = new User("user", EncodePassword.getPassword("amundi2018"), "", "Lionel", "Messi", true, "FALSE");
		user.setRoles(Arrays.asList(roleUser));
		userRepository.save(user);
		
		User admin = new User("admin", EncodePassword.getPassword("amundiAdmin2018"), "", "Cristiano", "Ronaldo", true, "FALSE");
		admin.setRoles(Arrays.asList(roleUser, roleAdmin, roleIndividu, roleSalarie, 
				roleAdresse, rolePayment, roleDashboard, roleCompte, roleContact, roleAudit));
		userRepository.save(admin);
		
	}
	   
}
