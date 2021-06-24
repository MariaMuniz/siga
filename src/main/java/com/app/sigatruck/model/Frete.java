package com.app.sigatruck.model;
import com.app.sigatruck.model.Transportadora;
import javax.persistence.*;
import java.util.Date;
@Entity
public class Frete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "transportadora_id")
    private Transportadora transportadora;
    private String Transportadora_telefone;
    private String Origem_estado;
    private String Origem_cidade;
    private String Destino_estado;
    private String Destino_cidade;
    private String Tipo_veiculo;
    private String Tipo_carreta;
    private String Qtd_eixos;
    private Integer Peso;
    private String Quantidade;
    private String Dimensao;
    private String Preco;
    private String Produto;
    private Date Validade;
    private String Observacao;
    private String Tipo_pagamento;
    private String Tipo_carga;

    public String getTipo_carga() {
        return Tipo_carga;
    }

    public void setTipo_carga(String tipo_carga) {
        Tipo_carga = tipo_carga;
    }

    public String getTransportadora_telefone() {
        return Transportadora_telefone;
    }

    public void setTransportadora_telefone(String transportadora_telefone) {
        Transportadora_telefone = transportadora_telefone;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }




    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigem_estado() {
        return Origem_estado;
    }

    public void setOrigem_estado(String origem_estado) {
        Origem_estado = origem_estado;
    }

    public String getOrigem_cidade() {
        return Origem_cidade;
    }

    public void setOrigem_cidade(String origem_cidade) {
        Origem_cidade = origem_cidade;
    }

    public String getDestino_estado() {
        return Destino_estado;
    }

    public void setDestino_estado(String destino_estado) {
        Destino_estado = destino_estado;
    }

    public String getDestino_cidade() {
        return Destino_cidade;
    }

    public void setDestino_cidade(String destino_cidade) {
        Destino_cidade = destino_cidade;
    }

    public String getTipo_pagamento() {
        return Tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        Tipo_pagamento = tipo_pagamento;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTipo_veiculo() {
        return Tipo_veiculo;
    }

    public void setTipo_veiculo(String tipo_veiculo) {
        Tipo_veiculo = tipo_veiculo;
    }

    public String getTipo_carreta() {
        return Tipo_carreta;
    }

    public void setTipo_carreta(String tipo_carreta) {
        Tipo_carreta = tipo_carreta;
    }

    public String getQtd_eixos() {
        return Qtd_eixos;
    }

    public void setQtd_eixos(String qtd_eixos) {
        Qtd_eixos = qtd_eixos;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer peso) {
        Peso = peso;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String quantidade) {
        Quantidade = quantidade;
    }

    public String getDimensao() {
        return Dimensao;
    }

    public void setDimensao(String dimensao) {
        Dimensao = dimensao;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String preco) {
        Preco = preco;
    }


    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date validade) {
        this.Validade = validade;
    }





}
