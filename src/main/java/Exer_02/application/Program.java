package Exer_02.application;

import Exer_02.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.heigth = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        sc.close();
    }
}
