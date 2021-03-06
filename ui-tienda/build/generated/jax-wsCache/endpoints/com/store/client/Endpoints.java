
package com.store.client;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "endpoints", targetNamespace = "http://ws.store.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Endpoints {


    /**
     * 
     * @param producto
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editProducto", targetNamespace = "http://ws.store.com/", className = "com.store.client.EditProducto")
    @Action(input = "http://ws.store.com/endpoints/editProducto")
    public void editProducto(
        @WebParam(name = "producto", targetNamespace = "http://ws.store.com/")
        Producto producto);

    /**
     * 
     * @param orden
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createOrden", targetNamespace = "http://ws.store.com/", className = "com.store.client.CreateOrden")
    @Action(input = "http://ws.store.com/endpoints/createOrden")
    public void createOrden(
        @WebParam(name = "orden", targetNamespace = "http://ws.store.com/")
        Orden orden);

    /**
     * 
     * @param producto
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createProducto", targetNamespace = "http://ws.store.com/", className = "com.store.client.CreateProducto")
    @Action(input = "http://ws.store.com/endpoints/createProducto")
    public void createProducto(
        @WebParam(name = "producto", targetNamespace = "http://ws.store.com/")
        Producto producto);

    /**
     * 
     * @return
     *     returns java.util.List<com.store.client.Cliente>
     */
    @WebMethod(operationName = "findAll_cliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll_cliente", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllCliente")
    @ResponseWrapper(localName = "findAll_clienteResponse", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllClienteResponse")
    @Action(input = "http://ws.store.com/endpoints/findAll_clienteRequest", output = "http://ws.store.com/endpoints/findAll_clienteResponse")
    public List<Cliente> findAllCliente();

    /**
     * 
     * @param orden
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editOrden", targetNamespace = "http://ws.store.com/", className = "com.store.client.EditOrden")
    @Action(input = "http://ws.store.com/endpoints/editOrden")
    public void editOrden(
        @WebParam(name = "orden", targetNamespace = "http://ws.store.com/")
        Orden orden);

    /**
     * 
     * @return
     *     returns java.util.List<com.store.client.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllProducto", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllProducto")
    @ResponseWrapper(localName = "findAllProductoResponse", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllProductoResponse")
    @Action(input = "http://ws.store.com/endpoints/findAllProductoRequest", output = "http://ws.store.com/endpoints/findAllProductoResponse")
    public List<Producto> findAllProducto();

    /**
     * 
     * @param cliente
     */
    @WebMethod(operationName = "edit_cliente_dto")
    @Oneway
    @RequestWrapper(localName = "edit_cliente_dto", targetNamespace = "http://ws.store.com/", className = "com.store.client.EditClienteDto")
    @Action(input = "http://ws.store.com/endpoints/edit_cliente_dto")
    public void editClienteDto(
        @WebParam(name = "cliente", targetNamespace = "")
        ClienteDto cliente);

    /**
     * 
     * @param cliente
     */
    @WebMethod(operationName = "remove_cliente_dto")
    @Oneway
    @RequestWrapper(localName = "remove_cliente_dto", targetNamespace = "http://ws.store.com/", className = "com.store.client.RemoveClienteDto")
    @Action(input = "http://ws.store.com/endpoints/remove_cliente_dto")
    public void removeClienteDto(
        @WebParam(name = "cliente", targetNamespace = "")
        ClienteDto cliente);

    /**
     * 
     * @param orden
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeOrden", targetNamespace = "http://ws.store.com/", className = "com.store.client.RemoveOrden")
    @Action(input = "http://ws.store.com/endpoints/removeOrden")
    public void removeOrden(
        @WebParam(name = "orden", targetNamespace = "http://ws.store.com/")
        Orden orden);

    /**
     * 
     * @param producto
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeProducto", targetNamespace = "http://ws.store.com/", className = "com.store.client.RemoveProducto")
    @Action(input = "http://ws.store.com/endpoints/removeProducto")
    public void removeProducto(
        @WebParam(name = "producto", targetNamespace = "http://ws.store.com/")
        Producto producto);

    /**
     * 
     * @param cliente
     */
    @WebMethod(operationName = "create_cliente_dto")
    @Oneway
    @RequestWrapper(localName = "create_cliente_dto", targetNamespace = "http://ws.store.com/", className = "com.store.client.CreateClienteDto")
    @Action(input = "http://ws.store.com/endpoints/create_cliente_dto")
    public void createClienteDto(
        @WebParam(name = "cliente", targetNamespace = "")
        ClienteDto cliente);

    /**
     * 
     * @return
     *     returns java.util.List<com.store.client.Orden>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllOrden", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllOrden")
    @ResponseWrapper(localName = "findAllOrdenResponse", targetNamespace = "http://ws.store.com/", className = "com.store.client.FindAllOrdenResponse")
    @Action(input = "http://ws.store.com/endpoints/findAllOrdenRequest", output = "http://ws.store.com/endpoints/findAllOrdenResponse")
    public List<Orden> findAllOrden();

}
