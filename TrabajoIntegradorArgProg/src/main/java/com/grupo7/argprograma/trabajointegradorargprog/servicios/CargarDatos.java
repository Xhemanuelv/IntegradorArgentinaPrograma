package com.grupo7.argprograma.trabajointegradorargprog.servicios;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Persona;

/**
 *
 * @author Emanuel Villarin
 */
public interface CargarDatos {

    public void agregarEquipo();

    public void agregarParticipantes();

    public void agregarPartido();

    public void agregarPersona();

    public void agregarPronostico(Persona persona);

    public void agregarRonda();

}
