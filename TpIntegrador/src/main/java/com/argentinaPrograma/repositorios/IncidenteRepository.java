package com.argentinaPrograma.repositorios;

import com.argentinaPrograma.model.IncidenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository<IncidenteEntity, Long> {
   
}
