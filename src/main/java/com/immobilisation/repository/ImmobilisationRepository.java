package com.immobilisation.repository;

import com.immobilisation.model.Immobilisation;
import org.springframework.data.jpa.repository.JpaRepository;

// 
public interface ImmobilisationRepository extends JpaRepository<Immobilisation,String> {
    
}
