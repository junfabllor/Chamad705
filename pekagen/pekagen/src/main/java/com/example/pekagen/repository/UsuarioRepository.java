package com.example.pekagen.repository;

import com.example.pekagen.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
// a Repository inteface e a camada de acesso a dados, que permite realizar operações de CRUD 
// (Create, Read, Update, Delete) 
// no banco de dados para a entidade Usuario. Ela estende JpaRepository, que fornece métodos prontos para essas operações

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findByEmail(String email);
}