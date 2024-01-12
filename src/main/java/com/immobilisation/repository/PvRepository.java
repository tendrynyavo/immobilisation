package com.immobilisation.repository;

import com.immobilisation.model.ProcesVerbal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PvRepository extends JpaRepository<ProcesVerbal,String> {
}
