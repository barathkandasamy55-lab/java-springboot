package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@RestController
public class RestaurantController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome All";
    }

@GetMapping("/restaurants")
public Map<String, Map<String, Integer>> fetchRestaurants() {

    Map<String, Integer> menu1 = new HashMap<>();
    menu1.put("Burger", 100);
    menu1.put("Fries", 50);
    menu1.put("Meal", 200);

    Map<String, Integer> menu2 = new HashMap<>();
    menu2.put("Dal Makhani", 200);
    menu2.put("Paneer Makhani", 300);
    menu2.put("Roti", 20);

    HashMap<String, Integer> menu3= new HashMap<String, Integer>();
    menu3.put("Cold Coffee", 150);
    menu3.put("Hot Coffee", 100);
    menu3.put("Sandwich", 100);

    Map<String, Map<String, Integer>> restaurants = new HashMap<>();
    restaurants.put("McDonalds", menu1);
    restaurants.put("IndianVeggieDelight", menu2);
    restaurants.put("Johnscafe", menu3);


    return restaurants;
}

}
