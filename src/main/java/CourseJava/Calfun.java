package CourseJava;

import java.util.Scanner;

public class Calfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double id, horas, vl_horas, salario;

        System.out.println("Insira o seu codigo de funcionario :");
        id = sc.nextInt();
        System.out.println("Insira o numero de horas trabalhadas :");
        horas = sc.nextInt();
        System.out.println("Insira o valor que recebe por horas :");
        vl_horas = sc.nextInt();

        salario = vl_horas * horas;
        System.out.printf("O seu salario é salario = U$ %.2f%n", salario);







        sc.close();
    }


}
