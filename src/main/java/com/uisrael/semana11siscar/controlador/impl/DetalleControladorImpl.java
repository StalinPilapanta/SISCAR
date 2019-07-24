/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador.impl;


import com.uisrael.semana11siscar.controlador.IDetalleControlador;
import com.uisrael.semana11siscar.modelo.dao.IDetalleDao;
import com.uisrael.semana11siscar.modelo.dao.impl.DetalleDaoImpl;
import com.uisrael.semana11siscar.modelo.entidades.Detalle;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class DetalleControladorImpl implements IDetalleControlador {

    @Override
    public void insertarDetalle(Detalle nuevoDetalle) {
         IDetalleDao detalleDao = new DetalleDaoImpl(Detalle.class);
         detalleDao.insertarDetalle(nuevoDetalle);
    }

    @Override
    public List<Detalle> listarDetalles() {
         IDetalleDao detalleDao = new DetalleDaoImpl(Detalle.class);
         return detalleDao.listarDetalles();
    }

    @Override
    public Detalle buscarDetalleId(int Id) {
         IDetalleDao detalleDao = new DetalleDaoImpl(Detalle.class);
         return detalleDao.buscarDetalleId(Id);
    }
    
}
