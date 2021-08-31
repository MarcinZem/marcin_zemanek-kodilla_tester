package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
public String login;
public int cena;

public LocalDate dataZamowienia;
    public Order(String login, int cena, LocalDate dataZamowienia) {
        this.login = login;
        this.cena = cena;
        this.dataZamowienia = dataZamowienia;
    }

    public LocalDate getDataZamowienia() {
        return dataZamowienia;
    }

    public int getCena() {
        return cena;
    }

}