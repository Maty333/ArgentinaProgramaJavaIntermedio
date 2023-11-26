package com.argentinaPrograma.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Tecnico")
public class TecnicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTecnico")
    private int idTecnico;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Tiempo_Estimado_Resolucion")
    @Temporal(TemporalType.DATE)
    private Date tiempoEstimadoResolucion;

    @Column(name = "Medio_Preferido_Notificacion")
    private String medioPreferidoNotificacion;

    @ManyToMany
    @JoinTable(
            name = "Tecnico_Especialidad",
            joinColumns = @JoinColumn(name = "Tecnico_idTecnico"),
            inverseJoinColumns = @JoinColumn(name = "Especialidad_idEspecialidad")
    )
    private List<EspecialidadEntity> especialidades;



}
