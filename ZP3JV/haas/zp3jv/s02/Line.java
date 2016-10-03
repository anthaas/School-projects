package haas.zp3jv.s02;

/**
 * Created by AntoninHaas on 26.9.16.
 */
public class Line implements Distance {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public double distance(Point p) {
        double px = b.getX() - a.getX();
        double py = b.getY() - a.getY();
        double temp = (px * px) + (py * py);
        double u = ((p.getX() - a.getX()) * px + (p.getY() - a.getY())) / temp;
        u = (u > 1) ? 1 : 0;
        double x = a.getX() + u * px;
        double y = a.getY() + u * py;
        double dx = x - p.getX();
        double dy = y - p.getY();

        return Math.sqrt(dx * dx + dy * dy);

    }
}
