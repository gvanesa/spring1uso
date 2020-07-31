package com.example.restservice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private EntregoPreciosController controller;

    @Test
    public void contexLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}
