package CourseJava;

import java.util.Scanner;

public class CalcMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double x, y, media;

        System.out.println("Entre com um numero: ");
        x = sc.nextDouble();

        System.out.println("Entre com o segundo numero");

        y = sc.nextDouble();

        media = (x + y) / 2;
        System.out.println("A media das somas é: " + media);
        sc.close();
    }
}
