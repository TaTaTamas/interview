package com.job.interview.interview;

import jobtest.MinimumDifference;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public MinimumDifference minimumDifference() {
        return new MinimumDifference();
    }
}
