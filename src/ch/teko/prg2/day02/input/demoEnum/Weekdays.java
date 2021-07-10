package ch.teko.prg2.day02.input.demoEnum;

public enum Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    static void writeAllDays() {
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }
    }
}
