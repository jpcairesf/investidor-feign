package com.api.feign.Controller;

import com.api.feign.Client.InvestidorClient;
import com.api.feign.Dto.InvestidorDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/investidor")
public class InvestidorController {

    private InvestidorClient investidorClient;

    public InvestidorController(InvestidorClient investidorClient) {
        this.investidorClient = investidorClient;
    }

    @GetMapping
    public List<InvestidorDto> getInvestidor() {
        return investidorClient.getInvestidor();
    }

    @GetMapping("/{id}")
    public InvestidorDto getInvestidorById(@PathVariable Long id) {
        return investidorClient.getInvestidorById(id);
    }

}