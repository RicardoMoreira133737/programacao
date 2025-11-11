package programacao.FICHA3;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Insira 1º numero: ");

        num1 = input.nextInt();


        System.out.print("Insira 2º numero: ");

        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("maior: " + num1);

        } else {
            System.out.println("maior: " + num2);
        }
    }
}
