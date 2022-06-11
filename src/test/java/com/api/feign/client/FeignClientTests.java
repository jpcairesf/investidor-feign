package com.api.feign.client;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class FeignClientTests extends ClientTestConfiguration {

    @ParameterizedTest(name = "[{index}] {5}")
    @MethodSource("provideArguments")
    public void whenGetAtivos_thenShouldReturnAtivos(String url) throws Exception {

        mockMvc.perform(
                        get(url)
                                .headers(this.headers))
                .andExpect(status().isOk());
//                .andExpect(content().string("[ ]"));
    }

    private Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("https://investidor-api.herokuapp.com/ativo"),
                Arguments.of("https://investidor-api.herokuapp.com/investidor"),
//                Arguments.of("https://investidor-api.herokuapp.com/extrato?investidor=nome&data-inicio=2020-01-01"),
                Arguments.of("https://investidor-api.herokuapp.com/movimentacao"),
                Arguments.of("https://investidor-api.herokuapp.com/volume-aplicado")
        );
    }

}
