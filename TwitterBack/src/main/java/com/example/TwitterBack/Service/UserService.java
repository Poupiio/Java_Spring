package com.example.TwitterBack.Service;

import com.example.TwitterBack.Model.Entity.User;
import com.example.TwitterBack.Model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class UserService {
    public UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // Tous les users
    public List<User> getAll() {
        return this.repo.findAll();
    }

    // User par id
    public Optional<User> getById(Long id) {
        return this.repo.findById(id);
    }

    // User par son nom
    public User findByName(String username) {
        return this.repo.findByUsername(username);
    }

    // Ajout d'un user
    public User addUser(User data) {
        return this.repo.save(data);
    }

    // Update d'un user par id
    public User updateUser(Long id, User data) {
        // Je récupère l'id de l'utilisateur
        User user = this.repo.findById(id).get();
        user.setUsername(data.getUsername());
        user.setPassword(data.getPassword());

        return this.repo.save(user);
    }

    // Supprimer un user
    public String removeUser(Long id) {
        this.repo.deleteById(id);
        return "L'utilisateur avec l'id " + id + " a bien été supprimé";
    }

    public User findUser(User data) throws Exception {
        return this.getAll()
            .stream()
            .filter(user -> user.getUsername().equals(data.getUsername()) && user.getPassword().equals(data.getPassword()))
            .findFirst()
            .orElseThrow(() -> new Exception("Mauvais utilisateur ou mauvais mot de passe"));
    }
}
