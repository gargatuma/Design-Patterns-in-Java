package structural.decorator;

public class Main {
    public static void main(String[] args) {
        String message = "Your house is on fire";

        // Our main and simple notification class
        Notification notification = new MailNotification();
        notification.send(message);
        System.out.println("---------------");

        // we can add only one additional behavior
        Notification notificationWrapper = new SmsDecorator(notification);
        notificationWrapper.send(message);
        System.out.println("---------------");

        // We can stack notifications easily
        Notification notificationStack = new TelegramNotification(notificationWrapper);
        notificationStack.send(message);
    }
}
