package com.immobilisation.repository;

import com.immobilisation.model.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, String> {
}
