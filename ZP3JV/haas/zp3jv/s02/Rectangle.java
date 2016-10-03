package haas.zp3jv.s02;

/**
 * Created by AntoninHaas on 26.9.16.
 */
public class Rectangle implements Distance, Area {
    private Point a;
    private Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point p, int length, int width) {
        this.a = p;
        this.b = new Point(p.getX() + length, p.getY() + width);
    }

    @Override
    public double getArea() {
        return (Math.abs(a.getX() - b.getX()) * Math.abs(a.getY() - b.getY()));
    }

    @Override
    public double distance(Point p) {
        Point c = new Point(a.getX(), b.getY());
        Point d = new Point(b.getX(), a.getY());
        Line lna = new Line(a,c);
        Line lnb = new Line(b,d);
        Line lnc = new Line(c,b);
        Line lnd = new Line(d,a);
        return Math.min(lna.distance(p), Math.min(lnb.distance(p), Math.min(lnc.distance(p), lnd.distance(p))));
    }
}
