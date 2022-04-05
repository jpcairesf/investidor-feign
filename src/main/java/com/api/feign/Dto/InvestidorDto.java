package com.api.feign.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestidorDto {

    private Long id;
    private String nome;
    private String cnpj;

}