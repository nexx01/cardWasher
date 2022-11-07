package carWasher.web;

import carWasher.CarWasherConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(properties = {"spring.profiles.active=dev"})
@RunWith(SpringRunner.class)
public class CarWasherPropertyTest {

    @Autowired
    private CarWasherConfiguration carWasherConfiguration;

    @Test
    public void getProperty() {
        System.out.println("Load Test Data: "+carWasherConfiguration
                .getCarWasherProperties().isLoadTestData());
    }


}
