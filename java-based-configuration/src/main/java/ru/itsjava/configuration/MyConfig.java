package ru.itsjava.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.condition.ConditionalOnDrink;
import ru.itsjava.service.*;

@Configuration
public class MyConfig {

    @Bean
    @ConditionalOnMissingBean(CoffeeService.class)
    @ConditionalOnDrink
    public CoffeeService coffeeHouse(){
        return new CoffeeHouseServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(CoffeeService.class)
    public CoffeeService coffee() {
        return new CoffeeServiceImpl();
    }

    @Bean
    public BufferedReaderService bufferedReaderService() {
        return new BufferedReaderServiceImpl();
    }

    @Bean
    public ScannerService scannerService(){
        return new ScannerServiceImpl();
    }
}
