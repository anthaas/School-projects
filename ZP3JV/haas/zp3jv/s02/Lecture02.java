package haas.zp3jv.s02;

/**
 * Created by AntoninHaas on 29.9.16.
 */
public class Lecture02 {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(5,5);
        Point c = new Point(5,1);
        Point d = new Point(2,3);
        System.out.println("Distance between A[1,1] and B[5,5]: " + a.distance(b));

        Line segment = new Line(a,b);
        System.out.println("Length of the segment given by A[1,1] and B[5,5]: " + segment.getLength());
        System.out.println("Distance between segment given by A[1,1] and B[5,5] and the point C[5,1]: " + segment.distance(c));

        Rectangle rectangle = new Rectangle(a,b);
        System.out.println("Area of the rectangle given by A[1,1] and B[5,5]: " + rectangle.getArea());
        System.out.println("Distance between the rectangle given by A[1,1] and B[5,5] and the point D[2,3]: " + rectangle.distance(d));

        Square square = new Square(a, 10);
        System.out.println("Area of the square given by A[1,1] and length 10: " + square.getArea());

        Circle circle = new Circle(b,4);
        System.out.println("Area of the circle given by center [5,5] and radius 4: " + circle.getArea());
        System.out.println("Distance between circle given by center [5,5] and radius 4 and the point A[1,1]: " + circle.distance(a));

    }
}
