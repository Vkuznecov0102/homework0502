package ru.itsjava.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.condition.ConditionalOnDrink;
import ru.itsjava.property.DrinkProperty;
import ru.itsjava.service.*;

@Configuration
@EnableConfigurationProperties(DrinkProperty.class)
public class MyConfig {

    @Bean
    @ConditionalOnMissingBean(CoffeeService.class)
    @ConditionalOnProperty(value = "coffee.is-old-menu", havingValue = "false")
    public CoffeeService coffeeHouse() {
        return new CoffeeHouseServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(CoffeeService.class)
    @ConditionalOnProperty(value = "coffee.is-old-menu", havingValue = "true")
    public CoffeeService coffee() {
        return new CoffeeServiceImpl();
    }

//    @Bean
//    public CoffeeService coffeeService(DrinkProperty property){
//        return new CoffeeServicePropsImpl(property.getName());
//    }

    @Bean
    public BufferedReaderService bufferedReaderService() {
        return new BufferedReaderServiceImpl();
    }

    @Bean
    public ScannerService scannerService() {
        return new ScannerServiceImpl();
    }
}
