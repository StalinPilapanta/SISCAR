/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.vista;

import com.uisrael.semana11siscar.controlador.IOrdenTrabajoControlador;
import com.uisrael.semana11siscar.controlador.impl.OrdenTrabajoControladorImpl;
import com.uisrael.semana11siscar.modelo.entidades.OrdenTrabajo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "ordetrabajocore")
@ViewScoped
public class OrdenTrabajoView implements Serializable {

    private String nombre;
    private String direccion;
    private int telefono;
    private String fechaIngreso;
    private String fechaSalida;
    
    private OrdenTrabajo nuevaOrdenTrabajo;
    private IOrdenTrabajoControlador ordenTrabajoControlador;

    @PostConstruct
    public void init(){
        System.out.println("ManagedBean Orden de trabajo Lista");
    }

    public OrdenTrabajoView() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public OrdenTrabajo getNuevaOrdenTrabajo() {
        return nuevaOrdenTrabajo;
    }

    public void setNuevaOrdenTrabajo(OrdenTrabajo nuevaOrdenTrabajo) {
        this.nuevaOrdenTrabajo = nuevaOrdenTrabajo;
    }

    public IOrdenTrabajoControlador getOrdenTrabajoControlador() {
        return ordenTrabajoControlador;
    }

    public void setOrdenTrabajoControlador(IOrdenTrabajoControlador ordenTrabajoControlador) {
        this.ordenTrabajoControlador = ordenTrabajoControlador;
    }
    
    public void insetarOrdenTrabajo(){
        nuevaOrdenTrabajo = new OrdenTrabajo();
        nuevaOrdenTrabajo.setNombre(nombre);
        nuevaOrdenTrabajo.setDireccion(direccion);
        nuevaOrdenTrabajo.setTelefono(telefono);
        nuevaOrdenTrabajo.setFechaIngreso(fechaIngreso);
        nuevaOrdenTrabajo.setFechaSalida(fechaSalida);
        
        ordenTrabajoControlador = new OrdenTrabajoControladorImpl();
        ordenTrabajoControlador.insertarOrdenTrabajo(nuevaOrdenTrabajo);
    }
}
