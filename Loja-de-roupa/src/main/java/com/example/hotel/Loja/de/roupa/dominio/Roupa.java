package com.example.hotel.Loja.de.roupa.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "roupa")
public class Roupa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tipo;

    private String marca;

    private String tamanho;

    private String descricao;

    private Integer quantidade;

    private Integer preco;

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Roupa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


}
