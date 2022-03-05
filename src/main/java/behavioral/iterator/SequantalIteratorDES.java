package behavioral.iterator;

public class SequantalIteratorDES implements CustomerIterator{
    private final Clothes[] collection;
    private int index;

    public SequantalIteratorDES(Clothes[] collection) {
        this.collection = collection;
        this.index = collection.length - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Clothes next() {
        return collection[index--];
    }
}
