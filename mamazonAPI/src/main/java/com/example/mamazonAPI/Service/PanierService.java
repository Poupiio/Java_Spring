package com.example.mamazonAPI.Service;

import com.example.mamazonAPI.Model.Repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierService {
    @Autowired
    private PanierRepository repo;
}
