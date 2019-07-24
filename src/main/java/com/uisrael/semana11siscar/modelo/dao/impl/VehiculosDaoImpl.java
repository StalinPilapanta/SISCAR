/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;

import com.uisrael.semana11siscar.modelo.dao.IVehiculosDao;
import com.uisrael.semana11siscar.modelo.entidades.Vehiculos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Stalin
 */
public class VehiculosDaoImpl extends GenericDaoImpl<Vehiculos> implements IVehiculosDao {

    public VehiculosDaoImpl(Class<Vehiculos> entityclass) {
        super(entityclass);
    }

    @Override
    public void insertarVehiculos(Vehiculos nuevoVehiculo) {
        System.out.println("DAO: Insertó nuevo vehículo " + nuevoVehiculo);

        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("AsistCarPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();
         */
        this.beginTransaction();
        this.create(nuevoVehiculo);
        this.commit();
    }

    @Override
    public List<Vehiculos> listarVehiculos() {
        System.out.println("DAO: Listó Vehículos ");
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculos buscarVehiculosId(int Id) {
        System.out.println("DAO: Buscar Vehículo ");
        return null;//To change body of generated methods, choose Tools | Templates.
    }

}
