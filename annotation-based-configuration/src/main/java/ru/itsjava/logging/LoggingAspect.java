package ru.itsjava.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution (* ru.itsjava.service.CoffeeService.getCoffeeByPrice*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Вывеска: Кофейня для изучающих Spring c помощью метода "+ joinPoint.getSignature().getName());
    }

    @After("execution (* ru.itsjava.service.CoffeeService.getCoffeeByPrice*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Спасибо за визит!Заходите еще!");
        System.out.println("Log after "+ joinPoint.getSignature().getName());
    }

    @Around("execution (* ru.itsjava.service.CoffeeService.*(..))")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Здесь внутри что-то происходит "+ pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("Здесь внутри что-то уже произошло "+ pjp.getSignature().getName());
        return result;
    }
}
