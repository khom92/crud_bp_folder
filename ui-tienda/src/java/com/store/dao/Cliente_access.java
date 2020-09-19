package com.store.dao;

/**
 *
 * @author daniel
 */

public class Cliente_access {

    public static java.util.List<com.store.client.Cliente> findAllCliente() {
        com.store.client.Endpoints_Service service = new com.store.client.Endpoints_Service();
        com.store.client.Endpoints port = service.getEndpointsPort();
        return port.findAllCliente();
    }

    public static void editClienteDto(com.store.client.ClienteDto cliente) {
        com.store.client.Endpoints_Service service = new com.store.client.Endpoints_Service();
        com.store.client.Endpoints port = service.getEndpointsPort();
        port.editClienteDto(cliente);
    }

    public static void createClienteDto(com.store.client.ClienteDto cliente) {
        com.store.client.Endpoints_Service service = new com.store.client.Endpoints_Service();
        com.store.client.Endpoints port = service.getEndpointsPort();
        port.createClienteDto(cliente);
    }

    public static void removeClienteDto(com.store.client.ClienteDto cliente) {
        com.store.client.Endpoints_Service service = new com.store.client.Endpoints_Service();
        com.store.client.Endpoints port = service.getEndpointsPort();
        port.removeClienteDto(cliente);
    }









     
}