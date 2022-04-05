package com.api.feign.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoExtratoDto {

    private String ativo;
    private String tipo;
    private BigDecimal quantidade;
    private LocalDate data;

}