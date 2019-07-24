/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.vista;

import com.uisrael.semana11siscar.controlador.IVehiculosControlador;
import com.uisrael.semana11siscar.controlador.impl.VehiculosControladorImpl;
import com.uisrael.semana11siscar.modelo.entidades.Vehiculos;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "vehiculocore")
@ViewScoped
public class VehiculosView implements Serializable {

    private String placa;
    private String matricula;
    private String color;
    private int anio;
    
    private IVehiculosControlador vehiculosControlador;
    private Vehiculos nuevoVehiculos;
    
    @PostConstruct
    public void init() {

        System.out.println("Vehiculos creado e iniciado managedBean");
    }

    public VehiculosView() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

       public void insertarTipoVehiculo(){
       
           System.out.println("Insertar vehiculo: " + placa);
           nuevoVehiculos = new Vehiculos();
           nuevoVehiculos.setPlaca(placa);
           nuevoVehiculos.setColor(color);
           nuevoVehiculos.setMatricula(matricula);
           nuevoVehiculos.setAnio(anio);
           vehiculosControlador = new VehiculosControladorImpl();
           vehiculosControlador.insertarVehiculos(nuevoVehiculos);
       }
}
