package com.store.beans;

import com.store.client.Cliente;
import com.store.client.ClienteDto;
import com.store.dao.Cliente_access;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author daniel
 */

@ManagedBean
@ViewScoped
public class ClienteBean extends BeanGeneric<Cliente> implements Serializable{
    
    public ClienteBean(){}
    
    @PostConstruct
    public void init () {
        try {
            elementoent = new Cliente();
            lista = Cliente_access.findAllCliente();   
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
     
    @Override
    public Cliente getElementoent() {
        return elementoent;
    }

    @Override
    public void setElementoent(Cliente elementoent) {
        this.elementoent = elementoent;
    }
    
    public void crear(){
        try {
            ClienteDto cli = new ClienteDto();
            cli.setNombres(elementoent.getNombres());
            cli.setApellidos(elementoent.getApellidos());
            Cliente_access.createClienteDto(cli);
            lista = Cliente_access.findAllCliente();
        } catch (Exception e) {
             System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
    
    public void editar(){
        try {
            ClienteDto cli = new ClienteDto();
            cli.setNombres(elementoent.getNombres());
            cli.setApellidos(elementoent.getApellidos());
            cli.setIdCliente(elementoent.getIdCliente());
            Cliente_access.editClienteDto(cli);
            lista = Cliente_access.findAllCliente();
        } catch (Exception e) {
             System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
    
    public void eliminar(){
        try {
            ClienteDto cli = new ClienteDto();
            cli.setNombres(elementoent.getNombres());
            cli.setApellidos(elementoent.getApellidos());
            cli.setIdCliente(elementoent.getIdCliente());
            Cliente_access.removeClienteDto(cli);
            lista = Cliente_access.findAllCliente();
        } catch (Exception e) {
             System.out.println(e.getStackTrace()[0].getMethodName()+e.getStackTrace()[0].getLineNumber()+e.getMessage());
        }
    }
    
    public void limpiarCliente(){
        elementoent = new Cliente();
    }
    
}
