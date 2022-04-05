package com.api.feign.Controller;

import com.api.feign.Client.VolumeAplicadoClient;
import com.api.feign.Dto.VolumeAplicadoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/volume-aplicado")
public class VolumeAplicadoController {

    private VolumeAplicadoClient volumeAplicadoClient;

    public VolumeAplicadoController(VolumeAplicadoClient volumeAplicadoClient) {
        this.volumeAplicadoClient = volumeAplicadoClient;
    }

    @GetMapping
    public List<VolumeAplicadoDto> gerarRelatorio() {
        return volumeAplicadoClient.gerarRelatorio();
    }

}