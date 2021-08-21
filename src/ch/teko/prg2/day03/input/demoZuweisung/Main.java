package ch.teko.prg2.day03.input.demoZuweisung;

public class Main {
    public static void main(String[] args) {
        //Typ und Objekt das ich zuweise sind gleich
        //so wie wir es kennen
        Triangle triangle1 = new Triangle(1.0,2.0,1.0);
        System.out.println(triangle1.calculateArea());

        //Einen Typ der abstrakten Klasse Shape weise ich eine Objekt einer Klasse (Triangle) zu, welches die abstrakte Methode der abstrakten Klasse Shape implementiert.
        Shape shape1 = new Triangle(1.0,2.0,3.0);
        System.out.println(shape1.calculateArea());

        //Der Typ der Variable definiert den Scope!
        System.out.println(triangle1.getColor());
        //System.out.println(shape1.getColor());
    }
}
