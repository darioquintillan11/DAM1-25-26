package ud3;

public class MathRandom {
    public static double random(double min, double max) {
        double f = Math.random();
        double x = (f+min) + (f*(max+Math.abs(min)));
        return x;
    }
    public static void main(String[] args) {
        System.out.println(random(-360, 360));
    }
    
}
