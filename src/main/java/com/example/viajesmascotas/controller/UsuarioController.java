package com.example.viajesmascotas.controller;

import com.example.viajesmascotas.model.Usuario;
import com.example.viajesmascotas.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")  //URL BASE PARA LAS SOLICITUDES QUE SE REALICEN
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

     //Obtiene todos los usuarios en Service
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }
    //Trae los usuarios por su RUT con sus datos correspondientes desde Service
    @GetMapping("/{rut}")
    public Usuario getUsuarioByRut(@PathVariable String rut) {
        return usuarioService.getUsuarioByRut(rut);
    }
}
