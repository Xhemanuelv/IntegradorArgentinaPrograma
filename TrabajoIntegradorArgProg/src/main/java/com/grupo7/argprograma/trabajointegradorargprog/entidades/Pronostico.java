package com.grupo7.argprograma.trabajointegradorargprog.entidades;

import com.grupo7.argprograma.trabajointegradorargprog.utils.ResultadoEnum;
import java.util.Objects;

public class Pronostico {

    private Persona participante;

    private Partido partido;

    private Equipo equipo;

    private ResultadoEnum resultado;

    /**
     * Devuelve 1 si el equipo introducido y el resultado coincide o 0 de no
     * coincidir
     *
     * @return
     */
    public int puntos() {
        if (this.resultado.equals(this.partido.resultado(equipo))) {
            return 1;
        } else {
            return 0;
        }

    }

    public Pronostico() {
    }

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Persona getParticipante() {
        return participante;
    }

    public void setParticipante(Persona participante) {
        this.participante = participante;
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
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.resultado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pronostico other = (Pronostico) obj;
        return this.resultado == other.resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + ", equipo=" + equipo + ", resultado=" + resultado + '}';
    }

}
