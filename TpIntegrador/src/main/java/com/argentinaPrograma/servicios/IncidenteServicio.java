package com.argentinaPrograma.servicios;

import com.argentinaPrograma.model.IncidenteEntity;
import com.argentinaPrograma.model.TecnicoEntity;
import com.argentinaPrograma.repositorios.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

//// @Service
//public class IncidenteServicio {
//
//    private final IncidenteRepository incidenteRepository;
//
//   // @Autowired
//    public IncidenteServicio(IncidenteRepository incidenteRepository) {
//        this.incidenteRepository = incidenteRepository;
//    }
//
////    public TecnicoEntity obtenerTecnicoConMasIncidentesResueltosEnUltimosNDias(int n) {
////        
////        return encontrarTecnicoConMasIncidentes(incidentes);
////    }
////
////    public TecnicoEntity obtenerTecnicoConMasIncidentesDeEspecialidadResueltosEnUltimosNDias(int n, String especialidad) {
////        
////        return encontrarTecnicoConMasIncidentes(incidentes);
////    }
////
////    public TecnicoEntity obtenerTecnicoQueMasRapidoResolvioIncidentes() {
////       
////        return encontrarTecnicoConMasIncidentes(incidentes);
////    }
////
////    private TecnicoEntity encontrarTecnicoConMasIncidentes(List<IncidenteEntity> incidentes) {
////      
////
////     
////        return incidentes.isEmpty() ? null : incidentes.get(0).getTecnico();
////    }
//}

