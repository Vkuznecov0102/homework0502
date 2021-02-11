package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.service.CoffeeService;

@ComponentScan({"ru.itsjava"})
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean("coffeeServiceImpl",CoffeeService.class).getCoffeeByPrice(80);
    }
}
