package com.grupo7.argprograma.trabajointegradorargprog.servicios.impl;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Equipo;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Partido;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Pronostico;
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

    private List<Ronda> rondas = new ArrayList();

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
                    rondas.add(ronda);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    @Override
    public List<Partido> leerPartidosRonda(String fileName) {
        String line = "";
        String cvsSplitBy = ",";
        List<Partido> partidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Skip the first line (headers)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                Equipo equipo1 = new Equipo(data[0]);
                Equipo equipo2 = new Equipo(data[1]);
                int golesEquipo1 = Integer.parseInt(data[2]);
                int golesEquipo2 = Integer.parseInt(data[3]);
                Partido partido = new Partido(equipo1, equipo2, golesEquipo1, golesEquipo2);
                partidos.add(partido);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }

        return partidos;
    }

    @Override
    public Pronostico leerPronostico(String filepath) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
