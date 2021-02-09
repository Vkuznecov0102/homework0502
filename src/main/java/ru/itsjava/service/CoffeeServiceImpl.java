package ru.itsjava.service;

import lombok.SneakyThrows;
import ru.itsjava.domain.Coffee;

import java.util.Scanner;

public class CoffeeServiceImpl implements CoffeeService {

    private Coffee serviceCoffee;
    private final BufferedReaderServiceImpl bufferedReaderService;

    public CoffeeServiceImpl() {
        bufferedReaderService = new BufferedReaderServiceImpl();
    }

    @SneakyThrows
    @Override
    public Coffee getCoffeeByPrice(double price) {
        bufferedReaderService.menuReader("src/main/resources/menu.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите цену");
        price = scanner.nextDouble();

        while (true) {
            if (price == 60) {
                serviceCoffee = new Coffee("Эспрессо");
                System.out.println("Ваш выбор " + serviceCoffee + "!" + "Получите пожалуйста:-)");
                return serviceCoffee;
            } else if (price == 80) {
                serviceCoffee = new Coffee("Американо");
                System.out.println("Ваш выбор " + serviceCoffee + "!" + "Получите пожалуйста:-)");
                return serviceCoffee;
            } else if (price == 100) {
                serviceCoffee = new Coffee("Капучино");
                System.out.println("Ваш выбор " + serviceCoffee + "!" + "Получите пожалуйста:-)");
                return serviceCoffee;
            } else if (price == 110) {
                serviceCoffee = new Coffee("Латте");
                System.out.println("Ваш выбор " + serviceCoffee + "!" + "Получите пожалуйста:-)");
                return serviceCoffee;
            }
            else if (price != 60 && price != 80 && price != 100 && price != 110) {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}
