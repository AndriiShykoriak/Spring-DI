package ua.com.springDI.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.springDI.service.CarService;
import ua.com.springDI.service.UserService;

@Component
public class DI {
    @Autowired
    CarService carService;
    @Autowired
    UserService userService;

    public void printCarWithUser() {
        userService.printUser();
        carService.printCar();
    }
}
