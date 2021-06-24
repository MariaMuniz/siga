package com.app.sigatruck.model;

import javax.persistence.*;

@Entity
public class Parceiro {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    private Endereco endereco;
    private String Nome ;
    private String Email;
    private String Senha;
    private String Logo;
    private String Horario;
    private Integer Telefone;
    private String Promocao;
    private String Validade;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public void setTelefone(Integer telefone) {
        Telefone = telefone;
    }

    public String getPromocao() {
        return Promocao;
    }

    public void setPromocao(String promocao) {
        Promocao = promocao;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String validade) {
        Validade = validade;
    }
}
