package com.immobilisation.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.immobilisation.model.Immobilisation;
import com.immobilisation.repository.ImmobilisationRepository;

@RestController
@RequestMapping("/immobilisations")
@CrossOrigin(origins = "*")
public class ImmobilisationController {
    
    public final ImmobilisationRepository immobilisationRepository;

    public ImmobilisationController(ImmobilisationRepository immobilisationRepository) {
        this.immobilisationRepository = immobilisationRepository;
    }

    @PostMapping
    public Immobilisation save(@RequestBody Immobilisation immobilisation) {
        immobilisationRepository.save(immobilisation);
        return immobilisation;
    }

    @GetMapping
    public List<Immobilisation> findAll() {
        return immobilisationRepository.findAll();
    }

}
