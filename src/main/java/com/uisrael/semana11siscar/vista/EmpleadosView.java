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

    public EmpleadosView() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador creado y listo");
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

    
    public void insertarEmpleado(){
    
        System.out.println("Insertando Empleado: " + nombreEmpleado);
        nuevoEmpleado = new Empleados();
        nuevoEmpleado.setNombre(nombreEmpleado);
        nuevoEmpleado.setApellido(apellidoEmpleado);
        nuevoEmpleado.setCargo(cargoEmpleado);
        nuevoEmpleado.setTelefono(telefonoEmpleado);
        empleadoControlador = new EmpleadosControladorImpl();
        empleadoControlador.insertarEmpleados(nuevoEmpleado);
    }
}
