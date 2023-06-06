class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle(4);
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
    }
}