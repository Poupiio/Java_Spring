package com.example.TwitterBack.Service;

import com.example.TwitterBack.Model.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repo;


}
