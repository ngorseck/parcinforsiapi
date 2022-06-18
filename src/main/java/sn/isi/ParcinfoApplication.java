package sn.isi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.isi.dao.IIngenieurdao;
import sn.isi.dao.IRolesdao;
import sn.isi.entities.Ingenieur;
import sn.isi.entities.Roles;
import sn.isi.service.IIngenieurService;
import sn.isi.service.IRolesService;

@SpringBootApplication
public class ParcinfoApplication implements CommandLineRunner {

	//DAO
	private IRolesdao rolesdao;
	private IIngenieurdao ingenieurdao;
	//Service
	private IIngenieurService ingenieurService;
	private IRolesService rolesService;

	public ParcinfoApplication(IRolesdao rolesdao, IIngenieurdao ingenieurdao, IIngenieurService ingenieurService, IRolesService rolesService) {
		this.rolesdao = rolesdao;
		this.ingenieurdao = ingenieurdao;
		this.ingenieurService = ingenieurService;
		this.rolesService = rolesService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ParcinfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Roles roles = new Roles();
		roles.setNom("SUPER_SUPER_ADMIN");

		//rolesdao.delete(rolesdao.findById(4));
		//roles = rolesdao.save(roles);
		//System.out.println(roles.getId());

		/*rolesdao.findAll().forEach(r -> {
			System.out.println(r.getId() + " " + r.getNom());
		});*/

		Ingenieur ingenieur = new Ingenieur();
		ingenieur.setPrenom("Matar");
		ingenieur.setNom("Samb");
		ingenieur.setEmail("msamb@isi.sn");
		ingenieur.setPassword("passer1234%$#@");

		//ingenieur = ingenieurdao.save(ingenieur);
		/*ingenieurdao.findAll().forEach(i -> {
			System.out.println(i.getId() + " " + i.getPrenom() + " " + i.getNom());
		});*/

		//ingenieur = ingenieurService.addRoleToIngenieur(1, 1);
		//ingenieur = ingenieurService.addRoleToIngenieur(1, 2);

	}
}
