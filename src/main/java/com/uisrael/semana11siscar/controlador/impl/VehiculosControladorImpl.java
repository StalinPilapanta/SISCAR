/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador.impl;


import com.uisrael.semana11siscar.controlador.IVehiculosControlador;
import com.uisrael.semana11siscar.modelo.dao.IVehiculosDao;
import com.uisrael.semana11siscar.modelo.dao.impl.VehiculosDaoImpl;
import com.uisrael.semana11siscar.modelo.entidades.Vehiculos;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class VehiculosControladorImpl implements IVehiculosControlador{

    @Override
    public void insertarVehiculos(Vehiculos nuevoVehiculo) {
        IVehiculosDao vehiculosDao = new VehiculosDaoImpl(Vehiculos.class);
        vehiculosDao.insertarVehiculos(nuevoVehiculo);
        
    }

    @Override
    public List<Vehiculos> listarVehiculos() {
        IVehiculosDao vehiculosDao = new VehiculosDaoImpl(Vehiculos.class);
        return vehiculosDao.listarVehiculos();
        
    }

    @Override
    public Vehiculos buscarVehiculosId(int Id) {
        IVehiculosDao vehiculosDao = new VehiculosDaoImpl(Vehiculos.class);
        return vehiculosDao.buscarVehiculosId(Id);
    }
    
}
