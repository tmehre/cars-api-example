package de.entwicklerkurs.springboot.cars.api.model;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarRepositioryTest {

	@Autowired
	private CarRepositiory carRepo;

	@Test
	public void findById() throws Exception {
		assertThat(carRepo.findById(1), is(notNullValue()));
	}
}
