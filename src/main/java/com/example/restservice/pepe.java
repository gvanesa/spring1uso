package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class pepe {

    public static void main(String[] args) {
        SpringApplication.run(pepe.class, args);
    }

  /*  @Bean
   public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect beans provided by Spring Boot:");

            String beanNames = ctx.getContextPath();
           // Arrays.sort(beanNames);
          //  for (String beanName : beanNames) {
                System.out.println(beanNames);
           // }
        };
    }*/


}
