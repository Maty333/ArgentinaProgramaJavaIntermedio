package com.argentinaPrograma.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Servicio")
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio")
    private int idServicio;

    @Column(name = "Tipo_Servicio")
    private String tipoServicio;

    @Column(name = "Descripcion_Servicio")
    private String descripcionServicio;

    @ManyToOne
    @JoinColumn(name = "Cliente_idCliente")
    private ClienteEntity cliente;

}
