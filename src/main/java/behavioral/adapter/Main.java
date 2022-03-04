package behavioral.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(11);
        SquarePeg squarePeg = new SquarePeg(11);
        RoundPeg normalSquarePeg = new SquarePegToRoundHoleAdapter(squarePeg);

        System.out.println("Does roundPeg fit: " + roundHole.fit(roundPeg.getRadius()));
        System.out.println("Does squarePeg fit: "
                + roundHole.fit(normalSquarePeg.getRadius()));
    }
}
