/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana11siscar.controlador.impl;


import com.uisrael.semana11siscar.controlador.IEmpleadosControlador;
import com.uisrael.semana11siscar.modelo.dao.IEmpleadosDao;
import com.uisrael.semana11siscar.modelo.dao.impl.EmpleadosDaoImpl;
import com.uisrael.semana11siscar.modelo.entidades.Empleados;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class EmpleadosControladorImpl implements IEmpleadosControlador{

    @Override
    public void insertarEmpleados(Empleados nuevoEmpleado) {
        
        IEmpleadosDao empleadosDao = new EmpleadosDaoImpl(Empleados.class);
        empleadosDao.insertarEmpleados(nuevoEmpleado);
         
    } 
}
