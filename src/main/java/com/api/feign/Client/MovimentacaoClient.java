package com.api.feign.Client;

import com.api.feign.Dto.MovimentacaoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "movimentacao", url = "https://investidor-api.herokuapp.com/movimentacao")
public interface MovimentacaoClient {

    @GetMapping
    List<MovimentacaoDto> getMovimentacao();

    @GetMapping(value = "/buscar")
    List<MovimentacaoDto> buscar(
            @RequestParam(value="investidor") String investidorCnpj,
            @RequestParam(value="ativo") String ativoNome,
            @RequestParam(value="tipo") String tipo,
            @RequestParam(value="data-inicio")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam(value="data-fim")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim);

}