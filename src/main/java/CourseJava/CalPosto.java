package CourseJava;

import java.util.Scanner;

public class CalPosto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo = 0;

        while (tipo != 4 ) {
            System.out.println("Escolha 1 para alcool,  2 para gasolina  3 para Diesel e 4 para finalizar : ");
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3 ) {
                diesel = diesel + 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("Muito Obrigado ");
        System.out.println("alcool " + alcool);
        System.out.println("gasolina " + gasolina);
        System.out.println("Diesel " + diesel);
            sc.close();




    }
}
