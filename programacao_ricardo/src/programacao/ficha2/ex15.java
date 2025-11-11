package programacao.ficha2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, notas;


        System.out.println("insira o valor");
        valor = input.nextInt();
        if (valor % 5 == 0) {
            notas = valor / 200;
            System.out.println("notas de 200€" + notas);
            valor = valor % 200;

            notas = valor / 100;
            System.out.println("notas de 100€" + notas);
            valor = valor % 100;

            notas = valor / 50;
            System.out.println("notas de 50€" + notas);
            valor = valor % 50;

            notas = valor / 10;
            System.out.println("notas de 10€" + notas);
            valor = valor % 10;

            notas = valor / 5;
            System.out.println("notas de 5€" + notas);
            valor = valor % 5;
        } else {
            System.out.println("Valor invalido nao temos trocos");
        }
    }
}