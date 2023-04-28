package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Partido;
import com.grupo7.argprograma.trabajointegradorargprog.servicios.LeerArchivos;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class Entrega1 {

    LeerArchivos readFile = new LeerArchivosImpl();

    private List<Partido> partidosRonda;

    public void presentacion1() {
        String rutaArchivo = "resultados.csv";
        partidosRonda = readFile.leerPartidosRonda(rutaArchivo);
        for (Partido partido : partidosRonda) {
            System.out.println(partido);
        }

    }

}
