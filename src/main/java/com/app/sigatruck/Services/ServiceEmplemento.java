package com.app.sigatruck.Services;

import com.app.sigatruck.model.Emplemento;
import com.app.sigatruck.model.Veiculo;
import com.app.sigatruck.repository.EmplementoRepository;
import com.app.sigatruck.repository.VeiculoRepository;
import com.app.sigatruck.service.DTO.AdicionaEmplementoDto;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;


public class ServiceEmplemento {
    @Autowired
    private EmplementoRepository emr;
    @Autowired
    private VeiculoRepository vp;

    public Long adicionaEmplemento(AdicionaEmplementoDto dto) {
        Optional<Veiculo> veiculoOrError = vp.findById(dto.getVeiculo_Id(Long));
        if (veiculoOrError.isEmpty()) {
            System.out.println("veiculo não pode ser em branco");
        }
        Emplemento emplemento = new Emplemento();
        emplemento.setCategoria(dto.getCategoria());
        emplemento.setMarca(dto.getMarca());
        emplemento.setModelo(dto.getModelo());
        emplemento.setCor(dto.getCor());
        emplemento.setAno(dto.getAno());
        emplemento.setQtd_eixo(dto.getQtd_eixo());
        emplemento.setCapacidade(dto.getCapacidade());
        emplemento.setFoto_Crlv_Emplemento(dto.getFoto_Crlv_Emplemento());

        emplemento.setVeiculo(veiculoOrError.get());
        return 1L;
    }
}