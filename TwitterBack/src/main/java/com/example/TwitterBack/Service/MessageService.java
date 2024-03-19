package com.example.TwitterBack.Service;

import com.example.TwitterBack.Model.Entity.Message;
import com.example.TwitterBack.Model.Entity.User;
import com.example.TwitterBack.Model.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    public MessageRepository repo;

    @Autowired
    public MessageService(MessageRepository repo) {
        this.repo = repo;
    }

    public List<Message> getAll() {
        return this.repo.findAll();
    }

    public Optional<Message> getById(Long id) {
        return this.repo.findById(id);
    }

    public Message addMessage(Message data) {
        return this.repo.save(data);
    }

    public Message updateMessage(Long id, Message data) {
        // Je récupère l'id de l'utilisateur
        Message msg = this.repo.findById(id).get();
        msg.setMessage(data.getMessage());
        msg.setReceiver(data.getReceiver());
        msg.setSender(data.getSender());

        return this.addMessage(msg);
    }

    public String removeMessage(Long id) {
        this.repo.deleteById(id);
        return "L'utilisateur avec l'id " + id + " a bien été supprimé";
    }

}
