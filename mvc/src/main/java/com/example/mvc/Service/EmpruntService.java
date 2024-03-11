package com.example.mvc.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.Model.Entity.Emprunt;
import com.example.mvc.Model.Entity.Livre;
import com.example.mvc.Model.Repository.EmpruntRepository;

@Service
public class EmpruntService {
	private EmpruntRepository empruntRepo;
	
	@Autowired
	public EmpruntService(EmpruntRepository empruntRepo) {
		this.empruntRepo = empruntRepo;
	}
	
	Emprunt saveEmprunt(Emprunt emprunt) {
		return empruntRepo.save(emprunt);
	}
	
	Iterable<Emprunt> getAllEmprunts(){
		return empruntRepo.findAll();
	}
	
	void deleteById(Emprunt id) {}
	
	Optional<Emprunt> findById(Long id) {
		return empruntRepo.findById(id);
	}
}
