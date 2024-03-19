package com.example.mamazonAPI.Controller;

import com.example.mamazonAPI.Model.DTO.UserDTO;
import com.example.mamazonAPI.Model.Entity.User;
import com.example.mamazonAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return this.service.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id) {
        return this.service.getUserById(id);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO body) {
        return this.service.createUser(body);
    }

    @PutMapping
    public UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO body) {
        return this.service.updateUser(id, body);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable Long id) {
        this.service.deleteUser(id);
    }

}
