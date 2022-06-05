import java.util.Random;

public class S478 {
    double x, y, r;

    public S478(double radius, double x_center, double y_center) {
        x = x_center;
        y = y_center;
        r = radius;
    }

    public double[] randPoint() {
        double ur = Math.sqrt(Math.random()) * r;
        double theta = Math.random() * Math.PI * 2;
        return new double[]{x + ur * Math.cos(theta), y + ur * Math.sin(theta)};
    }
}
