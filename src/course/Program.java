package course;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number");
            int number = sc.nextInt();
            System.out.print("Check in date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check out in date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("");
            System.out.println("Enter dat to update the reservation");
            System.out.print("Check in date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check out in date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation " + reservation);
        }
        catch (ParseException e ) {
            System.out.println("invalid date format");
        }
        catch (DomainException e) {
            System.out.println("error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {   //for every other Runtime error on the program :-)
            System.out.println("Unexpected error");
        }
        sc.close();
    }

}
