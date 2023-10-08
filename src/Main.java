class Circle{
    Point center;
    double radius;
    //constructing a new Circle
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public double getDistance(Point point){
        //distance from the point to the circle
        return Math.sqrt(Math.pow(point.x-center.x,2)+Math.pow(point.y- center.y,2));
    }
}
class Point{
    int x;
    int y;
    //constructing a center
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,6);

        Point cen1 = new Point(4,5);
        Point cen2 = new Point(5,7);
        Point cen3 = new Point(10,9);
        //multiple circle
        Circle c1 = new Circle(cen1,4);
        Circle c2 = new Circle(cen2,3);
        Circle c3 = new Circle(cen3,6);

        //now find the nearest circle from this point

        if (c1.getDistance(point)<c2.getDistance(point)){
            if (c1.getDistance(point)<c3.getDistance(point)){
                System.out.println("Nearest Circle is Circle 1");
            } else System.out.println("Nearest Circle is Circle 3");
        } else if (c2.getDistance(point)< c1.getDistance(point)) {
            if (c2.getDistance(point)<c3.getDistance(point)){
                System.out.println("Nearest Circle is Circle 2");
            } else System.out.println("Nearest Circle is Circle 3");
        }
    }
}