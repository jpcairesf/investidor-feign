package com.api.feign.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoDto {

    private Long id;
    private Long ativoId;
    private Long investidorId;
    private String tipo;
    private LocalDate date;
    private BigDecimal quantidade;

}