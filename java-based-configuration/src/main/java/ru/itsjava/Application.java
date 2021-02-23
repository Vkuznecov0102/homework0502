package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.service.CoffeeService;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
        context.getBean(CoffeeService.class).getCoffeeByPrice(80);

//        ApplicationContext context= SpringApplication.run(Application.class);
//        context.getBean(CoffeeService.class).getCoffeeByPrice(80);
    }
}