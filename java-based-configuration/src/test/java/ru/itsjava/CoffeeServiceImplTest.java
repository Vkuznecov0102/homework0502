package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeServiceImpl;

@SpringBootTest
public class CoffeeServiceImplTest {

    @Autowired
    CoffeeServiceImpl csi;

    @Test
    public void getCoffeeByPriceTest(){
        Assertions.assertEquals(csi.getCoffeeByPrice(80),new Coffee("Американо"));
        Assertions.assertEquals(csi.getCoffeeByPrice(110),new Coffee("Латте"));
    }
}
