package ch.teko.prg2.day02.solution.aufgabe2;

public class Circle extends Polygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
