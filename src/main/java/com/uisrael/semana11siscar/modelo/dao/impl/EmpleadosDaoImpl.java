/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;

import com.uisrael.semana11siscar.modelo.dao.IEmpleadosDao;
import com.uisrael.semana11siscar.modelo.entidades.Empleados;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Stalin
 */
public class EmpleadosDaoImpl extends GenericDaoImpl<Empleados> implements IEmpleadosDao {

    public EmpleadosDaoImpl(Class<Empleados> entityClass) {
        super(entityClass);

    }

    @Override
    public void insertarEmpleados(Empleados nuevoEmpleado) {
        System.out.println("DAO: Insertó Empleado" + nuevoEmpleado);

        this.beginTransaction();
        this.create(nuevoEmpleado);
        this.commit();

    }

    @Override
    public List<Empleados> listarPersonas() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Empleados> p = cb.createQuery(Empleados.class);
        Root<Empleados> empleadoList = p.from(Empleados.class);
        p.select(empleadoList);
       // p.where(cb.equal(empleadoList.get("idEmpleado"), 1));
        return this.entityManager.createQuery(p).getResultList();
    }

}
