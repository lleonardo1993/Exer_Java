package ExerF_06.application;

import ExerF_06.application.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar ? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bougth? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to paid in reais %.2f%n", result);

        sc.close();
    }
}
