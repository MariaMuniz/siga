package com.app.sigatruck.model;

import javax.persistence.*;


@Entity
public class Endereco {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @OneToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;
    @OneToOne
    @JoinColumn(name ="parceiro_id")
    private Parceiro parceiro;
    @OneToOne
    @JoinColumn(name = "transportadora_id")
    private Transportadora transportadosra;
    private Integer cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;





    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
