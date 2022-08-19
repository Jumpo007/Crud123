package ru.service;

import ru.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);

}
