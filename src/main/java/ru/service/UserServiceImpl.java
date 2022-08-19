package ru.service;

import org.springframework.stereotype.Component;
import ru.dao.UserDao;
import ru.models.User;

import java.util.List;
@Component
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }
}