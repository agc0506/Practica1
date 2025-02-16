package punto;

public class punto {
    private double x;
    private double y;

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] coordCartesianas() {
        return new double[]{x, y};
    }

    public double[] coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return new double[]{r, theta};
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        punto p = new punto(3, 4);
        System.out.println(p);  // Output: Punto(3.0, 4.0)
        System.out.println(java.util.Arrays.toString(p.coordCartesianas())); // Output: [3.0, 4.0]
        System.out.println(java.util.Arrays.toString(p.coordPolares())); // Output: [5.0, 0.93...]
    }
}
