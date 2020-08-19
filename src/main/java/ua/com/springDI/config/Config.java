package ua.com.springDI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.springDI.model.Car;
import ua.com.springDI.model.User;

@Configuration
public class Config {
    @Bean
    public User user() {
        return new User("Andrii", 23);
    }

    @Bean
    public Car car() {
        return new Car();
    }
}
