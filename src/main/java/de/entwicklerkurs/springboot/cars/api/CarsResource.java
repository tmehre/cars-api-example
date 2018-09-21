package de.entwicklerkurs.springboot.cars.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/v1/cars")
public class CarsResource {

	@RequestMapping(path="/list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<CarResponse> listCars() {
		List<CarResponse> cars = new ArrayList<CarResponse>();
		CarResponse car = new CarResponse();
		car.setName("Audi RS6");
		cars.add(car);
		return cars;
	}
}
