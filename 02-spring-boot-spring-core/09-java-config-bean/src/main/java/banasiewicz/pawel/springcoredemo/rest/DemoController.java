package banasiewicz.pawel.springcoredemo.rest;

import banasiewicz.pawel.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private final Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkOut();
    }
}
