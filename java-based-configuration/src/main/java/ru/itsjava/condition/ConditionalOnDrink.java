package ru.itsjava.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Conditional(OnDrinkCondition.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionalOnDrink {
}
