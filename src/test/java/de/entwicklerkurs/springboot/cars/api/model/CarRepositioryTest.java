package de.entwicklerkurs.springboot.cars.api.model;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.entwicklerkurs.springboot.cars.api.repositiories.CarRepositiory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarRepositioryTest {

	@Autowired
	private CarRepositiory carRepo;


	@Before
	public void initTestCar() {
		Car testCar = new Car();
		testCar.setId(1);
		carRepo.save(testCar);
	}

	@Test
	public void findByIdNeverNull() throws Exception {
		assertThat(carRepo.findById(1), is(notNullValue()));
	}

	@Test
	public void saveCar() throws Exception {
		Optional<Car> persisted = carRepo.findById(1);
		Car car = persisted.get();
		assertThat(car.getId(), is(1));
	}
}
