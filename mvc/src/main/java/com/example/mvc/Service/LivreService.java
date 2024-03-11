package com.example.mvc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.Model.Entity.Livre;
import com.example.mvc.Model.Repository.LivreRepository;

@Service
public class LivreService {
	private LivreRepository livreRepository;
	
	@Autowired
	public LivreService(LivreRepository livreRepository) {
		this.livreRepository = livreRepository;
	}
	
	Livre saveLivre(Livre livre) {
		return livreRepository.save(livre);
	}

	Iterable<Livre> getAllLivres(){
		return livreRepository.findAll();
	}
	
	void deleteById(Livre id) {}
	
	Optional<Livre> findById(Long id) {
		return livreRepository.findById(id);
	}
}
