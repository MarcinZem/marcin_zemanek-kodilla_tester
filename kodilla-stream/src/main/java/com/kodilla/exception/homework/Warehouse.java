package com.kodilla.exception.homework;

import java.util.*;
import java.util.ArrayList;

public class Warehouse {

                List<String> orders = new ArrayList<>();
                Order o1 = new Order("123");
                Order o2 = new Order("124");
                Order o3 = new Order("125");

                private static void getOrder(int getOrder) {
                Warehouse.getOrder(2);
                }

                private static void addOrder(String newOrder) {
                Warehouse.addOrder("126");
                }

        public List<String> getOrders() throws OrderDoesntExistException {
            return orders;

        }
}






