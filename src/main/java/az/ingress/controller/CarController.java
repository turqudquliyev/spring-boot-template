package az.ingress.controller;

import az.ingress.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("v1/services")
@RestController
public class CarController {

    CarService carService;

    public CarController(@Qualifier("transmissionService") CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public String runService(){
        return carService.run();
    }
}