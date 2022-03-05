package behavioral.iterator;

public class SequentalIteratorASC implements CustomerIterator{
    private final Clothes[] collection;
    private int index;

    public SequentalIteratorASC(Clothes[] collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length && this.collection[index] != null;
    }

    @Override
    public Clothes next() {
        return this.collection[index++];
    }
}
