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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table (name="empleados")
public class Empleados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String cargo;
    private String telefono;
    
    @OneToMany(mappedBy = "fkIdEmpleados")
    private List<OrdenTrabajo> fkIdOrdenTrabajo = new ArrayList<>();

    public Empleados() {
    }

    public Empleados(int idEmpleado, String nombre, String apellido, String cargo, String telefono) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    public int getidEmpleado() {
        return idEmpleado;
    }

    public void setidEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleados{" + "empleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", telefono=" + telefono + '}';
    }
    
    
    
}
