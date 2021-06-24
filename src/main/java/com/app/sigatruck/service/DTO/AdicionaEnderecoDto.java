package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;

public class AdicionaEnderecoDto {
    private Long Id;
    @NotBlank
    private Integer cep;
    @NotBlank
    private String estado;
    @NotBlank
    private String cidade;
    @NotBlank
    private String bairro;
    @NotBlank
    private String rua;
    @NotBlank
    private Integer numero;

    @NotBlank
    private Long  motorista_Id;

    public Long getMotorista_Id() {
        return motorista_Id;
    }

    public Integer getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }
}
