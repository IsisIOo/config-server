package com.example.autofixconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class AutofixconfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutofixconfigApplication.class, args);
    }

}
