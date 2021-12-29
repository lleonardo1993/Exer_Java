package Exercicios_01;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.println("Entre com o nome:");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome Precisa de no minimo 3 caracteres:");

            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade Precisa ser entre 0 e 150:");

            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o salario:");
            salario = scan.nextInt();

            if (salario > 0) {
                infoValida = true;

            } else {
                System.out.println("Entre com um salario maior que 0:");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o sexo:");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;

            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'. :");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o estado Civil:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;

            } else {
                System.out.println("Estado Civil precisa ser 's', 'c', 'v', 'd'.:");
            }

        } while (!infoValida);
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salario: " +salario);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estado Civil: " +estadoCivil);
    }
}
