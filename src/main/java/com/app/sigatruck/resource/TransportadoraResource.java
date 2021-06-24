package com.app.sigatruck.resource;


import com.app.sigatruck.model.Transportadora;
import com.app.sigatruck.repository.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/transportadora")
public class TransportadoraResource {

    @Autowired
    private TransportadoraRepository tr;

    @GetMapping(produces = "application/json")

    public @ResponseBody
    Iterable<Transportadora> listaTransportadoras() {
        Iterable<Transportadora> listaTransportadoras = tr.findAll();
        return listaTransportadoras;
    }

    @PostMapping()
    public Transportadora CadastraTransportadora(@RequestBody @Valid Transportadora transportadora) {
        return tr.save(transportadora);
    }
    @DeleteMapping()
    public Transportadora deletaTransportadora(@RequestBody Transportadora transportadora ){
        tr.delete(transportadora);
        return transportadora;
    }

}
