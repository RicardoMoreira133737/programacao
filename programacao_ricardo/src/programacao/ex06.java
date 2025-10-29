package programacao;

import java.util.Scanner;

public class ex06 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int valor1, valor2;

        System.out.print("Insira um valor: ");

        valor1 = input.nextInt();


        System.out.print("Insira outro valor: ");


        valor2 = input.nextInt();
        System.out.println("valor 1: " + valor1 + " valor 2: " + valor2 + " após a permutação fica: ");

        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        System.out.println("valor 1: " + valor1);
        System.out.println("valor 2: " + valor2);
    }
}
