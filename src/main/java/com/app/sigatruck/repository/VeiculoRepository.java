package com.app.sigatruck.repository;

import com.app.sigatruck.model.Motorista;
import com.app.sigatruck.model.Veiculo;

import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, String> {
    Iterable<Veiculo> findByMotorista(Motorista motorista);
}
