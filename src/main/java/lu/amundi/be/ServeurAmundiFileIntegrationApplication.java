package lu.amundi.be;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lu.amundi.be.dao.CompteRepository;
import lu.amundi.be.dao.RoleRepository;
import lu.amundi.be.dao.UserRepository;
import lu.amundi.be.entities.Compte;
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
public class ServeurAmundiFileIntegrationApplication{

	public static void main(String[] args) {
		SpringApplication.run(ServeurAmundiFileIntegrationApplication.class, args);
	}
}
