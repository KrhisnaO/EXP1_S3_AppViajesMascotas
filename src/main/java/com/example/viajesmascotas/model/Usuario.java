package com.example.viajesmascotas.model;


// DEFINE MODELO DE "USUARIO"
public class Usuario {
    //ATRIBUTOS DEL USUARIO
    private String rut;
    private String nombre;
    private String email;
    private String rol; 

    //CONSTRUCTOR DE LA CLASE QUE INICIALIZA LOS ATRIBUTOS DE LA CLASE
    public Usuario(String rut, String nombre, String email, String rol) {
        this.rut = rut;      //ASIGNA EL ID AL USUARIO
        this.nombre = nombre; //ASIGNA EL NOMBRE AL USUARIO
        this.email = email;   //ASIGNA EMAIL
        this.rol = rol;      //ASIGNA ROL
    }

    //METODOS GETTER PARA ACCEDER A LOS VALORES DE LOS ATRIBUTOS DEL USUARIO
    public String getRut() {
        return rut;   //RETORNA EL RUT
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