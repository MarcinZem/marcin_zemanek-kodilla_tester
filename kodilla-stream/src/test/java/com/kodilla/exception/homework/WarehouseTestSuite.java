package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void TestIsOrderInSystem() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        String isOrdero2InSystem = warehouse.isOrderInSystem("124");
        assertTrue(Boolean.parseBoolean(isOrdero2InSystem));
    }

    @Test
    public void TestIsOrderInSystem_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.isOrderInSystem("141"));
    }

}