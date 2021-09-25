package ch.teko.prg2.day05.input;

import java.io.FileWriter;

public class ExceptionsDemo {
    public static void main(String[] args) {

        String data = "This is the data in the output file";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("./src/ch/teko/prg2/day05/input/output.txt");
            //FileWriter output = new FileWriter(".\\src\\ch\\teko\\prg2\\day05\\input\\output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

