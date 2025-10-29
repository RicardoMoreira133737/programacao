package programacao;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int numero1, numero2, soma;

        System.out.print("Insira um número: ");

        numero1 = input.nextInt();


        System.out.print("Insira outro numero: ");

        numero2 = input.nextInt();
        soma = numero1 + numero2;
        System.out.println("soma: " + soma);


    }

}
