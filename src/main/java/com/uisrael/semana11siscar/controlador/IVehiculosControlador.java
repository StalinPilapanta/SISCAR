/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador;


import com.uisrael.semana11siscar.modelo.entidades.Vehiculos;
import java.util.List;

/**
 *
Stalin */
public interface IVehiculosControlador {
    public void insertarVehiculos(Vehiculos nuevoVehiculo);
    public List<Vehiculos> listarVehiculos();
    public Vehiculos buscarVehiculosId(int Id);
    
}
