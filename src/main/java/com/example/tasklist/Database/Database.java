package com.example.tasklist.Database;

import java.sql.*;

public class Database {
    private static final String urlDatabase = "jdbc:postgresql://localhost:5432/Tasklist";
    private static final String nombreUsuario = "postgres";
    private static final String contrasenia = "8446";

    public Connection crearConeccion() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlDatabase, nombreUsuario, contrasenia);
            System.out.println("Conectado exitosamente");
        } catch (SQLException e) {
            System.out.println("Coneccion fracasada" + e.getMessage());
        }
        return connection;
    }

    public void cerrarConeccion(Connection connection) throws SQLException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Coneccion cerrada exitosamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la coneccion: " + e.getMessage());
        }
    }
    //consultas
    public void retornaNombresUsuarios(){
        Connection connection = crearConeccion();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TABLE (usuario)");
            while (resultSet.next()){
                System.out.println(resultSet.getString("nombreusuario"));
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
