package pl.sebasr.car;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;

    public CarService() {

        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("FIAT", "Polonez");
        Car car3 = new Car("Honda", "CRV");

        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

    }


    public List<Car> getCars() {
        return carList;

    }



}
