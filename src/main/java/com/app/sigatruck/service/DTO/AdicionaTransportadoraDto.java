package com.app.sigatruck.service.DTO;



import javax.validation.constraints.NotBlank;
public class AdicionaTransportadoraDto {

    @NotBlank
    private Long Id;
    @NotBlank
    private Long  Endereco_Id;;
    @NotBlank
    private String Nome;
    @NotBlank
    private Integer Cnpj;
    @NotBlank
    private String Email;
    @NotBlank
    private String Senha;
    @NotBlank
    private String Telefone;

    public Long getId() {
        return Id;
    }

    public Long getEndereco_Id() {
        return Endereco_Id;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getCnpj() {
        return Cnpj;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    public String getTelefone() {
        return Telefone;
    }
}
