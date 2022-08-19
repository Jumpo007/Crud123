package ru.alishev.springcourse.service;

import ru.alishev.springcourse.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);

}
