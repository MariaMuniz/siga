package com.app.sigatruck.resource;

import com.app.sigatruck.Services.ServiceMotorista;
import com.app.sigatruck.model.Motorista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/motorista")
@CrossOrigin(origins="*")

public class MotoristaResource {

    @Autowired
    ServiceMotorista service;


    @GetMapping("/{id}")
    public ResponseEntity<Motorista> findById(@PathVariable("id") Long id) {
        Optional<Motorista> motorista = service.findById(id);
        if (motorista.isPresent()) {
            return ResponseEntity.ok().body(motorista.get());
        } else {
            return ResponseEntity.notFound().build();
        }


    }
}

