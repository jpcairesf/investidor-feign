package com.api.feign.Client;

import com.api.feign.Dto.InvestidorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "investidor", url = "https://investidor-api.herokuapp.com/investidor")
public interface InvestidorClient {

    @GetMapping
    List<InvestidorDto> getInvestidor();

    @GetMapping(value = "/{id}")
    InvestidorDto getInvestidorById(@PathVariable(value = "id") Long id);

}