package com.app.sigatruck.Services;

import com.app.sigatruck.model.Endereco;
import com.app.sigatruck.model.Transportadora;
import com.app.sigatruck.repository.EnderecoRepository;
import com.app.sigatruck.repository.TransportadoraRepository;
import com.app.sigatruck.service.DTO.AdicionaTransportadoraDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class ServiceTransportadora {

    @Autowired
    private TransportadoraRepository tr;
    @Autowired
    private EnderecoRepository er;


    public Long adicionaTransportadora(AdicionaTransportadoraDto dto) {
        Optional<Endereco> enderecoOrError = er.findById(dto.getEndereco_Id());
        if (enderecoOrError.isEmpty()) {
            System.out.println("Endereço não pode ser em branco");
        }
        Transportadora transportadora = new Transportadora();
        transportadora.setId(dto.getId());
        transportadora.setNome(dto.getNome());
        transportadora.setEmail(dto.getEmail());
        transportadora.setSenha(dto.getSenha());
        transportadora.setCnpj(dto.getCnpj());
        transportadora.setTelefone(dto.getTelefone());


        transportadora.setEndereco(enderecoOrError.get());
return 1L;
    }
}