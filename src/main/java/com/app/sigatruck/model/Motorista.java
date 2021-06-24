package com.app.sigatruck.model;

import com.app.sigatruck.model.Veiculo;
import com.app.sigatruck.model.Endereco;
import javax.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Motorista {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Endereco endereco;




    private String Nome ;
    private String Email;
    private String Senha;

    private Integer Cpf;
    private Integer Rg;
    private Integer Telefone;
    private String Estado_civil;
    private String Sexo;
    private String Disponibilidade;
    private String Preferencia_estado;
    private String Preferencia_cidade;
    private Date Data_nas;
    private String Foto_Cnh;
    private String Indicacao;
    private String Zap;

    public String getIndicacao() {
        return Indicacao;
    }

    public void setIndicacao(String indicacao) {
        Indicacao = indicacao;
    }

    public String getZap() {
        return Zap;
    }

    public void setZap(String zap) {
        Zap = zap;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    public String getFoto_Cnh() {
        return Foto_Cnh;
    }

    public void setFoto_Cnh(String foto_Cnh) {
        Foto_Cnh = foto_Cnh;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
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

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getCpf() {
        return Cpf;
    }

    public void setCpf(Integer cpf) {
        Cpf = cpf;
    }

    public Integer getRg() {
        return Rg;
    }

    public void setRg(Integer rg) {
        Rg = rg;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public void setTelefone(Integer telefone) {
        Telefone = telefone;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        Estado_civil = estado_civil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public String getPreferencia_estado() {
        return Preferencia_estado;
    }

    public void setPreferencia_estado(String preferencia_estado) {
        Preferencia_estado = preferencia_estado;
    }

    public String getPreferencia_cidade() {
        return Preferencia_cidade;
    }

    public void setPreferencia_cidade(String preferencia_cidade) {
        Preferencia_cidade = preferencia_cidade;
    }

    public Date getData_nas() {
        return Data_nas;
    }

    public void setData_nas(Date data_nas) {
        Data_nas = data_nas;
    }

    public void setMotorista(Motorista motorista) {
    }
}
