package com.immobilisation.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.immobilisation.model.Immobilisation;
import com.immobilisation.repository.ImmobilisationRepository;

@RestController
public class ImmobilisationController {
    
    public final ImmobilisationRepository immobilisationRepository;

    public ImmobilisationController(ImmobilisationRepository immobilisationRepository) {
        this.immobilisationRepository = immobilisationRepository;
    }

    @PostMapping("/immobilisations")
    public Immobilisation save(@RequestBody Immobilisation immobilisation) {
        immobilisationRepository.save(immobilisation);
        return immobilisation;
    }

    @GetMapping("/immobilisations")
    public List<Immobilisation> findAll() {
        return immobilisationRepository.findAll();
    }

}
