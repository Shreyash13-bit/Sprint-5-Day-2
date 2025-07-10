package com.example.test.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloIntegrationTest {

    @LocalServerPort
    private int port;

    private final RestTemplate restTemplate = new RestTemplateBuilder().build();

    @Test
    public void integrationTestHello() {
        String baseUrl = "http://localhost:" + port + "/api/hello";
        String response = restTemplate.getForObject(baseUrl, String.class);
        assertEquals("Hello, World!", response);
    }
}