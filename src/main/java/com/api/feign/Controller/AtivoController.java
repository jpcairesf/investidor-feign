package com.api.feign.Controller;

import com.api.feign.Client.AtivoClient;
import com.api.feign.Dto.AtivoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ativo")
public class AtivoController {

    private AtivoClient ativoClient;

    @Autowired
    public AtivoController(AtivoClient ativoClient) {
        this.ativoClient = ativoClient;
    }

    @GetMapping
    public List<AtivoDto> getAtivo() {
        return ativoClient.getAtivo();
    }

    @GetMapping("/{id}")
    public AtivoDto getAtivoById(@PathVariable Long id) {
        return getAtivoById(id);
    }

}