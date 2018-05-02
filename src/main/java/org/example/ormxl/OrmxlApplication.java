package org.example.ormxl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmxlApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OrmxlApplication.class, args);
	}
	
	@Autowired
	private EntityManager manager;
	

	@Override
	public void run(String... args) throws Exception {
		manager.createNamedQuery("pricesDoubled");
		
	}
	
}
