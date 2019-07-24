/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao;


import com.uisrael.semana11siscar.modelo.entidades.OrdenTrabajo;
import java.util.List;



/**
 *
 * @author Stalin
 */
public interface IOrdenTrabajoDao {
    public void insertarOrdenTrabajo(OrdenTrabajo nuevaOrden);
    public List<OrdenTrabajo> listarOrdenTrabajo();
    public OrdenTrabajo buscarOrdenTrabajoId(int Id);
}
