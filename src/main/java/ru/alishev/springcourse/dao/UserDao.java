package ru.alishev.springcourse.dao;

import ru.alishev.springcourse.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
}
