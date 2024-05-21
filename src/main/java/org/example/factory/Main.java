package org.example.factory;

public class Main {
    public static void main(String[] args) {
        NotifyFactory notifyFactory = new NotifyFactory();

        INotify notify = notifyFactory.CreateNotify("SMS");


        notify.sendNotification(new User());
    }
}

