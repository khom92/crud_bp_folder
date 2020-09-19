/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.repository.implementations;

import com.store.interfaces.OrdenFacadeLocal;
import com.store.interfaces.dao_crud;
import com.store.entities.Orden;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author daniel
 */
@Stateless
public class OrdenFacade extends dao_crud<Orden> implements OrdenFacadeLocal {
    @PersistenceContext(unitName = "data-access-store-wsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenFacade() {
        super(Orden.class);
    }
    
}
