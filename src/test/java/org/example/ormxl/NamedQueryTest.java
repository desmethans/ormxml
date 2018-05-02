package org.example.ormxl;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class NamedQueryTest {
	@Autowired
	EntityManager manager;
	@Test
	public void namedQuery( ) {
		manager.createNamedQuery("pricesDoubled");
	}
}
