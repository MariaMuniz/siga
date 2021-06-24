package com.app.sigatruck.resource;

import com.app.sigatruck.model.Emplemento;
import com.app.sigatruck.repository.EmplementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/emplemento")
public class EmplementoResource {
    @Autowired
    private EmplementoRepository emr;

    @GetMapping(produces = "application/json")

    public @ResponseBody
    Iterable<Emplemento> listaEmplementos() {
        Iterable<Emplemento> listaEmplementos = emr.findAll();
        return listaEmplementos;
    }

    @PostMapping()
    public Emplemento CadastraEmplemento(@RequestBody Emplemento emplemento) {

        return emr.save(emplemento);
    }


    @DeleteMapping()
    public Emplemento deletaEmplemento(@RequestBody Emplemento emplemento ){
        emr.delete(emplemento);
        return emplemento;
    }


}


