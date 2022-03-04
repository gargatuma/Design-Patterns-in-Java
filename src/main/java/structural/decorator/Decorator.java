package structural.decorator;

public abstract class Decorator implements Notification{
    protected Notification notification;

    public Decorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public abstract void send(String message);
}
