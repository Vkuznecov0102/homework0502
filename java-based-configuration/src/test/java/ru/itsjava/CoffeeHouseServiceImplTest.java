package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeHouseServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CoffeeHouseServiceImplTest {
    private final CoffeeHouseServiceImpl mockedCSI = mock(CoffeeHouseServiceImpl.class);

    @Test
    public void getCoffeeByPriceTest() {
        when(mockedCSI.getCoffeeByPrice(75)).thenReturn(new Coffee("Мокка"));
        when(mockedCSI.getCoffeeByPrice(120)).thenReturn(new Coffee("Холодный кофе"));
        when(mockedCSI.getCoffeeByPrice(100)).thenReturn(new Coffee("Горячий шоколад"));
        when(mockedCSI.getCoffeeByPrice(110)).thenReturn(new Coffee("Какао"));

        Assertions.assertEquals(mockedCSI.getCoffeeByPrice(110), new Coffee("Какао"));
        Assertions.assertNull(mockedCSI.getCoffeeByPrice(300));
    }
}
