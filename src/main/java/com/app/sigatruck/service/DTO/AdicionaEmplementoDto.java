package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;

public class AdicionaEmplementoDto {

    private Long Id;
    @NotBlank
    private String Categoria;
    @NotBlank
    private String Marca;
    @NotBlank
    private String Modelo;
    @NotBlank
    private String Cor;
    @NotBlank
    private Integer Ano;
    @NotBlank
    private Integer Qtd_eixo;
    @NotBlank
    private String Capacidade;
    @NotBlank
    private Long  Veiculo_Id;
    @NotBlank
    private String Foto_Crlv_Emplemento;



    public String getFoto_Crlv_Emplemento() {
        return Foto_Crlv_Emplemento;
    }

    public Long getVeiculo_Id() {
        return Veiculo_Id;
    }

    public Long getId() {
        return Id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public Integer getAno() {
        return Ano;
    }

    public Integer getQtd_eixo() {
        return Qtd_eixo;
    }

    public String getCapacidade() {
        return Capacidade;
    }
}
