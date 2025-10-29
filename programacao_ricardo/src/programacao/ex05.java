package programacao;

import java.util.Scanner;

public class ex05 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double nota1, nota2, nota3, mediaArit, mediaPond;

        System.out.print("Insira um número: ");

        nota1 = input.nextDouble();


        System.out.print("Insira outro numero: ");

        nota2 = input.nextDouble();

        System.out.print("Insira outro numero: ");

        nota3 = input.nextDouble();

        mediaArit = (nota1 + nota2 + nota3)/3;

        System.out.println("Média Aritmética: "+mediaArit);


        mediaPond=nota1*0.2+nota2*0.3+nota3*0.5;


        System.out.println("media ponderada: " + mediaPond);

    }
}
