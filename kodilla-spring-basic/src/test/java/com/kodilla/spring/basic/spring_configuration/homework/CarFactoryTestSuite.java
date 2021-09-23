package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldLightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        LocalDate date = LocalDate.now();
        if (date.getMonthValue() == 9){
            car = new Sedan();
        }
    }
}
