package CourseJava;

import java.util.Locale;
import java.util.Scanner;

public class Calcpeca {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;


        System.out.println("Codigo da peça:");
        cod1 = sc.nextInt();
        System.out.println("Quantidade de peças");
        qte1 = sc.nextInt();
        System.out.println("Valor da peça");
        preco1 = sc.nextDouble();


        System.out.println("Codigo da peça :");
        cod2 = sc.nextInt();
        System.out.println("Quantidade de peças");
        qte2 = sc.nextInt();
        System.out.println("Valor da peça");
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.println("Codigo da peça nº um : " + cod1);
        System.out.println("Quantidade de peças pedido nº um : " + qte1);
        System.out.println("Preço do pedido nº um : " + preco1);


        System.out.println("Codigo da peça nº dois : " + cod2);
        System.out.println("Preço do pedido nº dois : " + preco2);
        System.out.println("Quantidade de peças pedido nº dois : " + qte2);

        System.out.printf("VALOR A TOTAL A PAGAR: R$ %.2f%n", total);

        sc.close();


    }
}
