package carWasher.web;

import carWasher.model.Car;
import carWasher.model.Driver;
import carWasher.repository.CarWasherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {

    @Autowired
    CarWasherRepository repository;

    @RequestMapping("/car")
    public List<Car> getCars() {

        Driver driver = new Driver(1, "2", "2", "2", "2");
        Driver driver1 = new Driver(1, "2", "2", "2", "2");
        Driver driver2 = new Driver(1, "2", "2", "2", "2");
        Driver driver3 = new Driver(1, "2", "2", "2", "2");

        Car car = new Car(1, "1", "1", driver, 2018);
        Car car1 = new Car(1, "1", "1", driver1, 2018);
        Car car2 = new Car(1, "1", "1", driver2, 2018);
        Car car3 = new Car(1, "1", "1", driver3, 2018);

        return List.of(car1, car2, car3, car);
    }

    @RequestMapping("/car/{index}")
    public ResponseEntity<Car> getCar(@PathVariable("index") int index) {
        Driver driver = new Driver(1, "2", "2", "2", "2");
        Driver driver1 = new Driver(1, "2", "2", "2", "2");
        Driver driver2 = new Driver(1, "2", "2", "2", "2");
        Driver driver3 = new Driver(1, "2", "2", "2", "2");

        Car car = new Car(1, "1", "1", driver, 2018);
        Car car1 = new Car(1, "1", "1", driver1, 2018);
        Car car2 = new Car(1, "1", "1", driver2, 2018);
        Car car3 = new Car(1, "1", "1", driver3, 2018);

        List<Car> car11 = List.of(car1, car2, car3, car);
        return ResponseEntity.ok(car11.get(index));
    }




//
//    @RequestMapping(value = "carNameFord", method = RequestMethod.GET)
//    public ModelAndView fordJsp() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("name", "ford");
//        modelAndView.setViewName("ford");
//        return
//                modelAndView;
//    }

    @RequestMapping("/carR/{id}")
    public Car getCar1(@PathVariable int id) {
        return repository.getCar(id);
    }

    @RequestMapping("/carsR")
    public List<Car> getCars1() {
        return repository.getCars();
    }

}