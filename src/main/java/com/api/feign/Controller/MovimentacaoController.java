package com.api.feign.Controller;

import com.api.feign.Client.MovimentacaoClient;
import com.api.feign.Dto.MovimentacaoDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    private MovimentacaoClient movimentacaoClient;

    public MovimentacaoController(MovimentacaoClient movimentacaoClient) {
        this.movimentacaoClient = movimentacaoClient;
    }

    @GetMapping
    public List<MovimentacaoDto> getMovimentacao() {
        return movimentacaoClient.getMovimentacao();
    }

    @GetMapping(value = "/buscar")
    public List<MovimentacaoDto> buscar(
            @RequestParam(value="investidor") String investidorCnpj,
            @RequestParam(value="ativo") String ativoNome,
            @RequestParam(value="tipo") String tipo,
            @RequestParam(value="data-inicio")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam(value="data-fim")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim) {
        return movimentacaoClient.buscar(investidorCnpj, ativoNome, tipo, dataInicio, dataFim);
    }

}