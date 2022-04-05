package com.api.feign.Client;

import com.api.feign.Dto.ExtratoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "extrato", url = "https://investidor-api.herokuapp.com/extrato")
public interface ExtratoClient {

    @GetMapping
    List<ExtratoDto> extrato(
            @RequestParam(value="investidor") String investidor,
            @RequestParam(value="ativo", required = false) String ativo,
            @RequestParam(value="tipo", required = false) String tipo,
            @RequestParam(value="data-inicio")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam(value="periodo", required = false, defaultValue = "30") Integer periodo);

}