/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 
 */
public abstract class Examples<T> implements Serializable {

    protected final Class clase;

    public Examples(Class clase) {
        this.clase = clase;
    }

    abstract EntityManager getEntityManager();

    public Long contar() {
        EntityManager em = null;
        try {
            em = this.getEntityManager();
        } catch (Exception ex) {
            throw new IllegalStateException("No se pudo crear EntityManager");
        }

        if (em != null) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            cq.select(cb.count(cq.from(clase)));

            return em.createQuery(cq).getSingleResult();
        }

        throw new IllegalArgumentException("No se pued obtener ambito");
    }

    protected TypedQuery generarConsultaBase(EntityManager em) {
        if (em != null) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(clase);
            Root<T> raiz = cq.from(clase);
            cq.select(raiz);
            return em.createQuery(cq);
        }
        throw new IllegalArgumentException();
    }

    public List<T> findAll() {
        EntityManager em = null;
        try {
            em = this.getEntityManager();
        } catch (Exception ex) {
            throw new IllegalArgumentException("No se puede ");
        }
        if (em != null) {
            TypedQuery q = this.generarConsultaBase(em);
            List salida = q.getResultList();
            if (salida != null) {
                return salida;
            }
            System.out.println("EM es null");
            return Collections.EMPTY_LIST;
        }
        System.out.println("No se pudo obtener el ambito");
        return Collections.EMPTY_LIST;
    }

}
