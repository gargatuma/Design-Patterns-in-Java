package behavioral.iterator;

public class CustomCollection {
    private final Clothes[] items;
    private int index;

    public CustomCollection(int length) {
        items = new Clothes[length];
    }

    CustomerIterator sequentalIterator() {
        return new SequentalIteratorASC(items);
    }

    CustomerIterator sequentalIteratorDes() {
        return new SequantalIteratorDES(items);
    }

    public void add(Clothes clothe) {
        if (index < items.length) {
            this.items[index++] = clothe;
            return;
        }

        throw new IndexOutOfBoundsException();
    }
}
