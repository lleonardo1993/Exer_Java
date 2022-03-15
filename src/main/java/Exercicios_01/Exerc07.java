package Exercicios_01;

public class Exerc07 {

    public static void main(String[] args) {


        for(int i = 0, j=10; i < j ; i++, j--){
            System.out.println("Valor de i: " + i + " ;valor de  J: " +j);
        }

        int count =0;
        for ( ; count <5 ; ){
            System.out.println("valor de count: " + count);
            count +=2;
        }

        for (int cont=0; cont <10; cont +=2){
            System.out.println("valor de count: " + cont);
        }

        int soma =0;
        for (int i=1; i < 5; soma += i++);
        {
            System.out.println("O Valor da soma é :" +soma);
        }



    }
}
