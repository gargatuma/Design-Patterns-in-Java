package behavioral.composite;

public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf(10);
        Leaf leaf1 = new Leaf(20);
        Leaf leaf2 = new Leaf(40);
        Leaf leaf3 = new Leaf(50);

        Composite composite1 = new Composite();
        composite1.add(leaf);
        composite1.add(leaf1);

        Composite composite2 = new Composite();
        composite2.add(leaf2);
        composite2.add(leaf3);
        composite2.add(composite1);
        composite2.add(composite2);

        System.out.println(leaf2.getPrice());
        System.out.println(leaf3.getPrice());
        System.out.println(composite1.getPrice());
        System.out.println(composite2.getPrice());
    }
}
