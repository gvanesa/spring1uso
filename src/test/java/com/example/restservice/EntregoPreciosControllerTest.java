package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EntregoPreciosControllerTest{

    @Autowired
    private MockMvc mvc;


   @Test
    public void getListaDePrecios() throws Exception {
        mvc.perform(get("/precio").accept(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Lista de Precios!")));

    }

    @Test
    public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

        mvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Greetings from Spring Boot!")));
               // .andExpect(jsonPath("$.content").value("Hello, World!"));
    }

}