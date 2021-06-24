package com.app.sigatruck.Services;

import com.app.sigatruck.model.Frete;
import com.app.sigatruck.model.Transportadora;
import com.app.sigatruck.repository.FreteRepository;
import com.app.sigatruck.repository.TransportadoraRepository;
import com.app.sigatruck.service.DTO.AdicionaFreteDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceFrete {

    @Autowired
    private FreteRepository fr;

    @Autowired
    private TransportadoraRepository tr;

    public Long adicionaFrete(AdicionaFreteDto dto) {
        Optional<Transportadora> transportadoraOrError = tr.findById(dto.getTransportadora_Id());
        if (transportadoraOrError.isEmpty()) {
            System.out.println("transportadora não pode ser em branco");
        }
        Frete frete = new Frete();
        frete.setCodigo(dto.getCodigo());
        frete.setTransportadora_telefone(dto.getTransportadora_telefone());
        frete.setOrigem_estado(dto.getOrigem_estado());
        frete.setOrigem_cidade(dto.getOrigem_cidade());
        frete.setDestino_cidade(dto.getDestino_cidade());
        frete.setDestino_estado(dto.getDestino_estado());
        frete.setTipo_veiculo(dto.getTipo_veiculo());
        frete.setTipo_carreta(dto.getTipo_carreta());
        frete.setQtd_eixos(dto.getQtd_eixos());
        frete.setPeso(dto.getPeso());
        frete.setPreco(dto.getPreco());
        frete.setProduto(dto.getProduto());
        frete.setQuantidade(dto.getQuantidade());
        frete.setValidade(dto.getValidade());
        frete.setDimensao(dto.getDimensao());
        frete.setObservacao(dto.getObservacao());
        frete.setTipo_pagamento(dto.getTipo_pagamento());
        frete.setTipo_carga(dto.getTipo_carga());
        frete.setTransportadora(transportadoraOrError.get());

        return 1L;
    }

    }
