package haas.zp3jv.s02;

/**
 * Created by AntoninHaas on 26.9.16.
 */
public class Circle implements Distance, Area {
    private Point center;
    private int radius;


    public Circle(Point p, int r) {
        this.center = p;
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double distance(Point p) {
        return Math.abs(p.distance(center) - radius);
    }
}
