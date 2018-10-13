package de.entwicklerkurs.springboot.cars.api.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepositiory extends CrudRepository<Car, Integer> {

}
