package com.immobilisation.controller;

import com.immobilisation.model.Marque;
import com.immobilisation.repository.MarqueRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marques")
@CrossOrigin(origins = "*")
public class MarqueController {
    private final MarqueRepository marqueRepository;

    public MarqueController(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    @GetMapping
    public List<Marque> findAll(){
        return marqueRepository.findAll();
    }
}
