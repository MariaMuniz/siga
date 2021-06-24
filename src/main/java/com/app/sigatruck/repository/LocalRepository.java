package com.app.sigatruck.repository;

import com.app.sigatruck.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository  extends JpaRepository<Local, Long> {
}
