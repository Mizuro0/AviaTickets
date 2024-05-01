package org.mizuro.aviatickets;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AviaTicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviaTicketsApplication.class, args);
    }


}
