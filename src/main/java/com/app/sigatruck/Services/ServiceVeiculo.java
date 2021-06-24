package com.app.sigatruck.Services;

import com.app.sigatruck.model.Motorista;
import com.app.sigatruck.model.Veiculo;
import com.app.sigatruck.repository.MotoristaRepository;
import com.app.sigatruck.repository.VeiculoRepository;
import com.app.sigatruck.service.DTO.AdicionaVeiculoDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceVeiculo {

        @Autowired
        private VeiculoRepository vp;

        @Autowired
    private MotoristaRepository mr;

        public Long adicionaVeiculo(AdicionaVeiculoDto dto) {
            Optional<Motorista> motoristaOrError = mr.findById(dto.getMotorista_Id());
            if(motoristaOrError.isEmpty() ){
                System.out.println("motorista não pode ser em branco");
            }
            Veiculo veiculo = new Veiculo();
            veiculo.setAno(dto.getAno());
            veiculo.setModelo(dto.getModelo());
            veiculo.setMarca(dto.getMarca());
            veiculo.setCor(dto.getCor());
            veiculo.setPlaca(dto.getPlaca());
            veiculo.setQtd_eixo(dto.getQtd_eixo());
            veiculo.setRastreador1(dto.getRastreador1());
            veiculo.setRastreador2(dto.getRastreador2());
            veiculo.setCapacidade(dto.getCapacidade());
            veiculo.setFoto_Frente_Veiculo(dto.getFoto_Frente_Veiculo());
            veiculo.setFoto_Crlv_Veiculo(dto.getFoto_Crlv_Veiculo());

            veiculo.setMotorista(motoristaOrError.get());



            return 1L;
        }

    }
