/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;

import com.sun.jndi.ldap.PersistentSearchControl;
import com.uisrael.semana11siscar.modelo.dao.ITipoVehiculosDao;
import com.uisrael.semana11siscar.modelo.entidades.TipoVehiculos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Stalin
 */
public class TipoVehiculosDaoImpl extends GenericDaoImpl<TipoVehiculos> implements ITipoVehiculosDao{

    
    public TipoVehiculosDaoImpl(Class<TipoVehiculos> entityClass){
        super(entityClass);
    }
    
    @Override
    public void insertarTipoVehiculos(TipoVehiculos nuevoTipoV) {
        System.out.println("DAO: Insertó Tipo de vehículo "+nuevoTipoV);
        
        this.beginTransaction();
        this.create(nuevoTipoV);
        this.commit();
    }

    @Override
    public List<TipoVehiculos> listarTipoVehiculos() {
        System.out.println("DAO: Listó Tipo de Vehículo");
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoVehiculos buscarTipoVehiculosId(int Id) {
        System.out.println("DAO: Buscar Tipo de Vehículo");
        return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}
