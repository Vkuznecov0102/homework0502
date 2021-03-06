package ru.itsjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itsjava.domain.Coffee;

public class CoffeeHouseServiceImpl implements CoffeeService {

    private Coffee coffee;

    @Autowired
    private BufferedReaderService bufferedReaderService;

    @Autowired
    private ScannerService scannerService;

    @Override
    public Coffee getCoffeeByPrice(double price) {
        bufferedReaderService.menuReader("src/main/resources/coffeehouse.txt");
        scannerService.read(price);

        while (true) {
            if (price == 75) {
                coffee = new Coffee("Мокка");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 120) {
                coffee = new Coffee("Холодный кофе");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 130) {
                coffee = new Coffee("Горячий шоколад");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 90) {
                coffee = new Coffee("Какао");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}
