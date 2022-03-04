package structural.adapter;

public class RoundPeg {
    private int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public RoundPeg(){};

    int getRadius() {
        return this.radius;
    }
}
