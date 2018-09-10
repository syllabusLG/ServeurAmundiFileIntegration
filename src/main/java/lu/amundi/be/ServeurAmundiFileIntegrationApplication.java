package lu.amundi.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lu.amundi.be.entities.Individu;
import lu.amundi.be.entities.Salarie;
import lu.amundi.be.service.ICrudService;

@SpringBootApplication
public class ServeurAmundiFileIntegrationApplication implements CommandLineRunner{

	@Autowired
	private ICrudService<Individu, String> service1;
	@Autowired
	private ICrudService<Salarie, String> service2;
	
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
		
	}
}
