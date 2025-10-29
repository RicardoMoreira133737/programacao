package programacao;

import java.util.Scanner;

public class ex04 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double pi=  3.14159, area, raio;
        System.out.print("Insira o raio da circunferência: ");

        raio = input.nextInt();


        area = pi * (raio * raio);

        System.out.println("area: " + area);

    }
}
