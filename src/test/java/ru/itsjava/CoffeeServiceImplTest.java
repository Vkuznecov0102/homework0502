package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoffeeServiceImplTest {

    private final CoffeeServiceImpl mockedCSI = mock(CoffeeServiceImpl.class);

    @Test
    public void getCoffeeByPriceTest() {
        when(mockedCSI.getCoffeeByPrice(60)).thenReturn(new Coffee("Эспрессо"));
        when(mockedCSI.getCoffeeByPrice(80)).thenReturn(new Coffee("Американо"));
        when(mockedCSI.getCoffeeByPrice(100)).thenReturn(new Coffee("Капучино"));
        when(mockedCSI.getCoffeeByPrice(110)).thenReturn(new Coffee("Латте"));

        Assertions.assertEquals(mockedCSI.getCoffeeByPrice(60), new Coffee("Эспрессо"));
        Assertions.assertNull(mockedCSI.getCoffeeByPrice(300));
    }
}
