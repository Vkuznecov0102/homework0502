package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
public class CoffeeServicePropsImpl implements CoffeeService {

    private final String name;

    @Override
    public Coffee getCoffeeByPrice(double price) {
        return new Coffee(name);
    }
}
