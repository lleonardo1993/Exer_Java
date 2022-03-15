package ExerF_08;

import ExerF_08.application.Acconut;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Acconut acconut;


        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.printf("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if ( response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acconut = new Acconut(number, holder, initialDeposit);
        }
        else {
            acconut = new Acconut(number, holder);
        }

        System.out.println();
        System.out.printf("Account data: ");
        System.out.println(acconut);

        System.out.println();
        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        acconut.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(acconut);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acconut.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(acconut);


        sc.close();
    }
}
