package com.example.tasklist.Tasklist;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String correo;
    private String contra;

    //Constructores
    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contra) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
    }

    //Modificadores de acceso(getters y setters)

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
