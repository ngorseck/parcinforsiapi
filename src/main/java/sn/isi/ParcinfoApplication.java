package sn.isi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.isi.dao.IRoles;
import sn.isi.entities.Roles;

@SpringBootApplication
public class ParcinfoApplication implements CommandLineRunner {

	private IRoles rolesdao;

	public ParcinfoApplication(IRoles rolesdao) {
		this.rolesdao = rolesdao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ParcinfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Roles roles = new Roles();
		roles.setNom("ADMIN");

		roles = rolesdao.save(roles);
		System.out.println(roles.getId());

	}
}