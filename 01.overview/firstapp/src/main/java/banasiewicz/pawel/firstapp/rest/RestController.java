package banasiewicz.pawel.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHallo() {
        return "Hello World";
    }
}
