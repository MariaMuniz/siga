package com.app.sigatruck.Services;

import com.app.sigatruck.model.Motorista;
import com.app.sigatruck.repository.MotoristaRepository;

import com.app.sigatruck.service.DTO.AdicionaMotoristaDto
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class ServiceMotorista {

    @Autowired
    private MotoristaRepository mr;


    public Long adicionaMotorista(AdicionaMotoristaDto dto) {
        Optional<Motorista> motoristaOrError = mr.findById(dto.getId());
        if (motoristaOrError.isEmpty()) {
            System.out.println("motorista não pode ser em branco");
        }
        Motorista motorista = new Motorista();
        motorista.setNome(dto.getNome());
        motorista.setEmail(dto.getEmail());
        motorista.setSenha(dto.getSenha());
        motorista.setCpf(dto.getCpf());
        motorista.setRg(dto.getRg());
        motorista.setTelefone(dto.getTelefone());
        motorista.setEstado_civil(dto.getEstado_civil());
        motorista.setSexo(dto.getSexo());
        motorista.setDisponibilidade(dto.getDisponibilidade());
        motorista.setPreferencia_estado(dto.getPreferencia_estado());
        motorista.setPreferencia_cidade(dto.getPreferencia_cidade());
        motorista.setData_nasc(dto.getData_nas());
        motorista.setFoto_Cnh(dto.getFoto_Cnh());
        motorista.setIndicacao(dto.getIndicacao());
        motorista.setZap(dto.getZap());

        motorista.setMotorista(motoristaOrError.get());
        return 1L;
    }
}