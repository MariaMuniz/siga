package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class AdicionaMotoristaDto {

    private Long Id ;
    @NotBlank
    private String Nome ;
    @NotBlank
    private String Email;
    @NotBlank
    private String Senha;
    @NotBlank
    private Integer Cpf;
    @NotBlank
    private Integer Rg;
    @NotBlank
    private Integer Telefone;
    @NotBlank
    private String Estado_civil;
    @NotBlank
    private String Sexo;
    @NotBlank
    private String Disponibilidade;
    @NotBlank
    private String Preferencia_estado;
    @NotBlank
    private String Preferencia_cidade;
    @NotBlank
    private Date Data_nas;
    @NotBlank
    private String Foto_Cnh;
    @NotBlank
    private String Indicacao;
    @NotBlank
    private String Zap;

    public Long getId() {
        return Id;
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

    public Integer getCpf() {
        return Cpf;
    }

    public Integer getRg() {
        return Rg;
    }

    public Integer getTelefone() {
        return Telefone;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }

    public String getPreferencia_estado() {
        return Preferencia_estado;
    }

    public String getPreferencia_cidade() {
        return Preferencia_cidade;
    }

    public Date getData_nas() {
        return Data_nas;
    }

    public String getFoto_Cnh() {
        return Foto_Cnh;
    }

    public String getIndicacao() {
        return Indicacao;
    }

    public String getZap() {
        return Zap;
    }
}
