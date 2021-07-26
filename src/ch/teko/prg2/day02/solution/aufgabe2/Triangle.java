package ch.teko.prg2.day02.solution.aufgabe2;

public class Triangle extends Polygon {
    private double a;
    private double b;
    private double c;
    private double s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt((this.s * (this.s - this.a) * (this.s - this.b) * (this.s - this.c)));
    }
}
