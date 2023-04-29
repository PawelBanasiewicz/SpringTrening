package banasiewicz.pawel.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHallo() {
        return "Hello World";
    }

    // expose a new endpoint for "workaout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
