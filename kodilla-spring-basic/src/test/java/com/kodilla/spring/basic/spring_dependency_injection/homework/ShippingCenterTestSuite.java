package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean delivery = bean.deliverPackage("Any address", 30);
        Assertions.assertNotNull(delivery);
    }
}
