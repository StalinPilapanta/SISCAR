/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.vista;

import com.uisrael.semana11siscar.controlador.IDetalleControlador;
import com.uisrael.semana11siscar.controlador.impl.DetalleControladorImpl;
import com.uisrael.semana11siscar.modelo.entidades.Detalle;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Stalin
 */
@ManagedBean
@ViewScoped
public class DetalleView implements Serializable{
    
    private long kilometraje;
    private int estado;//1 bueno 0 malo
    private String trabajosRealizado;
    private String telefonoContacto;
    private String observaciones;
    
    private Detalle nuevoDetalle;
    private IDetalleControlador detalleConstructor;
    
    @PostConstruct
    public void init(){
        System.out.println("ManagedBean Detalle listo!!!");
    }

    public DetalleView() {
    }

    public long getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(long kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getTrabajosRealizado() {
        return trabajosRealizado;
    }

    public void setTrabajosRealizado(String trabajosRealizado) {
        this.trabajosRealizado = trabajosRealizado;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public void insertarDetalle(){
        
        System.out.println("Insertar nuevo detalle: " + observaciones);
    nuevoDetalle = new Detalle();
    nuevoDetalle.setKilometraje(kilometraje);
    nuevoDetalle.setEstado(estado);
    nuevoDetalle.setTrabajosRealizado(trabajosRealizado);
    nuevoDetalle.setObservaciones(observaciones);
    
    detalleConstructor = new DetalleControladorImpl();
    detalleConstructor.insertarDetalle(nuevoDetalle);
    }
    
}
