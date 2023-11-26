package com.argentinaPrograma.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Especialidad")
public class EspecialidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEspecialidad")
    private int idEspecialidad;

    @Column(name = "Especialidad_Nombre")
    private String especialidadNombre;

    @ManyToMany(mappedBy = "especialidades")
    private List<TecnicoEntity> tecnicos;

}
