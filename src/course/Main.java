package course;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        errorHandling1();
        System.out.println("End of program");
    }

    public static void errorHandling1() {
        System.out.println("***errorHandling1 starts***");
        errorHandling2();

        System.out.println("***errorHandling1 ends***");
    }

    public static void errorHandling2() {
        System.out.println("***errorHandling2 starts***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println(" Input error");
        }
        System.out.println("***errorHandling2 ends***");

        sc.close();

    }


}
