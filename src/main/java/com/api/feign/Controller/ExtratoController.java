package com.api.feign.Controller;

import com.api.feign.Client.ExtratoClient;
import com.api.feign.Dto.ExtratoDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/extrato")
public class ExtratoController {

    private ExtratoClient extratoClient;

    public ExtratoController(ExtratoClient extratoClient) {
        this.extratoClient = extratoClient;
    }

    @GetMapping
    public List<ExtratoDto> extrato(
            @RequestParam(value="investidor") String investidor,
            @RequestParam(value="ativo", required = false) String ativo,
            @RequestParam(value="tipo", required = false) String tipo,
            @RequestParam(value="data-inicio")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam(value="periodo", required = false, defaultValue = "30") Integer periodo) {
        return extratoClient.extrato(investidor, ativo, tipo, dataInicio, periodo);
    }

}