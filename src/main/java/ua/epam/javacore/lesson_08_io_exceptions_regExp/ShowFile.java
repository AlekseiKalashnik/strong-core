package ua.epam.javacore.lesson_08_io_exceptions_regExp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        System.out.println(Arrays.toString(args));

// First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
// Attempt to open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
// At this point, the file is open and can be read.
// The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
// Close the file.
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error Closing File");
        }
    }
}
