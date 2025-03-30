package com.example.viajesmascotas.service;

import com.example.viajesmascotas.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private final List<Usuario> usuarios = new ArrayList<>();

    //CONSTRUCTOR PARA AGREGAR USUARIOS A LA LISTA
    public UsuarioService() {
        usuarios.add(new Usuario(1, "Carlos Pérez", "carlos@example.com", "dueño de mascota"));
        usuarios.add(new Usuario(2, "Ana López", "ana@example.com", "conductor de transporte pet-friendly"));
        usuarios.add(new Usuario(3, "Pedro García", "pedro@example.com", "dueño de mascota"));
        usuarios.add(new Usuario(4, "María Torres", "maria@example.com", "conductor de transporte pet-friendly"));
    }
   //METODO PARA OBTENER TODOS LOS USUARIOS
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    //METODO PAR OBTENER USUARIOS POR SU ID
    public Usuario getUsuarioById(int id) {
        return usuarios.stream()
        .filter(usuario -> usuario.getId() == id) //FILTRA EL USUARIO POR SU ID
        .findFirst() //BUSCA EL PRIMER USUARIO QUE COINCIDA

        //SE CREA UN "USUARIO" EN CASO DE QUE NO ENCUENTRE UNA ID CORRECTA
        //DEVUELVE EL USUARIO POR DEFECTO
        .orElse(new Usuario (0, "USUARIO NO ENCONTRADO","...", "INTENTA CON OTRO ID"));
    }
}