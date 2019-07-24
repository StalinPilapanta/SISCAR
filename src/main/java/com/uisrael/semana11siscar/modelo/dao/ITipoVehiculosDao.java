/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao;


import com.uisrael.semana11siscar.modelo.entidades.TipoVehiculos;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface ITipoVehiculosDao {
    public void insertarTipoVehiculos(TipoVehiculos nuevoTipoV);
    public List<TipoVehiculos> listarTipoVehiculos();
    public TipoVehiculos buscarTipoVehiculosId(int Id);
    
    
}
