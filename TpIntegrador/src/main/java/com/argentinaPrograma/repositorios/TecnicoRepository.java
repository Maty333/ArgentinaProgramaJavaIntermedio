package com.argentinaPrograma.repositorios;

import com.argentinaPrograma.model.TecnicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<TecnicoEntity, Long> {
    TecnicoEntity findByNombre(String nombre);
}
