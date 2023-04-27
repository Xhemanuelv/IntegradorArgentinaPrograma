package com.grupo7.argprograma.trabajointegradorargprog.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class Participantes {

    private List<Persona> personas;

    public Participantes() {
        this.personas = new ArrayList();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    /**
     * Guarda una lista de personas participando de los pronosticos
     *
     * @param personas
     */
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    /**
     * Agrega una persona a la participacion de los pronosticos
     *
     * @param persona
     */
    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    /**
     * Muestra el ranking actual de las personas
     */
    public void mostrarRanking() {
        System.out.println("Ranking de puntajes:");
        int i = 1;
        for (Persona persona : personas) {
            System.out.println(i + " " + persona);
            i++;
        }
    }

    @Override
    public String toString() {
        return "Participantes{" + "personas=" + personas + '}';
    }

}
