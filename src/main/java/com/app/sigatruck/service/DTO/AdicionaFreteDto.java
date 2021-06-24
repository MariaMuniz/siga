package com.app.sigatruck.service.DTO;


import javax.validation.constraints.NotBlank;
import java.util.Date;

public class AdicionaFreteDto {
    @NotBlank
    private Long Id;
    @NotBlank
    private String codigo;
    @NotBlank
    private Long Transportadora_Id;
    @NotBlank
    private String Transportadora_telefone;
    @NotBlank
    private String Origem_estado;
    @NotBlank
    private String Origem_cidade;
    @NotBlank
    private String Destino_estado;
    @NotBlank
    private String Destino_cidade;
    @NotBlank
    private String Tipo_veiculo;
    @NotBlank
    private String Tipo_carreta;
    @NotBlank
    private String Qtd_eixos;
    @NotBlank
    private Integer Peso;
    @NotBlank
    private String Quantidade;
    @NotBlank
    private String Dimensao;
    @NotBlank
    private String Preco;
    @NotBlank
    private String Produto;
    @NotBlank
    private Date Validade;
    @NotBlank
    private String Observacao;
    @NotBlank
    private String Tipo_pagamento;
    @NotBlank
    private String Tipo_carga;

    public Long getId() {
        return Id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Long getTransportadora_Id() {
        return Transportadora_Id;
    }

    public String getTransportadora_telefone() {
        return Transportadora_telefone;
    }

    public String getOrigem_estado() {
        return Origem_estado;
    }

    public String getOrigem_cidade() {
        return Origem_cidade;
    }

    public String getDestino_estado() {
        return Destino_estado;
    }

    public String getDestino_cidade() {
        return Destino_cidade;
    }

    public String getTipo_veiculo() {
        return Tipo_veiculo;
    }

    public String getTipo_carreta() {
        return Tipo_carreta;
    }

    public String getQtd_eixos() {
        return Qtd_eixos;
    }

    public Integer getPeso() {
        return Peso;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public String getDimensao() {
        return Dimensao;
    }

    public String getPreco() {
        return Preco;
    }

    public String getProduto() {
        return Produto;
    }

    public Date getValidade() {
        return Validade;
    }

    public String getObservacao() {
        return Observacao;
    }

    public String getTipo_pagamento() {
        return Tipo_pagamento;
    }

    public String getTipo_carga() {
        return Tipo_carga;
    }
}
