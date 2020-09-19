package com.store.interfaces;

import com.store.entities.Cliente;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ClienteFacadeLocal {

    void create(Cliente entity);

    void edit(Cliente entity);

    void remove(Cliente entity);

    List<Cliente> findAll();

}
