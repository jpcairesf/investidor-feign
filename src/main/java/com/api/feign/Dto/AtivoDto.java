package com.api.feign.Dto;

public class AtivoDto {

    private Long id;
    private String nome;

    public AtivoDto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public AtivoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}