package com.api.feign.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MovimentacaoExtratoDto {

    private String ativo;
    private String tipo;
    private BigDecimal quantidade;
    private LocalDate data;

    public MovimentacaoExtratoDto(String ativo, String tipo, BigDecimal quantidade, LocalDate data) {
        this.ativo = ativo;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    public MovimentacaoExtratoDto() {
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}