/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.beans;

import java.util.List;

/**
 *
 * @author daniel
 */
public class BeanGeneric <T> {
    
    protected T elementoent;
    protected List<T> lista ;
    
    public BeanGeneric (){}

    public T getElementoent() {
        return elementoent;
    }

    public void setElementoent(T elementoent) {
        this.elementoent = elementoent;
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
    
}
