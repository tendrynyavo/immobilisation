package com.immobilisation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.immobilisation.model.Immobilisation;
import com.immobilisation.repository.ImmobilisationRepository;

@RestController
public class ImmibolisationController {
    
    public final ImmobilisationRepository immobilisationRepository;

    public ImmibolisationController(ImmobilisationRepository immobilisationRepository) {
        this.immobilisationRepository = immobilisationRepository;
    }

    @PostMapping("/immobilisations")
    public Immobilisation save(@RequestBody Immobilisation immobilisation) {
        immobilisationRepository.save(immobilisation);
        return immobilisation;
    }

}
