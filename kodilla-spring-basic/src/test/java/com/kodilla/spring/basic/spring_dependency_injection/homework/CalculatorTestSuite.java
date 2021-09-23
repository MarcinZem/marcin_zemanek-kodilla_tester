package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldCalculateCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.add(3, 2);
        Assertions.assertNotNull(5);
    }
}
