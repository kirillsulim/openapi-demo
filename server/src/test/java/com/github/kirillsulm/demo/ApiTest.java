package com.github.kirillsulm.demo;

import com.github.kirillsulim.demo.model.AddRequest;
import com.github.kirillsulim.demo.model.AddResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldAddNumbers() throws Exception {
        assertThat(this.restTemplate.postForObject(
                "http://localhost:" + port + "/add",
                new AddRequest(1L, 2L),
                AddResponse.class)
        ).isEqualTo(new AddResponse(3L));
    }
}