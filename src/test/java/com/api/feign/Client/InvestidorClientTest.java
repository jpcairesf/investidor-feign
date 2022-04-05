package com.api.feign.Client;

import com.api.feign.Dto.InvestidorDto;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.openfeign.support.SpringMvcContract;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvestidorClientTest {

    private static final String URL = "https://investidor-api.herokuapp.com/investidor";
    private static final String RESPONSE = "[{\n" +
            "    \"id\": 1,\n" +
            "    \"nome\": \"teste\",\n" +
            "    \"cnpj\": \"123456789\"\n" +
            "},\n" +
            "{\n" +
            "    \"id\": 2,\n" +
            "    \"nome\": \"teste2\",\n" +
            "    \"cnpj\": \"223456789\"\n" +
            "}]";

    private InvestidorClient investidorClient;

    @Test
    public void whenDoTest() {
        this.buildFeignClient(new MockClient().ok(
                HttpMethod.GET,
                URL,
                RESPONSE
        ));

        List<InvestidorDto> investidorDtoList = investidorClient.getInvestidor();

        assertThat(investidorDtoList.get(0).getId()).isEqualTo(1L);
        assertThat(investidorDtoList.get(0).getNome()).contains("teste");
        assertThat(investidorDtoList.get(0).getCnpj()).contains("123456789");
        assertThat(investidorDtoList.get(1).getId()).isEqualTo(2L);
        assertThat(investidorDtoList.get(1).getNome()).contains("teste2");
        assertThat(investidorDtoList.get(1).getCnpj()).contains("223456789");
    }

    private void buildFeignClient(MockClient mockClient) {
        investidorClient = Feign.builder()
                .client(mockClient)
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .contract(new SpringMvcContract())
                .target(InvestidorClient.class, URL);
    }

}
