package com.app.sigatruck.repository;

import com.app.sigatruck.model.Transportadora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportadoraRepository extends JpaRepository<Transportadora, Long> {
}
