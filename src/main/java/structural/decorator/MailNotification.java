package structural.decorator;

public class MailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Mail sent: " + message);
    }
}
