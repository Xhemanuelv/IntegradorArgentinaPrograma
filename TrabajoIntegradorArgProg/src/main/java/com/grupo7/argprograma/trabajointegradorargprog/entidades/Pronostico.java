package com.grupo7.argprograma.trabajointegradorargprog.entidades;

import com.grupo7.argprograma.trabajointegradorargprog.utils.ResultadoEnum;

public class Pronostico {

    private Partido partido;

    private Equipo equipo;

    private ResultadoEnum resultado;

    /**
     * Devuelve 1 si el equipo introducido es el GANADOR o EMPATE y 0 si no lo
     * es
     *
     * @return
     */
    public int puntos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Pronostico() {
    }

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + ", equipo=" + equipo + ", resultado=" + resultado + '}';
    }

}
