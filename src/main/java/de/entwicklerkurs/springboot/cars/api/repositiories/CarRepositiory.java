package de.entwicklerkurs.springboot.cars.api.repositiories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import de.entwicklerkurs.springboot.cars.api.model.Car;

@Component
public interface CarRepositiory extends CrudRepository<Car, Integer> {

}
