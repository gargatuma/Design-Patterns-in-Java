package structural.decorator;

public class SmsDecorator extends Decorator{

    public SmsDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        notification.send(message);
        System.out.println("SMS sent: " + message);
    }
}
