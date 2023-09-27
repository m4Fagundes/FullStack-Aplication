package com.crudTeste.fullstackbackend.controller;

import java.util.List;
import com.crudTeste.fullstackbackend.model.Mundo;
import com.crudTeste.fullstackbackend.repository.MundoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000/")
public class MundoControler {

    @Autowired
    private MundoRepository mundoRepository;

    @GetMapping("/mundos")
    List<Mundo>getAllMaps(){
        return mundoRepository.findAll();
    }
    @PostMapping("/mundo")
    Mundo newMundo(@RequestBody Mundo newMundo) {
        return mundoRepository.save(newMundo);
    }

}
