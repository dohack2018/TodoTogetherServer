package de.todotogether.controller;

import de.todotogether.bean.User;
import de.todotogether.bean.Todo;
import de.todotogether.bean.Group;

import java.util.List;

import de.todotogether.service.ITodoService;
import de.todotogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    Todo todo = new Todo();
    User user = new User();

    @Autowired
    private IUserService userservice;
    @Autowired
    private ITodoService todoservice;

    @GetMapping("/getUser")
    public Group getGroup(@RequestParam("groupname") String groupname) {
        return Group;
    }

    @PostMapping(path = "/setUser", consumes = "application/json", produces = "application/json")
    public void setUserStatus(User user) {

    }

    @GetMapping("/getTodo")
    public Todo getTodo(@RequestParam("groupname") String groupname) {
        return Group;
    }

    @PostMapping(path = "/setTodo", consumes = "application/json", produces = "application/json")
    public void setTodo() {
        Throw ioexcep = Throw IOException
        setTodo();
    }

    @GetMapping("/getGroup")
    public Group getGroup(@RequestParam("groupname") String groupname) {
        return Group;
    }

    @PostMapping(path = "/setGroup", consumes = "application/json", produces = "application/json")
    public void setGroup(@RequestParam("groupname") String groupname) {

    }
}