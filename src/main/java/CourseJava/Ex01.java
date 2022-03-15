package CourseJava;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Entre com um numero: ");
        A = sc.nextInt();

        System.out.println("Entre com outro numero: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("A SOMA é :" + soma);

        sc.close();

    }
}
