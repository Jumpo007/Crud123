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
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id,user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
