package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao {

    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(1,"Tom"));
        users.add(new User(2,"Bob"));
        users.add(new User(3,"Mike"));
        users.add(new User(4,"Katy"));
    }

    public List<User> index() {
        return users;
    }
    public User show(int id) {
        return users.stream().filter(users -> users.getId() == id).findAny().orElse(null);
    }
}
