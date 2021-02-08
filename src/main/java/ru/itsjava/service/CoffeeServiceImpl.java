package ru.itsjava.service;

import lombok.SneakyThrows;
import ru.itsjava.domain.Coffee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CoffeeServiceImpl implements CoffeeService {

    private Coffee coffee;

    @SneakyThrows
    @Override
    public Coffee getCoffeeByPrice(double price) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите цену");
        price = scanner.nextDouble();

        while (true) {
            if (price == 60) {
                coffee = new Coffee("Эспрессо");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 80) {
                coffee = new Coffee("Американо");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 100) {
                coffee = new Coffee("Капучино");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 110) {
                coffee = new Coffee("Латте");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            }
            else if (price != 60 && price != 80 && price != 100 && price != 110) {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }

    @SneakyThrows
    private void printMenu() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/menu.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
