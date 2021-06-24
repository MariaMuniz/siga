package com.app.sigatruck.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne
    @JoinColumn(name = "emplemento_Id")
    private Emplemento emplemento;

    @ManyToOne
    @JoinColumn(name="motorista_Id")
    private Motorista motorista;




    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    private String Tipo;
    @NotBlank
    private String Marca;
    @NotBlank
    private String Modelo;
    private int Ano;
    @NotBlank
    private String Cor;
    @NotBlank
    private String Placa;
    private int Qtd_eixo;
    private String Rastreador1;
    private String Rastreador2;
    private String Capacidade;
    private String Foto_Frente_Veiculo;
    private String Foto_Crlv_Veiculo;

    public Emplemento getEmplemento() {
        return emplemento;
    }

    public void setEmplemento(Emplemento emplemento) {
        this.emplemento = emplemento;
    }


    public String getFoto_Frente_Veiculo() {
        return Foto_Frente_Veiculo;
    }

    public void setFoto_Frente_Veiculo(String foto_Frente_Veiculo) {
        Foto_Frente_Veiculo = foto_Frente_Veiculo;
    }

    public String getFoto_Crlv_Veiculo() {
        return Foto_Crlv_Veiculo;
    }

    public void setFoto_Crlv_Veiculo(String foto_Crlv_Veiculo) {
        Foto_Crlv_Veiculo = foto_Crlv_Veiculo;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
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

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public int getQtd_eixo() {
        return Qtd_eixo;
    }

    public void setQtd_eixo(int qtd_eixo) {
        Qtd_eixo = qtd_eixo;
    }

    public String getRastreador1() {
        return Rastreador1;
    }

    public void setRastreador1(String rastreador1) {
        Rastreador1 = rastreador1;
    }

    public String getRastreador2() {
        return Rastreador2;
    }

    public void setRastreador2(String rastreador2) {
        Rastreador2 = rastreador2;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(String capacidade) {
        Capacidade = capacidade;
    }






}
