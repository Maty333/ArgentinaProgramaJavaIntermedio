package com.argentinaPrograma.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Cliente") 
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Long idCliente;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "Cuit")
    private String cuit;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Telefono")
    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<IncidenteEntity> incidentes;


    

    // Constructor, getters, setters, etc.
}
