package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Equipo;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Partido;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Ronda;
import com.grupo7.argprograma.trabajointegradorargprog.servicios.LeerArchivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class LeerArchivosImpl implements LeerArchivos {
    
    List<Ronda> rondas = new ArrayList();
    
    @Override
    public void leerRonda() {
        Ronda ronda = new Ronda();
        ronda.setNumeroRonda(1);
        ronda.setRonda("Octavos");
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        
        try {
            FileReader fileReader = new FileReader("rondaOctavos.csv");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                
                while ((line = bufferedReader.readLine()) != null) {
                    Partido partido = new Partido();
                    
                    String[] data = line.split(",");
                    equipo1.setNombre(data[0]);
                    partido.setEquipo1(equipo1);
                    partido.setGolesEquipo1(Integer.parseInt(data[1]));
                    equipo2.setNombre(data[3]);
                    partido.setEquipo2(equipo2);
                    partido.setGolesEquipo2(Integer.parseInt(data[2]));
                    ronda.agregarPartido(partido);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
    @Override
    public void leerPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
