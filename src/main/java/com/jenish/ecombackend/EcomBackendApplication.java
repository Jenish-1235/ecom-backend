package com.jenish.ecombackend;

import com.jenish.ecombackend.config.DotenvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomBackendApplication {

    public static void main(String[] args) {
        new DotenvConfig();
        SpringApplication.run(EcomBackendApplication.class, args);
    }

}
