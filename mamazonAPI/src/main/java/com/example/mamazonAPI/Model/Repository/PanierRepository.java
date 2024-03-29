package com.example.mamazonAPI.Model.Repository;

import com.example.mamazonAPI.Model.Entity.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepository extends JpaRepository<Panier, Long> {}
