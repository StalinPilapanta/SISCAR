/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.modelo.dao.impl;



import com.uisrael.semana11siscar.modelo.dao.IEmpleadosDao;
import com.uisrael.semana11siscar.modelo.entidades.Empleados;
import java.util.List;


/**
 *
 * @author Stalin
 */
public class EmpleadosDaoImpl extends GenericDaoImpl<Empleados> implements IEmpleadosDao{

        public EmpleadosDaoImpl(Class<Empleados> entityClass){
            super(entityClass);

        }
        
    @Override
    public void insertarEmpleados(Empleados nuevoEmpleado) {
        System.out.println("DAO: Insertó Empleado"+nuevoEmpleado);
        
  
        this.beginTransaction();
        this.create(nuevoEmpleado);
        this.commit();
        
    }

 
}
