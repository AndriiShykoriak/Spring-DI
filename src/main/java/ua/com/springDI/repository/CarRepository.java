package ua.com.springDI.repository;

import org.springframework.stereotype.Repository;
import ua.com.springDI.model.Car;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CarRepository {
    public Map<Integer, Car> carDb = new HashMap<>();
    final Car car;

    public CarRepository(Car car) {
        this.car = car;
        carDb.put(1, car);
    }
}
