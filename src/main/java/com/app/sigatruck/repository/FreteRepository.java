package com.app.sigatruck.repository;

import com.app.sigatruck.model.Frete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {


}
