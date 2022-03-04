package creational.prototype.withJavaLang;

public class Rectangle extends Shape{
    private int size;
    private String color;

    public Rectangle(int location_x, int location_y, int size, String color) {
        super(location_x, location_y);
        this.size = size;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(1, 1, 1, "grey");
            Rectangle clone = (Rectangle) rectangle.clone();
            System.out.println(clone);
            System.out.println(rectangle);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", location_x=" + location_x +
                ", location_y=" + location_y +
                '}';
    }
}
