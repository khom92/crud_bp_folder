package com.store.interfaces;

import com.store.entities.Orden;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrdenFacadeLocal {

    void create(Orden orden);

    void edit(Orden orden);

    void remove(Orden orden);

    List<Orden> findAll();

}
