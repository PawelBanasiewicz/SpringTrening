package banasiewicz.pawel.springcoredemo.config;

import banasiewicz.pawel.springcoredemo.common.Coach;
import banasiewicz.pawel.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
