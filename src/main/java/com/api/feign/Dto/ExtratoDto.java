package com.api.feign.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtratoDto {

    private String nome;
    private String cnpj;
    private List<MovimentacaoExtratoDto> movimentacoes;

}