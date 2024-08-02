package dev.aniket.springrediscache3.Controller;

import dev.aniket.springrediscache3.Service.CarService;
import dev.aniket.springrediscache3.model.Car;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id}")
    @Cacheable(value = "car")
    public Car getCar(@PathVariable("id") Long id) {
        return carService.getCarById(id);

    }

    @GetMapping("/")
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @PostMapping("/create")
    @CachePut(value ="carcache")
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car.getCompany(), car.getModel());


    }
}
