package com.store.dto;

public class ClienteDto {

    protected String apellidos;
    protected Integer idCliente;
    protected String nombres;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String value) {
        this.apellidos = value;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String value) {
        this.nombres = value;
    }

}
