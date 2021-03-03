package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import ru.itsjava.configuration.MyConfig;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeServiceImpl;

@SpringBootTest
public class CoffeeServiceImplTest {

    @Autowired
    CoffeeServiceImpl csi;

    @Autowired
    ApplicationContext context;

    @Test
    public void getCoffeeByPriceTest(){
        Assertions.assertEquals(csi.getCoffeeByPrice(80),new Coffee("Американо"));
        Assertions.assertEquals(csi.getCoffeeByPrice(110),new Coffee("Латте"));
    }

    @Test
    public void beanTest(){
        Assertions.assertEquals(40,context.getBeanDefinitionCount());
    }
}
