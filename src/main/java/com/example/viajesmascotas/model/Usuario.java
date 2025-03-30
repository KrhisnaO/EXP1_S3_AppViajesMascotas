package com.example.viajesmascotas.model;


// DEFINE MODELO DE "USUARIO"
public class Usuario {
    //ATRIBUTOS DEL USUARIO
    private int id;
    private String nombre;
    private String email;
    private String rol; 

    //CONSTRUCTOR DE LA CLASE QUE INICIALIZA LOS ATRIBUTOS DE LA CLASE
    public Usuario(int id, String nombre, String email, String rol) {
        this.id = id;      //ASIGNA EL ID AL USUARIO
        this.nombre = nombre; //ASIGNA EL NOMBRE AL USUARIO
        this.email = email;
        this.rol = rol;
    }

    //METODOS GETTER PARA OBTENER LOS VALORES DE LOS ATRIBUTOS DEL USUARIO
    public int getId() {
        return id;   //RETURNA EL ID
    }

    public String getNombre() {
        return nombre;  //RETORNA EL NOMBRE
    }

    public String getEmail() {
        return email;    //RETORNA EL MAIL
    }

    public String getRol() {
        return rol;    //RETORNA EL ROL
    }
}