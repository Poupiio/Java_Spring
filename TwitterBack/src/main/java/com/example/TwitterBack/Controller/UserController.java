package com.example.TwitterBack.Controller;

import com.example.TwitterBack.Model.Entity.User;
import com.example.TwitterBack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost/3050")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/name/{username}")
    public User getByName(@PathVariable String username) {
        return service.findByName(username);
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return this.service.getById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User data) {
        return this.service.addUser(data);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User body, @PathVariable Long id) {
        return this.service.updateUser(id, body);
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable Long id) {
        return this.service.removeUser(id);
    }

    @PostMapping("/login")
    public User connection(@RequestBody User data) throws Exception {
        try {
            return this.service.findUser(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
