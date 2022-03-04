package structural.adapter;

public class RoundHole {
   private final int radius;

   public RoundHole(int radius) {
       this.radius = radius;
   }

   int getRadius() {
       return this.radius;
   }

   boolean fit(int radius) {
       return this.radius >= radius;
   }
}
