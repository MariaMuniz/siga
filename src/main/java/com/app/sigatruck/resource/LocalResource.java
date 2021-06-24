package com.app.sigatruck.resource;

import com.app.sigatruck.model.Local;
import com.app.sigatruck.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/local")

public class LocalResource {
    @Autowired
    private LocalRepository lr;

    @GetMapping(produces = "application/json")

    public @ResponseBody
    Iterable<Local> listaLocal() {
        Iterable<Local> listaLocais = lr.findAll();
        return listaLocais;
    }


    @PostMapping()
    public Local CadastraLocal(@RequestBody @Valid Local local) {
        return lr.save(local);
    }

    @DeleteMapping()
    public Local deletaLocal (@RequestBody Local local  ){
        lr.delete(local);
        return local ;
    }
}
