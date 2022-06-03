package course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFinally {
    public static void main(String[] args) {
        File file = new File("C:\\dev\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner((file));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("error opening file: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("finally block executed");
        }
    }

}
