package com.seunome.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
        System.out.println("\n=========================================================");
        System.out.println(" 🚀 Aplicação iniciada com sucesso!");
        System.out.println(" 👉 Acesse o seu portfólio em: http://localhost:8013");
        System.out.println("=========================================================\n");
    }
}
