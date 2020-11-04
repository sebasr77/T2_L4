package pl.sebasr.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarControler {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

     public CarService getCarService() {
        return carService;
    }

    @GetMapping
    public List<Car> get() {
        return carService.getCars();
    }
}
