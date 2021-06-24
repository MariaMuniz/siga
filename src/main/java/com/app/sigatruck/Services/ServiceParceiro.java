package com.app.sigatruck.Services;

import com.app.sigatruck.model.Endereco;
import com.app.sigatruck.model.Parceiro;

import com.app.sigatruck.repository.EnderecoRepository;
import com.app.sigatruck.repository.ParceiroRepository;
import com.app.sigatruck.service.DTO.AdicionaParceiroDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class ServiceParceiro {

    @Autowired
    private ParceiroRepository pr;

    @Autowired
    private EnderecoRepository er;

    public Long adicionaParceiro(AdicionaParceiroDto dto) {
        Optional<Endereco> enderecoOrError = er.findById(dto.getEndereco_Id());
        if (enderecoOrError.isEmpty()) {
            System.out.println("Endereço não pode ser em branco");
        }

        Parceiro  parceiro = new Parceiro();
        parceiro.setNome(dto.getNome());
        parceiro.setEmail(dto.getEmail());
        parceiro.setSenha(dto.getSenha());
        parceiro.setLogo(dto.getLogo());
        parceiro.setHorario(dto.getHorario());
        parceiro.setTelefone(dto.getTelefone());

        parceiro.setEndereco(enderecoOrError.get());
        return 1L;

    }
}
