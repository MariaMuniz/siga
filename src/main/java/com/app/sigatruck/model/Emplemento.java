package com.app.sigatruck.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
public class Emplemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Categoria;
    private String Marca;
    private String Modelo;
    private String Cor;
    private Integer Ano;
    private Integer Qtd_eixo;
    private String Capacidade;
    @OneToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    private String Foto_Crlv_Emplemento;

    public String getFoto_Crlv_Emplemento() {
        return Foto_Crlv_Emplemento;
    }

    public void setFoto_Crlv_Emplemento(String foto_Crlv_Emplemento) {
        Foto_Crlv_Emplemento = foto_Crlv_Emplemento;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(String capacidade) {
        Capacidade = capacidade;
    }


    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        Ano = ano;
    }

    public Integer getQtd_eixo() {
        return Qtd_eixo;
    }

    public void setQtd_eixo(Integer qtd_eixo) {
        Qtd_eixo = qtd_eixo;
    }
}
