package az.ingress.controller;

import az.ingress.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;
@RequestMapping("v1/services")
@RestController
public class CarController {

    CarService carService;

    public CarController(@Qualifier("transmissionService") CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String runService(){
        return carService.run();
    }
}