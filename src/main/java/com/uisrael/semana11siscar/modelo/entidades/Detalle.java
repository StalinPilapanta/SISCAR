/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table(name="detalle")
public class Detalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDetalle;
    private long kilometraje;
    private int estado;//1 bueno 0 malo
    private String trabajosRealizado;
    private String telefonoContacto;
    private String observaciones;
    
    @ManyToOne
    @JoinColumn(name = "fkIdDetalle")
    private OrdenTrabajo fkIdOrdenTrabajo;

    public Detalle() {
    }

    public Detalle(int idDetalle, long kilometraje, int estado, String trabajosRealizado, String telefonoContacto, String observaciones, int idOtrabajo) {
        this.idDetalle = idDetalle;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.trabajosRealizado = trabajosRealizado;
        this.telefonoContacto = telefonoContacto;
        this.observaciones = observaciones;
        
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
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

    
    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", kilometraje=" + kilometraje + ", estado=" + estado + ", trabajosRealizado=" + trabajosRealizado + ", telefonoContacto=" + telefonoContacto + ", observaciones=" + observaciones + ", idOtrabajo=" + '}';
    }

    
}
