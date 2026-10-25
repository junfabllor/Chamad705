package com.example.pekagen.entity;

import org.springframework.stereotype.Indexed;

// org.springframework.stereotype.Indexed é uma anotação usada para marcar uma classe como indexada, o que significa que ela 
// pode ser usada em consultas de pesquisa e indexação. No contexto do Spring Data JPA, essa anotação é usada para indicar 
// que a entidade Usuario pode ser indexada e pesquisada no banco de dados. Isso permite que você execute consultas eficientes

import jakarta.annotation.Generated;

// a bliblioteca jakarta.persistence é uma especificação da API de persistência de dados em Java, que fornece anotações e classes para 
// mapear objetos Java para tabelas de banco de dados relacionais. Ela é usada em conjunto com frameworks de persistência,
// como o Hibernate, para facilitar o mapeamento objeto-relacional (ORM) e a manipulação de dados em bancos de dados relacionais.

import jakarta.persistence.*;

//**********************************************************************//

// A anotação @Entity indica que a classe Usuario é uma entidade JPA, ou seja, ela representa uma tabela no banco de dados.
@Entity
@Table(name = "usuarios") //table nome da tebela do banco de dados
public class Usuario {
    // montei a class Usuario com os atributos id, username e email, que representam as colunas da tabela usuarios no banco de dados. 
    @Id // a anotação @Id indica que o atributo id é a chave primária da entidade Usuario.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    // Define the username field
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;

    
    protected Usuario() {
    }
    public Usuario(String username, String email){
        this.username = username;
        this.email = email;
        this.senha = senha;
    }

    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    
}