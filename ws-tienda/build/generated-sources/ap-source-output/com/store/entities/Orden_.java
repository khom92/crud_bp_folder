package com.store.entities;

import com.store.entities.Cliente;
import com.store.entities.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-19T11:16:41")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, Cliente> idCliente;
    public static volatile SingularAttribute<Orden, Integer> cantidad;
    public static volatile SingularAttribute<Orden, Producto> idProducto;
    public static volatile SingularAttribute<Orden, Integer> idOrden;

}