package com.grupo7.argprograma.trabajointegradorargprog.entidades;

import java.util.ArrayList;
import java.util.List;

public class Ronda {

    private int id;//1,2,3,4

    private String ronda;//Octavos,cuartos, semi y final

    private List<Partido> partidos;

    public Ronda() {
    }

    public Ronda(int numeroRonda, String ronda) {
        this.id = numeroRonda;
        this.ronda = ronda;
        this.partidos = new ArrayList();
    }

    public int getNumeroRonda() {
        return id;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.id = numeroRonda;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public void agregarPartido(Partido partido) {
        this.partidos.add(partido);

    }

    /**
     * Aun no se que deberia llevar esto
     *
     * @return
     */
    public int puntos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
