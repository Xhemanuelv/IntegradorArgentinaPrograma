package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Pronostico;
import com.grupo7.argprograma.trabajointegradorargprog.persistencia.PronosticoDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class Entrega3 {

    PronosticoDao proDao = new PronosticoDao();

    public List<Pronostico> obtenerPronosticosDB() throws Exception {
        List<Pronostico> pronosticos = new ArrayList();
        pronosticos = proDao.listarPronosticos();
        int puntos = 0;
        for (Pronostico pronostico : pronosticos) {
            if (pronostico.puntos() > 0) {
                puntos += pronostico.puntos();
            }
        }
        System.out.println("La persona obtuvo: " + puntos + " puntos");
        for (Pronostico pronostico : pronosticos) {
            System.out.println(pronostico);
        }
        return pronosticos;
    }

}
