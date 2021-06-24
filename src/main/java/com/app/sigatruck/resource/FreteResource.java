package com.app.sigatruck.resource;

import com.app.sigatruck.model.Frete;
import com.app.sigatruck.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/frete")
public class FreteResource {

    @Autowired
    private FreteRepository fr;

    @GetMapping(produces = "application/json")

    public @ResponseBody
    Iterable<Frete> listaFrete() {
        Iterable<Frete> listaFretes = fr.findAll();
        return listaFretes;
    }


    @PostMapping()
    public Frete CadastraFrete(@RequestBody @Valid Frete frete) {

        return fr.save(frete);
    }

    @DeleteMapping()
    public Frete deletaFrete (@RequestBody Frete frete  ){
        fr.delete(frete);
        return frete ;
    }
}
