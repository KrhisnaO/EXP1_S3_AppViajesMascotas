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
        usuarios.add(new Usuario("18345678K", "Carlos Pérez", "carlos@example.com", "dueño de mascota"));
        usuarios.add(new Usuario("125678901", "Ana López", "ana@example.com", "conductor de transporte pet-friendly"));
        usuarios.add(new Usuario("152345679", "Pedro García", "pedro@example.com", "dueño de mascota"));
        usuarios.add(new Usuario("178901234", "María Torres", "maria@example.com", "conductor de transporte pet-friendly"));
    }
   //METODO PARA OBTENER TODOS LOS USUARIOS
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    //METODO PAR OBTENER USUARIOS POR SU RUT
    public Usuario getUsuarioByRut(String rut) {
        return usuarios.stream()
        .filter(usuario -> usuario.getRut().equals(rut)) //FILTRA EL USUARIO POR SU RUT
        .findFirst() //BUSCA EL PRIMER USUARIO QUE COINCIDA

        //SE CREA UN "USUARIO" EN CASO DE QUE NO ENCUENTRE UN RUT CORRECTO
        //DEVUELVE EL USUARIO POR DEFECTO
        .orElse(new Usuario ("000", "USUARIO NO ENCONTRADO","...", "INTENTA CON OTRO RUT"));
    }
}