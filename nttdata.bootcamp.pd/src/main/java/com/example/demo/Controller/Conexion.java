package com.example.demo.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Taller Patrones de Diseño
 *
 * Inicio del patrón de diseño Singleton,
 * Realización de la conexión con la BBDD
 *
 * @author Lorena
 */
public class Conexion {
    private static Connection connect = null;

    //Añadimos un campo estático privado para almacenar la instancia Singleton
    private static Conexion INSTANCE = null;

    //Declaramos el constructor de clase como privado
    private Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost:50000/carta"
                            + "user=cook&password=1234");
            //Mensaje de conexion realizada
            System.out.println("La Conexion ha sido realizada");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //Declaramos un método estático público, para obtener la instancia Singleton
    public static Connection getConexion(){
        if (connect == null){
            INSTANCE = new Conexion();
        }
        return connect;
    }
    /**
     * fin Patrón Singleton
     */
}
