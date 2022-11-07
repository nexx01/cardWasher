//package carWasher.web;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.Map;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class CarWasherDataBaseTest {
//
//    @Autowired
//    JdbcTemplate template;
//
//    @Test
//    public void getCars() {
//        List<Map<String, Object>> maps = template.queryForList("select * from car");
//
//        System.out.println("Size of cars: "+maps.size());
//
//    }
//
//    @Test
//    public void getCar() {
//        Map<String, Object> stringObjectMap = template.queryForMap("select * from car where id=?", 2);
//        System.out.println("Car model is: " + stringObjectMap.get("model"));
//        System.out.println("Car id is: " + stringObjectMap.get("id"));
//        System.out.println("Car color is: "+ stringObjectMap.get("color"));
//    }
//}
