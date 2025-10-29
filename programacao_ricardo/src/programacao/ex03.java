package programacao;

import java.util.Scanner;

public class ex03 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int numero1, numero2, perimetro, area;

        System.out.print("Insira um número: ");

        numero1 = input.nextInt();


        System.out.print("Insira outro numero: ");

        numero2 = input.nextInt();

        area = numero1 * numero2;
        perimetro = numero1 + numero2 + numero1 + numero2;

        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);

    }
}
