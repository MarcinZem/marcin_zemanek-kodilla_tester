package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order("login1", 20, LocalDate.of(2021,8,22));
    Order order2 = new Order("login2", 15, LocalDate.of(2021,8,24));
    Order order3 = new Order("login3", 30, LocalDate.of(2021,8,23));

    @Test
    public void shouldAddOrderToShop() {
        int numberOfOrders = shop.getSize();
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderList2Dates() {
        List<Order> ordersFrom21to22 = shop.getOrder(LocalDate.of(2021,8,21), LocalDate.of(2021,8,23));
       assertEquals(2, ordersFrom21to22.size());
    }

    @Test
    public void shouldGetOrdersLowestAndHighestPrice() {
        List<Order> ordersFromMinToMax = shop.getOrder(20, 30);
        assertEquals(1, ordersFromMinToMax.size());
    }

    @Test
    public void shouldReturnOrdersList() {
        int numberOfOrders = shop.getSize();
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldSumPriceOfOrders() {
        int SumPrices = shop.sumPrices(20,15,30);
        assertEquals(65, SumPrices);
    }
 }