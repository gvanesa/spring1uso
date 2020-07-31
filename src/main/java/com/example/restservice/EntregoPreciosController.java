package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EntregoPreciosController {
    private final Integer Id = null;


    //@RequestMapping("/")
    @GetMapping("/precio")
    String home() {
        return "Lista de Precios!"+'\n' + (new Precio(1,String.format("papa"))).toPrintResumido();
    }
    @GetMapping("/prod")
    String cantidades() {
        return "Lista de Productos!"+'\n' + (new Precio(1,String.format("papa"))).toPrintResumido();
    }
    @RequestMapping("/")
    public @ResponseBody
    String index() {
        return "Greetings from Spring Boot!";
    }



}
