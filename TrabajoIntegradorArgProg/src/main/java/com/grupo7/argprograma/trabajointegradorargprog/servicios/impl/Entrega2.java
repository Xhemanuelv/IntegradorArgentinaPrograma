package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.servicios.LeerArchivos;

/**
 *
 * @author Emanuel Villarin
 */
public class Entrega2 {

    private final LeerArchivos readFile = new LeerArchivosImpl();

    public void mostrarPronosticoDesdeArchivo() {
        readFile.leerPronostico("pronostico.csv");
    }

}
