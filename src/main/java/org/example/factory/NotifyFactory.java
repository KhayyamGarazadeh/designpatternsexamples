package org.example.factory;

public class NotifyFactory {

    public INotify CreateNotify(String notifyType) {
        if (notifyType == "SMS") {
            return new SmsNotify();
        } else if (notifyType == "MAIL") {
            return new MailNotify();
        }
        return null;
    }
}
