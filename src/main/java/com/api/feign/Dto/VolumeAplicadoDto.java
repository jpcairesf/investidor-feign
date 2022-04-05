package com.api.feign.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VolumeAplicadoDto {

    private String nome;
    private String cnpj;
    private BigDecimal volume;

}