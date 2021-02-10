package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.BufferedReaderService;
import ru.itsjava.service.BufferedReaderServiceImpl;
import ru.itsjava.service.CoffeeService;
import ru.itsjava.service.CoffeeServiceImpl;

@Configuration
public class MyConfig {

    @Bean
    public CoffeeService coffee() {
        return new CoffeeServiceImpl();
    }

    @Bean
    public BufferedReaderService bufferedReaderService() {
        return new BufferedReaderServiceImpl();
    }
}
