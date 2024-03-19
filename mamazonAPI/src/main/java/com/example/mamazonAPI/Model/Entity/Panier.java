package com.example.mamazonAPI.Model.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)

    private Long id;
    private List<Item> items;

    @ManyToMany(mappedBy = "paniers")
    private Set<Item> listItems = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Set<Item> getListItems() {
        return listItems;
    }

    public void setListItems(Set<Item> listItems) {
        this.listItems = listItems;
    }

}
