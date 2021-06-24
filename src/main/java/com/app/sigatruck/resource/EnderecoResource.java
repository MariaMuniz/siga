package com.app.sigatruck.resource;

import com.app.sigatruck.model.Endereco;
import com.app.sigatruck.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {


    @Autowired
    private EnderecoRepository er;

    @GetMapping(produces = "application/json")

    public @ResponseBody
    Iterable<Endereco> listaEndereco() {
        Iterable<Endereco> listaEnderecos = er.findAll();
        return listaEnderecos;
    }


    @PostMapping()
    public Endereco CadastraEndereco(@RequestBody @Valid Endereco endereco) {

        return er.save(endereco);
    }

    @DeleteMapping()
    public Endereco deletaEndereco (@RequestBody Endereco endereco ){
        er.delete(endereco);
        return endereco ;

}
}