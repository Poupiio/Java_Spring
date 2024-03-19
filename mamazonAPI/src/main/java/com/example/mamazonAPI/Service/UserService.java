package com.example.mamazonAPI.Service;

import com.example.mamazonAPI.Model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repo;
    @Autowired
    private UserService serviceUser;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }


}
