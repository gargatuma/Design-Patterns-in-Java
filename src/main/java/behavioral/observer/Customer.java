package behavioral.observer;

@FunctionalInterface
public interface Customer {
    void update(String event);
}
