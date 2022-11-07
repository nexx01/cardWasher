package carWasher.web;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class DataBaseTest {

    @Test
    @Transactional
    @Rollback(value = false)
    public void transactionalTest() {

    }

    @Before
    public void before() {

    }

    @BeforeTransaction
    public void beforeTransaction() {

    }
}
