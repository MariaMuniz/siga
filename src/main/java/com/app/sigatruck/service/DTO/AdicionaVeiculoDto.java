package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;

public class AdicionaVeiculoDto {
    private Long Id;
    @NotBlank
    private Integer ano;
    @NotBlank
    private String marca;
    @NotBlank
    private Long  motorista_Id;
    @NotBlank
    private String Tipo;
    @NotBlank
    private String Modelo;
    @NotBlank
    private String Cor;
    @NotBlank
    private String Placa;
    @NotBlank
    private int Qtd_eixo;
    @NotBlank
    private String Rastreador1;
    private String Rastreador2;
    @NotBlank
    private String Capacidade;
    @NotBlank
    private String Foto_Frente_Veiculo;
    @NotBlank
    private String Foto_Crlv_Veiculo;

    public String getTipo() {
        return Tipo;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public int getQtd_eixo() {
        return Qtd_eixo;
    }

    public String getRastreador1() {
        return Rastreador1;
    }

    public String getRastreador2() {
        return Rastreador2;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public String getFoto_Frente_Veiculo() {
        return Foto_Frente_Veiculo;
    }

    public String getFoto_Crlv_Veiculo() {
        return Foto_Crlv_Veiculo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public Long getMotorista_Id() {
        return motorista_Id;
    }
}
