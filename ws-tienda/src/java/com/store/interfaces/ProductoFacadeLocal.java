package com.store.interfaces;

import com.store.entities.Producto;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ProductoFacadeLocal {

    void create(Producto producto);

    void edit(Producto producto);

    void remove(Producto producto);

    List<Producto> findAll();

}
