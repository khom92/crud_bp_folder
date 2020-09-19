package com.store.repository.implementations;

import com.store.interfaces.dao_crud;
import com.store.interfaces.ClienteFacadeLocal;
import com.store.entities.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClienteFacade extends dao_crud<Cliente> implements ClienteFacadeLocal {
    
    @PersistenceContext(unitName = "data-access-store-wsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
}