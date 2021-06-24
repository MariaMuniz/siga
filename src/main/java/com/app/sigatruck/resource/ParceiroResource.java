package com.app.sigatruck.resource;

import com.app.sigatruck.model.Parceiro;
import com.app.sigatruck.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/parceiro")
public class ParceiroResource {

    @Autowired
    private ParceiroRepository pr;

    @GetMapping(produces = "application/json")

    public @ResponseBody

    Iterable<Parceiro> listaParceiros() {
        Iterable<Parceiro> listaParceiros = pr.findAll();
        return listaParceiros;
    }
    @PostMapping()
    public Parceiro CadastraParceiro(@RequestBody @Valid Parceiro parceiro) {
        return pr.save(parceiro);
    }

    @DeleteMapping()
    public Parceiro deletaParceiro(@RequestBody Parceiro parceiro){
        pr.delete(parceiro);
        return parceiro;
    }



}
