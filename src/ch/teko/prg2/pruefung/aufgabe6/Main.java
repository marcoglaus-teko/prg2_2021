package ch.teko.prg2.pruefung.aufgabe6;

public class Main {
    public static void main(String[] args) {
        // to be implemented
        IForms2D rectangle = new IForms2D() {
            // to be implemented
            private double width = 2.0;
            private double length = 3.0;

            public double getWidth() {
                return width;
            }

            public double getLength() {
                return length;
            }

            // to be implemented
            @Override
            public double getArea() {
                return this.getLength() * this.getWidth();
            }

            @Override
            public double getPerimeter() {
                return 2 * (this.getLength() + this.getWidth());
            }
        };

        System.out.printf("Die Fläche beträgt: %f \n", rectangle.getArea());
        System.out.printf("Die Umfang beträgt: %f", rectangle.getPerimeter());
    }
}
