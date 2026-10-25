package com.example.pekagen.service;

import org.springframework.stereotype.Service;
import com.example.pekagen.repository.UsuarioRepository;
import com.example.pekagen.entity.Usuario;

@Service 
public class UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario createUsuario(String username, String email){
        Usuario usuario = new Usuario(username, email);
        return usuarioRepository.save(usuario);

    }

}
