package org.example.factory;

public class MailNotify implements INotify{
    @Override
    public void sendNotification(User user) {
        System.out.println("Email Gönderildi.");
    }
}
