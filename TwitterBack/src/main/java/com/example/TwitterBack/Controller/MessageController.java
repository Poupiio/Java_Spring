package com.example.TwitterBack.Controller;

import com.example.TwitterBack.Model.Entity.Message;
import com.example.TwitterBack.Model.Entity.User;
import com.example.TwitterBack.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService service;

    @GetMapping
    public List<Message> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getById(@PathVariable Long id) {
        return this.service.getById(id);
    }

    @PostMapping
    public Message addMessage(@RequestBody Message data) {
        return this.service.addMessage(data);
    }

    @PutMapping("/{id}")
    public Message updateMessage(@RequestBody Message body, @PathVariable Long id) {
        return this.service.updateMessage(id, body);
    }

    @DeleteMapping("/{id}")
    public String removeMessage(@PathVariable Long id) {
        return this.service.removeMessage(id);
    }
}
