/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajo;

import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Persona;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
/**
 *
 * @author 
 */
@Stateless
@LocalBean
public class Query extends Examples<Persona> implements Serializable {
    
    @PersistenceContext(unitName="bolsaPU")
    EntityManager em;
    
    @Override
    EntityManager getEntityManager(){
        return em;
    }
    
    public Query(){
        super(Persona.class);
    }
}
