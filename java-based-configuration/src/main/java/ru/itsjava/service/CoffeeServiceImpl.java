package ru.itsjava.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import ru.itsjava.domain.Coffee;


public class CoffeeServiceImpl implements CoffeeService {


    private Coffee coffee;

    @Autowired
    private BufferedReaderService bufferedReaderService;

    @Autowired
    private ScannerService scannerService;

    @SneakyThrows
    @Override
    public Coffee getCoffeeByPrice(double price) {
        bufferedReaderService.menuReader("src/main/resources/coffee.txt");
        scannerService.read(price);

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
            } else {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}
