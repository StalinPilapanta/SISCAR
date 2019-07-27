/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.vista;

import com.uisrael.semana11siscar.controlador.IEmpleadosControlador;
import com.uisrael.semana11siscar.controlador.impl.EmpleadosControladorImpl;
import com.uisrael.semana11siscar.modelo.entidades.Empleados;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author master
 */
@ManagedBean(name = "empleadocore")
@ViewScoped
public class EmpleadosView implements Serializable {

    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String cargoEmpleado;
    private String telefonoEmpleado;
    
    private IEmpleadosControlador empleadoControlador;
    private Empleados nuevoEmpleado;

    private List<Empleados> listaEmpleados;
    
    public EmpleadosView() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador creado y listo");
        listarEmpleados();
    }
    
    

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    
    // getters and setters de entidades y Interfaces
    
    
    public IEmpleadosControlador getEmpleadoControlador() {
        return empleadoControlador;
    }

    public void setEmpleadoControlador(IEmpleadosControlador empleadoControlador) {
        this.empleadoControlador = empleadoControlador;
    }

    public Empleados getNuevoEmpleado() {
        return nuevoEmpleado;
    }

    public void setNuevoEmpleado(Empleados nuevoEmpleado) {
        this.nuevoEmpleado = nuevoEmpleado;
    }

    
    
    
    
    
    // getters and setters de la lista
    
    
    public List<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
   
    
    
    public void insertarEmpleado(){
    
        System.out.println("Insertando Empleado: " + nombreEmpleado);
        nuevoEmpleado = new Empleados();
        nuevoEmpleado.setNombre(nombreEmpleado);
        nuevoEmpleado.setApellido(apellidoEmpleado);
        nuevoEmpleado.setCargo(cargoEmpleado);
        nuevoEmpleado.setTelefono(telefonoEmpleado);
        empleadoControlador = new EmpleadosControladorImpl();
        empleadoControlador.insertarEmpleados(nuevoEmpleado);
        listarEmpleados();
    }

    public void listarEmpleados(){
    
        empleadoControlador = new EmpleadosControladorImpl();
        listaEmpleados = empleadoControlador.listarPersonas();
    }
    
}
