package com.example.hotel.Loja.de.roupa.resource;

import com.example.hotel.Loja.de.roupa.controller.RoupaController;
import com.example.hotel.Loja.de.roupa.dominio.Roupa;
import com.example.hotel.Loja.de.roupa.repository.RoupaRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api/roupa")
public class RoupaResource {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping(value = "/list")
    public List<Roupa> list() {
        return roupaRepository.findAll();
    }

    @GetMapping("/total")
    public long getTotal() {
        return roupaRepository.count();
    }

    @GetMapping("getById/{id}")
    public Optional<Roupa> getById(@PathVariable(value = "id") int id) {
        return roupaRepository.findById(id);
    }

    @DeleteMapping("/remove/{id}")
    public Roupa remove(@PathVariable(value = "id") int id) {
        Optional<Roupa> optionalAluno = roupaRepository.findById(id);
        roupaRepository.delete(optionalAluno.get());
        return optionalAluno.get();
    }


}


