/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;


import com.uisrael.semana11siscar.modelo.dao.IOrdenTrabajoDao;
import com.uisrael.semana11siscar.modelo.entidades.OrdenTrabajo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Stalin
 */
public class OrdenTrabajoDaoImpl extends GenericDaoImpl<OrdenTrabajo> implements IOrdenTrabajoDao {

    
    public OrdenTrabajoDaoImpl(Class<OrdenTrabajo> entityclClass){
        super(entityclClass);
    }
    
    @Override
    public void insertarOrdenTrabajo(OrdenTrabajo nuevaOrden) {
        System.out.println("DAO: Insertó nueva orden " + nuevaOrden); 

        this.beginTransaction();
        this.create(nuevaOrden);
        this.commit();
    }

    @Override
    public List<OrdenTrabajo> listarOrdenTrabajo() {
        System.out.println("DAO: Listar Ordenes de Trabajo "); 
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrdenTrabajo buscarOrdenTrabajoId(int Id) {
        System.out.println("DAO: Buscar Orden de Trabajo"); 
        return null;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
