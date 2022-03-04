package structural.adapter;

public class SquarePegToRoundHoleAdapter extends RoundPeg{
    private final SquarePeg squarePeg;

    public SquarePegToRoundHoleAdapter(SquarePeg squarePeg) {
       this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
       return (int) (this.squarePeg.getWidth() * Math.sqrt(2)/2);
    }
}
