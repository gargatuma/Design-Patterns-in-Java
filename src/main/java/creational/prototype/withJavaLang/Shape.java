package creational.prototype.withJavaLang;

public class Shape implements Cloneable{
    protected int location_x;
    protected int location_y;

    public Shape(int location_x, int location_y) {
        this.location_x = location_x;
        this.location_y = location_y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
