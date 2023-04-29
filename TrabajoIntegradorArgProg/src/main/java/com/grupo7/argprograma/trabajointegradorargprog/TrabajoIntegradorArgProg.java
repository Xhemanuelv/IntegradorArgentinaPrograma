package com.grupo7.argprograma.trabajointegradorargprog;

import com.grupo7.argprograma.trabajointegradorargprog.servicios.impl.Entrega1;
import com.grupo7.argprograma.trabajointegradorargprog.servicios.impl.Entrega3;

/**
 *
 * @author Emanuel Villarin
 */
public class TrabajoIntegradorArgProg {

    public static void main(String[] args) throws Exception {
        Entrega1 primerEntrega = new Entrega1();
        Entrega3 tercerEntrega = new Entrega3();
        System.out.println("Lectura de partidos desde archivo");
        primerEntrega.presentacion1();
        System.out.println("Lectura de pronostico desde BD");
        tercerEntrega.obtenerPronosticosDB();
    }
}
