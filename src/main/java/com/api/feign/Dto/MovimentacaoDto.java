package com.api.feign.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MovimentacaoDto {

    private Long id;
    private Long ativoId;
    private Long investidorId;
    private String tipo;
    private LocalDate date;
    private BigDecimal quantidade;

    public MovimentacaoDto(Long id, Long ativoId, Long investidorId, String tipo, LocalDate date, BigDecimal quantidade) {
        this.id = id;
        this.ativoId = ativoId;
        this.investidorId = investidorId;
        this.tipo = tipo;
        this.date = date;
        this.quantidade = quantidade;
    }

    public MovimentacaoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAtivoId() {
        return ativoId;
    }

    public void setAtivoId(Long ativoId) {
        this.ativoId = ativoId;
    }

    public Long getInvestidorId() {
        return investidorId;
    }

    public void setInvestidorId(Long investidorId) {
        this.investidorId = investidorId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}