package com.api.feign.Client;

import com.api.feign.Dto.VolumeAplicadoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "volume-aplicado", url = "https://investidor-api.herokuapp.com/volume-aplicado")
public interface VolumeAplicadoClient {

    @GetMapping
    List<VolumeAplicadoDto> gerarRelatorio();

}