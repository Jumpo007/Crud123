package ru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.service.UserServiceImpl;


@Controller
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userDao;

    public UserController(UserServiceImpl userDao) {
        this.userDao = userDao;
    }


    @GetMapping()
    public String index(Model model) {
        model.addAttribute("user", userDao.index());
        return "user/index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userDao.show(id));
        return "user/show";
    }
}
