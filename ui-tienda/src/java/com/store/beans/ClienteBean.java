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
         elementoent = new Cliente();
         lista = Cliente_access.findAllCliente();
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
        ClienteDto cli = new ClienteDto();
        cli.setNombres(elementoent.getNombres());
        cli.setApellidos(elementoent.getApellidos());
        Cliente_access.createClienteDto(cli);
    }
    
    public void editar(){
        ClienteDto cli = new ClienteDto();
        cli.setNombres(elementoent.getNombres());
        cli.setApellidos(elementoent.getApellidos());
        cli.setIdCliente(elementoent.getIdCliente());
        Cliente_access.editClienteDto(cli);
    }
    
    public void eliminar(){
        ClienteDto cli = new ClienteDto();
        cli.setNombres(elementoent.getNombres());
        cli.setApellidos(elementoent.getApellidos());
        cli.setIdCliente(elementoent.getIdCliente());
        Cliente_access.removeClienteDto(cli);
    }
    
    public void limpiarCliente(){
        elementoent = new Cliente();
    }
    
}
