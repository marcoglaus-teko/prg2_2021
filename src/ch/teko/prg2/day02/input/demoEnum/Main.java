package ch.teko.prg2.day02.input.demoEnum;

public class Main {
    public static void main(String[] args) {
        Weekdays.writeAllDays();
        Creature creature = Creature.SNAKE;
        System.out.println(creature.description());
    }
}
