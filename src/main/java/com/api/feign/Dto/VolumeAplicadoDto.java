package com.api.feign.Dto;

import java.math.BigDecimal;

public class VolumeAplicadoDto {

    private String nome;
    private String cnpj;
    private BigDecimal volume;

    public VolumeAplicadoDto(String nome, String cnpj, BigDecimal volume) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.volume = volume;
    }

    public VolumeAplicadoDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }
}