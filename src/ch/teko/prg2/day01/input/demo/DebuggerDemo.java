package ch.teko.prg2.day01.input.demo;

public class DebuggerDemo {

    public void starsWithFor(int numberOfStars) {
        for (int i = 1; i < numberOfStars; i++) {
            System.out.println();
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
        }

        for (int k = numberOfStars; k > 0; k--){
            System.out.println();
            for (int l = 0; l < k; l++){
                System.out.print("*");
            }
        }

    }

    /*
     * Jedes break; Statement terminiert das switch statement. Der Code geht mit dem ersten Code nach dem switch-Block.
     * Das break; Statement wird benötigt, weil ohne, alle Statements nach dem matching case sequentiell ausgeführt werden,
     * ohne erneute Überprüfung des nächsten cases. Dies geschieht, bis zum nächsten break statement.
     *
     * Um das zu sehen, könnt ihr folgendes Beispiel ansehen. Zeile 35 - 37. Mehrere cases, die schlussendlich den "gleichen"
     * Code ausführen.
     *
     */
    public int numberOfDays(int numberOfMonth, int year) {
        int numDays = 0;

        switch (numberOfMonth) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        return numDays;
    }

    public static void main(String[] args) {
        DebuggerDemo demo = new DebuggerDemo();
        System.out.println(demo.numberOfDays(2,2000));
        demo.starsWithFor(5);
    }
}
