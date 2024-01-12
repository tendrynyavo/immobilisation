package com.immobilisation.controller;

import com.immobilisation.model.ProcesVerbal;
import com.immobilisation.repository.PvRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pv")
@CrossOrigin(origins = "*")
public class PvController {
    private final PvRepository pvRepository;

    public PvController(PvRepository pvRepository) {
        this.pvRepository = pvRepository;
    }


    @PostMapping
    public ProcesVerbal save(@RequestBody ProcesVerbal pv){
        return pvRepository.save(pv);
    }
}
