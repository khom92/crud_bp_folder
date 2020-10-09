package com.store.ws;

import com.store.dto.ClienteDto;
import com.store.interfaces.ClienteFacadeLocal;
import com.store.interfaces.ProductoFacadeLocal;
import com.store.interfaces.OrdenFacadeLocal;
import com.store.entities.Cliente;
import com.store.entities.Orden;
import com.store.entities.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "endpoints")
@Stateless()
public class endpoints {
    
    @EJB
    private ClienteFacadeLocal ejbCliente;
    
    @EJB
    private OrdenFacadeLocal ejbOrden;
    
    @EJB
    private ProductoFacadeLocal ejbProducto;
  
    
    @WebMethod(operationName = "create_cliente_dto")
    @Oneway
    public void createCliente(@WebParam(name = "cliente") ClienteDto cliente) {
        try {
            Cliente cli = new Cliente();
            cli.setNombres(cliente.getNombres());
            cli.setApellidos(cliente.getApellidos());
            ejbCliente.create(cli);
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
    
    @WebMethod(operationName = "edit_cliente_dto")
    @Oneway
    public void editCliente(@WebParam(name = "cliente") ClienteDto cliente) {
        try {
            Cliente cli = new Cliente();
            cli.setNombres(cliente.getNombres());
            cli.setApellidos(cliente.getApellidos());
            cli.setIdCliente(cliente.getIdCliente());
            ejbCliente.edit(cli);
         } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
    
    @WebMethod(operationName = "remove_cliente_dto")
    @Oneway
    public void removeCliente(@WebParam(name = "cliente") ClienteDto cliente) {
        try {
            Cliente cli = new Cliente();
            cli.setNombres(cliente.getNombres());
            cli.setApellidos(cliente.getApellidos());
            cli.setIdCliente(cliente.getIdCliente());
            ejbCliente.remove(cli);
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }

    @WebMethod(operationName = "findAll_cliente")
    public List<Cliente> findAllCliente() {
        try {
            return ejbCliente.findAll();
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
            return null;
        }
    }
    
    
    @WebMethod(operationName = "createOrden")
    @Oneway
    public void createOrden(@WebParam(name = "orden") Orden orden) {
        ejbOrden.create(orden);
    }
    
    @WebMethod(operationName = "editOrden")
    @Oneway
    public void editOrden(@WebParam(name = "orden") Orden orden) {
        ejbOrden.edit(orden);
    }

    @WebMethod(operationName = "removeOrden")
    @Oneway
    public void removeOrden(@WebParam(name = "orden") Orden orden) {
        ejbOrden.remove(orden);
    }
    
    @WebMethod(operationName = "findAllOrden")
    public List<Orden> findAllOrden() {
        return ejbOrden.findAll();
    }
    
    
    @WebMethod(operationName = "createProducto")
    @Oneway
    public void createProducto(@WebParam(name = "producto") Producto producto) {
        ejbProducto.create(producto);
    }
    
    @WebMethod(operationName = "editProducto")
    @Oneway
    public void editProducto(@WebParam(name = "producto") Producto producto) {
        ejbProducto.edit(producto);
    }

    @WebMethod(operationName = "removeProducto")
    @Oneway
    public void removeProducto(@WebParam(name = "producto") Producto producto) {
        ejbProducto.remove(producto);
    }
    
    @WebMethod(operationName = "findAllProducto")
    public List<Producto> findAllProducto() {
        return ejbProducto.findAll();
    }

}