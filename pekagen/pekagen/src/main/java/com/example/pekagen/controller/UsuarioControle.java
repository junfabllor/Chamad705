package com.example.pekagen.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pekagen.service.UsuarioService;
import com.example.pekagen.entity.Usuario;


@RestController
@RequestMapping ("/usuarios") 
public class UsuarioControle {
    private final UsuarioService usuarioService;
    public UsuarioControle(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    //endpoint para receber um novo usuário http post
    @PostMapping 
    public Usuario createUsuario(String username, String email){
        return usuarioService.createUsuario(username, email);
    }
}
