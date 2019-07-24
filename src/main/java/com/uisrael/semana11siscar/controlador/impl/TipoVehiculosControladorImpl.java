/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador.impl;


import com.uisrael.semana11siscar.controlador.ITipoVehiculosControlador;
import com.uisrael.semana11siscar.modelo.dao.ITipoVehiculosDao;
import com.uisrael.semana11siscar.modelo.dao.impl.TipoVehiculosDaoImpl;
import com.uisrael.semana11siscar.modelo.entidades.TipoVehiculos;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class TipoVehiculosControladorImpl implements ITipoVehiculosControlador{

    @Override
    public void insertarTipoVehiculos(TipoVehiculos nuevoTipoV) {
        ITipoVehiculosDao tipoVehiculosDao = new TipoVehiculosDaoImpl(TipoVehiculos.class);
        tipoVehiculosDao.insertarTipoVehiculos(nuevoTipoV);
        
    }

    @Override
    public List<TipoVehiculos> listarTipoVehiculos() {
        ITipoVehiculosDao tipoVehiculosDao = new TipoVehiculosDaoImpl(TipoVehiculos.class);
        return tipoVehiculosDao.listarTipoVehiculos();
    }

    @Override
    public TipoVehiculos buscarTipoVehiculosId(int Id) {
        ITipoVehiculosDao tipoVehiculosDao = new TipoVehiculosDaoImpl(TipoVehiculos.class);
        return tipoVehiculosDao.buscarTipoVehiculosId(Id);
    }
    
}
