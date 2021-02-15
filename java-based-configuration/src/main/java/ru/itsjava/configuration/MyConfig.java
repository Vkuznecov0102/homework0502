package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.*;

@Configuration
public class MyConfig {

    @Bean
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
