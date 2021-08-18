package com.kodilla.exception.homework;

import java.util.*;
import java.util.ArrayList;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
    }

    public void addOrder(String newOrder) {
        Order order = new Order(newOrder);
        orders.add(order);
    }

}













