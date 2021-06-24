package com.app.sigatruck.Services;

import com.app.sigatruck.model.Endereco;
import com.app.sigatruck.model.Motorista;
import com.app.sigatruck.repository.EnderecoRepository;
import com.app.sigatruck.repository.MotoristaRepository;
import com.app.sigatruck.service.DTO.AdicionaEnderecoDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceEndereco {

    @Autowired
    private MotoristaRepository mr;
    @Autowired
    private EnderecoRepository er;

    public Long adicionaEndereco(AdicionaEnderecoDto dto) {
        Optional<Motorista> motoristaOrError = mr.findById(dto.getMotorista_Id());
        if (motoristaOrError.isEmpty()) {
            System.out.println("motorista não pode ser em branco");
        }
        Endereco  endereco= new Endereco();
        endereco.setCep(dto.getCep());
        endereco.setEstado(dto.getEstado());
        endereco.setCidade(dto.getCidade());
        endereco.setBairro(dto.getBairro());
        endereco.setRua(dto.getRua());
        endereco.setNumero(dto.getNumero());

return 1L;
    }
}
