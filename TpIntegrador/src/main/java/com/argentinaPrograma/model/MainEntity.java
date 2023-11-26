package com.argentinaPrograma.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainEntity {
    public static void main(String[] args) {
       
        EntityManagerFactory emf = null;

        try {
            emf = Persistence.createEntityManagerFactory("Persistencia");
     
            EntityManager em = emf.createEntityManager();
               
            List<?> resultList = em.createQuery("SELECT t FROM TecnicoEntity t").getResultList();
        
            System.out.println("Resultados de la consulta: " + resultList);

            em.close();
        } catch (Exception e) {
         
            e.printStackTrace();
        } finally {
           
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }
}
