package creational.factoryMethod;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public void doLogistics() {
        Transport transport = createTransport();
        System.out.println("processsing");
        transport.deliver();
    }
}
