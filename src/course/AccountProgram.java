package course;

import model.entities.Account;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.println("Enter account number");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account holder");
            String holder = sc.nextLine();
            System.out.print("Enter account balance");
            Double balance = sc.nextDouble();
            System.out.print("Enter account withdraw limit");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter the amount for withdraw");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println(" New balance" + account);
        } catch (InputMismatchException e) {
            System.out.println("please type numbers , not letters");
        }


        sc.close();

    }
}