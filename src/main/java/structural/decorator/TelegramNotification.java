package structural.decorator;

public class TelegramNotification extends Decorator{

    public TelegramNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        notification.send(message);
        System.out.println("Telegram message sent: " + message);
    }
}
