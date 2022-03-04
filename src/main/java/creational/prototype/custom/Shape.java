package creational.prototype.custom;

public abstract class Shape {
    private int location_x;
    private int location_y;
    private String color;

    public Shape(Shape source) {
        if (source != null) {
            this.color = source.color;
            this.location_x = source.location_x;
            this.location_y = source.location_y;
        }
    }

    @Override
    public abstract Shape clone();
}
