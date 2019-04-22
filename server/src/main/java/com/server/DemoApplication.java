package com.server;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner init(RestaurantRepository repository) {
        return args -> {
            Stream.of("Panera", "Shake Shack", "Wing Stop", "Burger King", "Taco bell",
                      "Pizza Hut", "FiveGuys", "Subway", "McDonalds").forEach(name -> {
                Restaurant restaurant = new Restaurant();
                restaurant.setName(name);
                repository.save(restaurant);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}