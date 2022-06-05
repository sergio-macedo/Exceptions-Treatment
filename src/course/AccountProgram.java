package course;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

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

            System.out.println(account);
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }


        sc.close();

    }
}