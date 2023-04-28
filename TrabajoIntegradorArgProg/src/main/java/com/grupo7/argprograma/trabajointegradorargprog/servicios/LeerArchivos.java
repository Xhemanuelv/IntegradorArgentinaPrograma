package com.grupo7.argprograma.trabajointegradorargprog.servicios;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Partido;
import com.grupo7.argprograma.trabajointegradorargprog.entidades.Pronostico;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public interface LeerArchivos {

    /**
     * Lee una lista de rondas, implementacion incompleta, no retorna la lista
     */
    public void leerRonda();

    /**
     * Lee una lista de partidos de una ronda recibe la ruta del archivo, para
     * la implementacion actual solo se utiliza el nombre del archivo en el
     * directorio raiz del proyecto
     *
     *
     * @param filepath
     * @return
     */
    public List<Partido> leerPartidosRonda(String filepath);

    /**
     * Lee pronosticos y retorna los puntos acertados por una persona
     *
     *
     * @param filepath
     * @return
     */
    public Pronostico leerPronostico(String filepath);
    
    

}
