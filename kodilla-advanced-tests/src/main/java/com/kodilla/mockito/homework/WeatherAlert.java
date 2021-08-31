package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WeatherAlert {

   private Map<Localization, List<Client>> clients = new HashMap<>();

    public void addSubscriber(Client client, Localization localization) {
        if (clients.containsKey(localization)) {
            clients.get(localization).add(client);
        } else {
            List<Client> clientsToAdd = new ArrayList<>();
            clientsToAdd.add(client);
            clients.put(localization, clientsToAdd);
        }
    }

    public void sendNotification(Notification notification) {
      // this.clients.forEach(client -> client.receive(notification));
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
