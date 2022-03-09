package CourseJava;

import java.util.Scanner;

public class _Func {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int heigher = max(a, b, c);

        showResult(heigher);

        sc.close();

    }

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Heigher: " + value);
    }
}

    /*
    if ( a > b && a > c ) {
              System.out.println("Higher A = " + a);
              }
              else if ( b > c ) {
              System.out.println("Higher B = " + b);
              }
              else {
              System.out.println("Higher C = " + c);
              }

     */