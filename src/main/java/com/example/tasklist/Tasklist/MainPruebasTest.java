package com.example.tasklist.Tasklist;

import com.example.tasklist.Database.Database;

public class MainPruebasTest {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println("HOLA MUNDO");
        database.crearConeccion();
        //database.retornaNombresUsuarios();
    }
}
