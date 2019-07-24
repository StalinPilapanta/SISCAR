/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
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
@Table(name="vehiculos")
public class Vehiculos implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_vehiculo")
    private int idVehiculo;
    private String placa;
    private String matricula;
    private String color;
    private int anio;
    
    @ManyToOne
    @JoinColumn(name = "fkIdVehiculo")
    private TipoVehiculos fkIdTvehiculo;
    
    @OneToMany(mappedBy = "fkIdVehiculo")
    private List<OrdenTrabajo> fkIdOtrabajo = new ArrayList<>();

    public Vehiculos() {
    }

    public Vehiculos(int idVehiculo, String placa, String matricula, String color, int anio, int idTvehiculo) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.matricula = matricula;
        this.color = color;
        this.anio = anio;
        
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    

    @Override
    public String toString() {
        return "Vehiculos{" + "idVehiculo=" + idVehiculo + ", placa=" + placa + ", matricula=" + matricula + ", color=" + color + ", anio=" + anio + ", idTvehiculo=" + '}';
    }

    
    
}
