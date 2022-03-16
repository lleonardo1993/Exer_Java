package Exer_12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "marco"); // Adicionando elementos na lista

        System.out.println("Tamanho : " + list.size()); // Ver o tamanho da lista
        System.out.println();

        //list.remove("Anna"); // Removendo valor da lista identificado pelo valor String
        //list.remove(1); //Removendo valor da lista pela posição
        //list.removeIf(x -> x.charAt(0) == 'M'); // Removendo valor da lista pelo predicado
        // Obs: list.removeIf, Remove todos elementos cujo o nome tem o 'M' maiusculo.

        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Achando a posição do elemento com indexOf
        System.out.println("Elemento Ausente: " + list.indexOf("Luiz")); // Quando não achado o elemento retorna um valor negativo


        for (String x : list) {
            System.out.println(x);

        }

        System.out.println("-------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // Filtrando todos os nomes que começam com a letra 'A'
        for (String x : result) {
            System.out.println(x);

        }
        System.out.println("-------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        // Retorna o elemento com base no predicado, com a letra 'A' se não encontrar retorna null;
        System.out.println(name);

    }
}