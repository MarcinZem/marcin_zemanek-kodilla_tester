package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;

class WeatherAlertTestSuite {

    WeatherAlert weatherAlert = new WeatherAlert();
    Client client = Mockito.mock(Client.class);

    @Test
    public void subscriberShouldBeSavedToGivenLocalization() {
        Notification notification = Mockito.mock(Notification.class);

        weatherAlert.setLocalization(client);
        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.only()).receive(notification);
    }

    @Test
    public void clientCouldUnsubscribeGivenLocalization() {
        Notification notification = Mockito.mock(Notification.class);
        weatherAlert.addSubscriptionToGivenLocalization(client);
        notification = Mockito.mock(Notification.class);
        weatherAlert.removeSubscriptionFromGivenLocalization(client);

        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        weatherAlert.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSendToGivenLocalization() {
        weatherAlert.addSubscriptionToGivenLocalization(client);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.only()).receive(notification);
    }

    @Test
    public void notificationShouldBeSendToAllSubscribers() {
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        weatherAlert.addSubscriber(client);
        weatherAlert.addSubscriber(secondClient);
        weatherAlert.addSubscriber(thirdClient);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void clientCouldDeleteGivenLocalization() {
        Notification notification = Mockito.mock(Notification.class);

        weatherAlert.setLocalization(client);
        weatherAlert.sendNotification(notification);
        weatherAlert.removeLocalization(client);
        weatherAlert.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
