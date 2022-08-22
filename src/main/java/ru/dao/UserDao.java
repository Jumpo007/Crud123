package ru.dao;

import ru.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User showUser(int id);
    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
