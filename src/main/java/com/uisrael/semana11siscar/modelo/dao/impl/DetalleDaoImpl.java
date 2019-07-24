/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;

import com.uisrael.semana11siscar.modelo.dao.IDetalleDao;
import com.uisrael.semana11siscar.modelo.entidades.Detalle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Stalin
 */
public class DetalleDaoImpl extends GenericDaoImpl<Detalle> implements IDetalleDao {

    public DetalleDaoImpl(Class<Detalle> entityClass) {
        super(entityClass);
    }

    @Override
    public void insertarDetalle(Detalle nuevoDetalle) {
        System.out.println("DAO: Insertó nuevo detalle" + nuevoDetalle);

        this.beginTransaction();
        this.create(nuevoDetalle);
        this.commit();
    }

    @Override
    public List<Detalle> listarDetalles() {
        System.out.println("DAO: Listar detalles ");
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle buscarDetalleId(int Id) {
        System.out.println("DAO: buscar Detalle ");
        return null;//To change body of generated methods, choose Tools | Templates.
    }

}
