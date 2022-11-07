package carWasher.web;

import carWasher.model.Car;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CarWasherControllerTest {

    private RestTemplate restTemplater;

    @Before
    public void init() {
        restTemplater = new RestTemplate();
    }

    @Test
    public void getCarsTest() {

        List forObject = restTemplater.getForObject("http://localhost:8081/carWasherController/car", List.class);
        System.out.println("Size of the cars "+forObject.size());

    }

    @Test
    public void getCar() {

        ResponseEntity<Car> forObject = restTemplater.getForEntity("http://localhost:8081/carWasherController/car/1",
                Car.class);
        System.out.println("Car model is "+forObject.getBody().getModel());
    }
}