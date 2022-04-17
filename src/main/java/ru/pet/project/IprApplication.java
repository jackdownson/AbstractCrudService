package ru.pet.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class IprApplication {

    public static void main(String[] args) {
        SpringApplication.run(IprApplication.class, args);
    }

}
