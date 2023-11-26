package com.argentinaPrograma.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Incidente")
public class IncidenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIncidente")
    private int idIncidente;

    @Column(name = "Descripcion_Problema")
    private String descripcionProblema;

    @Column(name = "Tipo_Problema")
    private String tipoProblema;

    @Column(name = "Estado_Problema")
    private String estadoProblema;

    @Column(name = "Fecha_Ingreso_Incidente")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoIncidente;

    @Column(name = "Fecha_Resolucion_Incidente")
    @Temporal(TemporalType.DATE)
    private Date fechaResolucionIncidente;

    @Column(name = "Colchon_Horas_Estimado")
    private int colchonHorasEstimado;
    
    @Column(name = "Nombre_Operador")
    private String nombreOperador;

    @ManyToOne
    @JoinColumn(name = "Cliente_idCliente")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "Tecnico_IdTecnico")
    private TecnicoEntity tecnico;


}


