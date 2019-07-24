/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador.impl;


import com.uisrael.semana11siscar.controlador.IOrdenTrabajoControlador;
import com.uisrael.semana11siscar.modelo.dao.IOrdenTrabajoDao;
import com.uisrael.semana11siscar.modelo.dao.impl.OrdenTrabajoDaoImpl;
import com.uisrael.semana11siscar.modelo.entidades.OrdenTrabajo;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class OrdenTrabajoControladorImpl implements IOrdenTrabajoControlador{

    @Override
    public void insertarOrdenTrabajo(OrdenTrabajo nuevaOrden) {
        IOrdenTrabajoDao ordenTrabajoDao = new OrdenTrabajoDaoImpl(OrdenTrabajo.class);
        ordenTrabajoDao.insertarOrdenTrabajo(nuevaOrden);
    }
        
    

    @Override
    public List<OrdenTrabajo> listarOrdenTrabajo() {
        IOrdenTrabajoDao ordenTrabajoDao = new OrdenTrabajoDaoImpl(OrdenTrabajo.class);
        return ordenTrabajoDao.listarOrdenTrabajo();

    }    

    @Override
    public OrdenTrabajo buscarOrdenTrabajoId(int Id) {
        IOrdenTrabajoDao ordenTrabajoDao = new OrdenTrabajoDaoImpl(OrdenTrabajo.class);
        return ordenTrabajoDao.buscarOrdenTrabajoId(Id);
        
    }
    
}
