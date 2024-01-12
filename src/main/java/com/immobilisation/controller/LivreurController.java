package com.immobilisation.controller;

import com.immobilisation.model.Livreur;
import com.immobilisation.repository.LivreurRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livreurs")
@CrossOrigin(origins = "*")
public class LivreurController {
    private final LivreurRepository livreurRepository;

    public LivreurController(LivreurRepository livreurRepository) {
        this.livreurRepository = livreurRepository;
    }

    @GetMapping
    public List<Livreur> findAll(){
        return livreurRepository.findAll();
    }
}
