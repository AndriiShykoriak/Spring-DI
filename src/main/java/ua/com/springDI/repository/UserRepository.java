package ua.com.springDI.repository;

import org.springframework.stereotype.Repository;
import ua.com.springDI.model.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    public Map<Integer, User> userDb = new HashMap<>();

    final User user;

    public UserRepository(User user) {
        userDb.put(1, user);
        this.user = user;
    }
}
