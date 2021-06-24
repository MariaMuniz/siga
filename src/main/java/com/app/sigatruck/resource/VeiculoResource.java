package com.app.sigatruck.resource;


import com.app.sigatruck.Services.ServiceMotorista;
import com.app.sigatruck.Services.ServiceVeiculo;
import com.app.sigatruck.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veiculo")
public class VeiculoResource {

    @Autowired
    ServiceVeiculo serviceVeiculo;

    @Autowired
    ServiceMotorista serviceMotorista;


    @RequestMapping(
            params = "motorista_id",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> findByMotorista ( @RequestParam Long motorista_Id) {
        return ResponseEntity.ok().body(serviceMotorista.findByMotorista_Id(motorista_Id));
    }


    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable("id") Long id) {
        Optional<Veiculo> veiculo= serviceVeiculo.findById(id);
        if (veiculo.isPresent()) {
            return ResponseEntity.ok().body(veiculo.get());
        } else {
            return ResponseEntity.notFound().build();
        }


    }



}
