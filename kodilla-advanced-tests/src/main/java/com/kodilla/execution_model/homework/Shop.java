package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order1) {
        orders.add(order1);
    }

    public int getSize() {
        return orders.size();
    }

    public List<Order> getOrder(LocalDate from, LocalDate to) {
        List<Order> results = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDataZamowienia().isAfter(from) && order.getDataZamowienia().isBefore(to)) {
                results.add(order);
            }
        } return results;
    }
    public List<Order> getOrder(int min, int max) {
        List<Order> results = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCena() < max && order.getCena() > min) {
                results.add(order);
            }
        }
        return results;
    }
    public int sumPrice() {
        int result = 0;
        for (Order order : orders) {
               result = result + order.getCena();
        }
        return result;
        }
    int sumPrices(int Price1, int Price2, int Price3) {
        return Price1 + Price2 + Price3;
    }
}
