package com.immobilisation.repository;

import com.immobilisation.model.Fournisseur;
import com.immobilisation.model.Immobilisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
    
}
