package ch.teko.prg2.day02.solution.aufgabe2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(4.0, 3.0, 5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);

        System.out.printf("Area for circle is: %f%nArea for triangle is: %f%nArea for rectangle is: %f", circle.calculateArea(), triangle.calculateArea(), rectangle.calculateArea());

    }
}
