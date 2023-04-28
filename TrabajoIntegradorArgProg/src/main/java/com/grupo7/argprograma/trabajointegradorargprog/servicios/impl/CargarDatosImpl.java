package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Equipo;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Persona;
import com.grupo7.argprograma.trabajointegradorargprog.servicios.CargarDatos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emanuel Villarin
 */
public class CargarDatosImpl implements CargarDatos {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Equipo> equipos = new ArrayList();

    @Override
    public void agregarEquipo() {
        Equipo equipo = new Equipo();
       // equipo.setId(equipos.size() + 1);
        System.out.println("Ingrese el nombre del equipo");
        equipo.setNombre(leer.nextLine());
        equipo.setDescripcion("");
        if (equipos.contains(equipo)) {
            System.out.println("El equipo ya esta registrado");
        } else {
            equipos.add(equipo);
        }
    }

    @Override
    public void agregarParticipantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarPronostico(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarRonda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
