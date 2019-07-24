/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador;


import com.uisrael.semana11siscar.modelo.entidades.Detalle;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IDetalleControlador {
    public void insertarDetalle(Detalle nuevoDetalle);
    public List<Detalle>listarDetalles();
    public Detalle buscarDetalleId(int Id);
    
}
