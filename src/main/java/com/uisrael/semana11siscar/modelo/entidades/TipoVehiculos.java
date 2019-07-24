/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
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
@Table(name="TipoVehiculos")
public class TipoVehiculos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTvehiculo;
    private String detalle;
    
    @OneToMany(mappedBy = "fkIdTvehiculo")
    private List<Vehiculos> fkIdVehiculo = new ArrayList<>();

    public TipoVehiculos() {
    }

    public TipoVehiculos(int idTvehiculo, String detalle) {
        this.idTvehiculo = idTvehiculo;
        this.detalle = detalle;
    }

    public int getIdTvehiculo() {
        return idTvehiculo;
    }

    public void setIdTvehiculo(int idTvehiculo) {
        this.idTvehiculo = idTvehiculo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "TipoVehiculos{" + "idTvehiculo=" + idTvehiculo + ", detalle=" + detalle + '}';
    }
   
    
}
