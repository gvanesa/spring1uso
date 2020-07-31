package com.example.restservice;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest{

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() {
        assertThat(this.template.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Greetings from Spring Boot!");
    }

    @Test
    public void getHello2() {
        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
        assertThat(response.getBody()).isEqualTo("ksjklajs");
    }

    @Test
    public void getHello3() {
        assertThat(this.template.getForObject("http://localhost:8080/",String.class)).contains("hello");
    }


}
