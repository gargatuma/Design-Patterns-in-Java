package creational.prototype.custom;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
