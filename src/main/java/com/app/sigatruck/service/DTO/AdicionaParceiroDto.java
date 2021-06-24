package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;

public class AdicionaParceiroDto {
    private Long Id;
    @NotBlank
    private Long  Endereco_Id;;
    @NotBlank
    private String Nome ;
    @NotBlank
    private String Email;
    @NotBlank
    private String Senha;
    @NotBlank
    private String Logo;
    @NotBlank
    private String Horario;
    @NotBlank
    private Integer Telefone;
    @NotBlank
    private String Promocao;
    @NotBlank
    private String Validade;

    public Long getEndereco_Id() {
        return Endereco_Id;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    public String getLogo() {
        return Logo;
    }

    public String getHorario() {
        return Horario;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public String getPromocao() {
        return Promocao;
    }

    public String getValidade() {
        return Validade;
    }
}
