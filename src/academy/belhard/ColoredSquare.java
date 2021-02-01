package academy.belhard;

public class ColoredSquare extends Square2 {
    private String color;

    public ColoredSquare(String color, double a) {
        super(a);
    }

    public String getColor() {
        return color;
    }

    @Override
    double perimeter() {
        System.out.println("Вычисление периметра...");

        return super.perimeter();
    }

}
