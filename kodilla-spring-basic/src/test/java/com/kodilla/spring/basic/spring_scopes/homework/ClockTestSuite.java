package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTime() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.time, secondBean.time);
        Assertions.assertNotEquals(secondBean.time, thirdBean.time);
        Assertions.assertNotEquals(firstBean.time, thirdBean.time);
    }
}
