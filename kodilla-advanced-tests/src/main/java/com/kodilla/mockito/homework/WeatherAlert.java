package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;

import java.util.HashSet;
import java.util.Set;


public class WeatherAlert {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }


    private Client client;


    public void addSubscriptionToGivenLocalization(Client client) {
        this.client = client;

    }

    public void setLocalization(Client client) {

    }

    public void removeLocalization(Client client) {

    }

    public void removeSubscriber(Client client) {

    }

    public void removeSubscriptionFromGivenLocalization(Client client) {
        this.client = client;
    }

}
