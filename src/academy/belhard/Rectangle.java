package academy.belhard;

public class Rectangle {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double area() {
        return a * b;
    }

    double perimeter() {
        return 2 * a + 2 * b;
    }
}

