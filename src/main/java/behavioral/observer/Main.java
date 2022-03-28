package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.funct();
    }

    public void funct() {
        Customer observer1 = System.out::println;
        Store store = new Store();
        store.addObserver(observer1);
        store.notify("new Intempt Product!");
    }
}
