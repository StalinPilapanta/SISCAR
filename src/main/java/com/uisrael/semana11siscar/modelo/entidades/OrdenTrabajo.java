/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 *
 * @author Stalin
 */
@Entity
@Table(name="ordentrabajo")
public class OrdenTrabajo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOtrabajo;
    private String nombre;
    private String direccion;
    private int telefono;
    private String fechaIngreso;
    private String fechaSalida;
    private int idEmpleado;
    private int idVehiculo;
    
    @ManyToOne
    @JoinColumn(name = "fkIdOtrabajo")
    private Vehiculos fkIdVehiculo;
    
    @ManyToOne
    @JoinColumn(name = "fkIdOrdenTrabajo")
    private Empleados fkIdEmpleados;
    
    @OneToMany(mappedBy = "fkIdOrdenTrabajo")
    private List<Detalle> fkIdDetalle = new ArrayList<>();
    

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int idOtrabajo, String nombre, String direccion, int telefono, String fechaIngreso, String fechaSalida, int idEmpleado, int idVehiculo) {
        this.idOtrabajo = idOtrabajo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.idEmpleado = idEmpleado;
        this.idVehiculo = idVehiculo;
    }

    public int getIdOtrabajo() {
        return idOtrabajo;
    }

    public void setIdOtrabajo(int idOtrabajo) {
        this.idOtrabajo = idOtrabajo;
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

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    @Override
    public String toString() {
        return "OrdenTrabajo{" + "idOtrabajo=" + idOtrabajo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", idEmpleado=" + idEmpleado + ", idVehiculo=" + idVehiculo + '}';
    }

         
    
    
}
