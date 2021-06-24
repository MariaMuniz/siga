package com.app.sigatruck.repository;

import com.app.sigatruck.model.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {






}
