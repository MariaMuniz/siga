package com.app.sigatruck.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Transportadora {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    @JoinColumn(name="Endereco_Id")
    private Endereco endereco;


    private String Nome;
    private Integer Cnpj;
    private String Email;
    private String Senha;
    private String Telefone;


    @ManyToMany
    @JoinTable(name="Traportadora_has_frete", joinColumns=
            {@JoinColumn(name="Transportadora_id")}, inverseJoinColumns=
            {@JoinColumn(name="Frete_id")})
    private List fretes;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List getFretes() {
        return fretes;
    }

    public void setFretes(List fretes) {
        this.fretes = fretes;
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

    public Integer getCnpj() {
        return Cnpj;
    }

    public void setCnpj(Integer cnpj) {
        Cnpj = cnpj;
    }

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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

}