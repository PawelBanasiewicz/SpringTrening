package banasiewicz.pawel.springcoredemo.rest;

import banasiewicz.pawel.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach myAnotherCoach;

    @Autowired
    public DemoController(
                @Qualifier("cricketCoach") Coach coach,
                @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
        myAnotherCoach = anotherCoach;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == myAnotherCoach, " + (myCoach == myAnotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkOut();
    }
}
