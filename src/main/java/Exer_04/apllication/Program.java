package Exer_04.apllication;

import Exer_04.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Nome do Aluno: ");
        aluno.name = sc.nextLine();
        System.out.println("Entre com a Primeira Nota: ");
        aluno.grade1 = sc.nextDouble();
        System.out.println("Entre com a Segunda Nota: ");
        aluno.grade2 = sc.nextDouble();
        System.out.println("Entre com a Terceira Nota: ");
        aluno.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());

        if (aluno.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n", aluno.missingPoint());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();

    }
}
