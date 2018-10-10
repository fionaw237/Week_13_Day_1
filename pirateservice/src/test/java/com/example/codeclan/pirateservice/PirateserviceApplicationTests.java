package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	PirateRepository pirateRepository;

	@Test
	public void createInstance() {
		Pirate pirate = new Pirate("Jack", "Sparrow", 45);
		pirateRepository.save(pirate);
	}

}
