package academy.belhard;

public class Square1 {
    private double a;

    public Square1(double a) {
        this.a = a;
    }

    double area() {
        return a * a;
    }

    double perimeter() {
        return 4 * a;
    }
}
