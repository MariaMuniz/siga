package com.app.sigatruck.repository;

import com.app.sigatruck.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository  extends JpaRepository<Endereco, Long> {
}
