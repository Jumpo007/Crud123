package ru.dao;

import org.springframework.stereotype.Component;
import ru.models.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
    private static int USER_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_COUNT,"Tom"));
        users.add(new User(++USER_COUNT,"Bob"));
        users.add(new User(++USER_COUNT,"Mike"));
        users.add(new User(++USER_COUNT,"Katy"));
    }

    public List<User> index() {
        return users;
    }
    public User showUser(int id) {
        return users.stream().filter(users -> users.getId() == id).findAny().orElse(null);
    }

    @Override
    public void saveUser(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }

    @Override
    public void updateUser(int id, User user) {
        User userToBeUpdated = showUser(id);
        userToBeUpdated.setName(user.getName());
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(p -> p.getId() == id);
    }
}
