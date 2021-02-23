package ru.itsjava.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("coffee")
public class DrinkProperty {
    private boolean isOldMenu;
    private String name;
}