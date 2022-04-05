package com.api.feign.Dto;

import java.util.List;

public class ExtratoDto {

    private String nome;
    private String cnpj;
    private List<MovimentacaoExtratoDto> movimentacoes;

    public ExtratoDto(String nome, String cnpj, List<MovimentacaoExtratoDto> movimentacoes) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.movimentacoes = movimentacoes;
    }

    public ExtratoDto() {
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

    public List<MovimentacaoExtratoDto> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoExtratoDto> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
}