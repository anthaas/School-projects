package haas.zp3jv.s03;

import java.util.List;

/**
 * Created by AntoninHaas on 26.9.16.
 **/
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public static void printPoint(Point p) {
        System.out.println("[" + p.getX() + "," + p.getY() +"]");
    }

    public static  Point nearest(Point p, List<Point> points) {
        Point nearest = points.get(0);

        for (Point q : points) {
            if (p.distance(nearest) > p.distance(q)) {
                nearest = q;
            }
        }

        return nearest;
    }

}
