package com.example.tp2APIpart2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tp2APIpart2.Model.Task;

@Service
public class TaskService {
	// Initialisation d'une liste de tâches vide
	private List<Task> tasks = new ArrayList<>();

	
	// Afficher toutes les tâches
	public List<Task> getTasks() {
		return this.tasks;
	}
	
	// Afficher une tâche par son id
	
	
	// Création d'une nouvelle tâche
	public List<Task> addTask(Long newId, String newContent) {
		Task newTask = new Task(newId, newContent);
		
	    this.tasks.add(newTask);
	    return this.tasks;
	}
 
	
	// Modification d'une tâche par son id
	
	
	// Suppression d'une tâche par son id
	
	
	
}
