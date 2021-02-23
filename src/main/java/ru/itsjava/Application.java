package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.BufferedReaderServiceImpl;
import ru.itsjava.service.CoffeeService;
import ru.itsjava.service.CoffeeServiceImpl;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.getBean(CoffeeServiceImpl.class).getCoffeeByPrice(60);
//        context.getBean(BufferedReaderServiceImpl.class).menuReader("src/main/resources/coffee.txt");
    }
}