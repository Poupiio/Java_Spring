package com.example.mvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.Model.Entity.Livre;
import com.example.mvc.Model.Repository.UtilisateurRepository;

@Service
public class LivreService {
	private LivreService livreService;
	
	@Autowired
	public LivreService(LivreService livreService) {
		this.livreService = livreService;
	}
	
	Livre saveLivre(Livre livre) {
		return livreService.save(livre);
	}
}
