package programacao;

import java.util.Scanner;

public class ex02 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int numero1, numero2, soma, subtrair, divisao, multiplicacao;

        System.out.print("Insira um número: ");

        numero1 = input.nextInt();


        System.out.print("Insira outro numero: ");


        numero2 = input.nextInt();

        soma = numero1 + numero2;
        subtrair = numero1 - numero2;
        divisao = numero1 / numero2;
        multiplicacao = numero1 * numero2;
        System.out.println("soma: " + soma);
        System.out.println("Subtração: " + subtrair);
        System.out.println("divisão: " + divisao);
        System.out.println("multiplicação: " + multiplicacao);
    }
}
