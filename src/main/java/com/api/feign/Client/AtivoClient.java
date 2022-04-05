package com.api.feign.Client;

import com.api.feign.Dto.AtivoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ativo", url = "https://investidor-api.herokuapp.com/ativo")
public interface AtivoClient {

    @GetMapping
    List<AtivoDto> getAtivo();

    @GetMapping(value = "/{id}")
    AtivoDto getAtivoById(@RequestParam(value = "id") Long id);
}