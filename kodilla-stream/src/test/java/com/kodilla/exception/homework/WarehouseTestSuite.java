package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void TestIsOrderInSystem() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("124");
        Order isOrderInSystem = warehouse.getOrder("124");
        assertNotNull(isOrderInSystem);
    }

    @Test
    public void TestIsOrderInSystem_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("141"));
    }

}