package carWasher.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SchedulersJob {

    @Scheduled(cron = "45 19 08 * * ?")
    public void scheduledJob() {
        System.out.println("----Job runninig at: " + new Date());
    }
}
