package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        CustomCollection customCollection = new CustomCollection(8);
        customCollection.add(new Clothes("red", "synthetic", "Lui Vitton", "Italy"));
        customCollection.add(new Clothes("orange", "synthetic", "Armani", "Italy"));
        customCollection.add(new Clothes("yellow", "synthetic", "D&G", "France"));
        customCollection.add(new Clothes("black", "synthetic", "Gucci", "USA"));

        System.out.println("----- ASC --------");
        CustomerIterator customerIterator = customCollection.sequentalIterator();
        while (customerIterator.hasNext()) {
            System.out.println(customerIterator.next());
        }


        System.out.println("----- DESC --------");
        CustomerIterator customerIteratorDes = customCollection.sequentalIteratorDes();
        while (customerIteratorDes.hasNext()) {
            System.out.println(customerIteratorDes.next());
        }
    }
}
