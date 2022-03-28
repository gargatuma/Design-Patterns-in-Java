package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Customer> observers = new ArrayList<>();

    void addObserver(Customer customer) {
        if (observers.contains(customer)) {
            throw new IllegalArgumentException();
        }
        observers.add(customer);
    }

    void removeObserver(Customer customer) {
        int index = observers.indexOf(customer);
        if (index == -1) {
            throw new IllegalArgumentException();
        }
        observers.remove(index);
    }

    void notify(String event) {
        observers.forEach(customer -> customer.update(event));
    }
}
