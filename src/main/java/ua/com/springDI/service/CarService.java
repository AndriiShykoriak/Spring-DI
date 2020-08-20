package ua.com.springDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.springDI.repository.CarRepository;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public void printCar() {
        System.out.print(carRepository.carDb.values() + "   inject user to car");
    }
}
