package com.server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.stream.Collectors;

@RestController
class RestaurantController {
    private RestaurantRepository repository;

    public RestaurantController(RestaurantRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/restaurant")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Restaurant> coolRestaurant() {
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Restaurant restaurant) {
        return !restaurant.getName().equals("Pizza Hut") &&
                !restaurant.getName().equals("FiveGuys") &&
                !restaurant.getName().equals("Subway") &&
                !restaurant.getName().equals("McDonalds");
    }
}