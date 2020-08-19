package ua.com.springDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.springDI.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void printUser() {
        System.out.println(userRepository.userDb.values());
    }
}
