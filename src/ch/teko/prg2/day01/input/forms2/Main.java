package ch.teko.prg2.day01.input.forms2;

public class Main {

    public static void main(String[] args) {

        //Konstruktorverkettung
        //this()
        //Beispiel Klasse Auto
        Auto a1 = new Auto("Ferrari", 1987, 478);
        System.out.println(a1.getName());


        //Beispiel Klasse Circle
        Circle c1 = new Circle();
        c1.printSmth();
    }
}
