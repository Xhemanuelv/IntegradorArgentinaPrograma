package com.grupo7.argprograma.trabajointegradorargprog.entidades;

import java.util.ArrayList;
import java.util.List;

public class Ronda {

    private int numeroRonda;//1,2,3,4

    private String ronda;//Octavos,cuartos, semi y final

    private List<Partido> partidos;

    public Ronda() {
    }

    public Ronda(int numeroRonda, String ronda) {
        this.numeroRonda = numeroRonda;
        this.ronda = ronda;
        this.partidos = new ArrayList();
    }
    
    

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
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

    public void agregarPartido(Partido partido){
        
    }
    
    
    public int puntos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
