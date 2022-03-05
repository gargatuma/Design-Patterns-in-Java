package behavioral.iterator;

public class Clothes {
    private final String color;
    private final String madeOf;
    private final String brand;
    private final String madeIn;

    public Clothes(String color, String madeOf, String brand, String madeIn) {
        this.color = color;
        this.madeOf = madeOf;
        this.brand = brand;
        this.madeIn = madeIn;
    }

    public String getColor() {
        return color;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadeIn() {
        return madeIn;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                ", madeOf='" + madeOf + '\'' +
                ", brand='" + brand + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
