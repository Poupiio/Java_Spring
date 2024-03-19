package com.example.mamazonAPI.Service;

import com.example.mamazonAPI.Model.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository repo;


}
