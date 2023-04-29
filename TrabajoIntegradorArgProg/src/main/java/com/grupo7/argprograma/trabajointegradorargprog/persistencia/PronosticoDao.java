package com.grupo7.argprograma.trabajointegradorargprog.persistencia;

import com.grupo7.argprograma.trabajointegradorargprog.entidades.Pronostico;
import com.grupo7.argprograma.trabajointegradorargprog.utils.ResultadoEnum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class PronosticoDao {

    protected Connection coneccion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "mundial";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            coneccion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (coneccion != null) {
                coneccion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = coneccion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }

    /**
     * NO parece funcionar correctamente DEBUG
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public List<Pronostico> listarPronosticos() throws SQLException, Exception {
        List<Pronostico> pronosticos = new ArrayList<>();
        String sql = "SELECT * FROM pronosticos";
        consultarBase(sql);
        while (resultado.next()) {
            Pronostico pronostico = new Pronostico();
            //no se logra llamar a persona o partido
//            pronostico.setParticipante(new Persona("Mariana"));
//            pronostico.setEquipo(resultado.getObject(0, type));
            pronostico.setResultado(ResultadoEnum.valueOf(resultado.getString("resultado")));
        }
        return pronosticos;
    }
}
