package com.immobilisation.controller;

import com.immobilisation.model.Fournisseur;
import com.immobilisation.repository.FournisseurRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fournisseurs")
@CrossOrigin(origins = "*")
public class FournisseurController {

    private final FournisseurRepository fournisseurRepository;

    public FournisseurController(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    @GetMapping
    public List<Fournisseur> findAll(){
        return fournisseurRepository.findAll();
    }
}
