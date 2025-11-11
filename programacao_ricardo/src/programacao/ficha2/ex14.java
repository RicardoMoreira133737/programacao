package programacao.ficha2;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("escreva o primeiro numero");
        a = input.nextInt();
        System.out.println("escreva o segundo numero");
        b = input.nextInt();
        System.out.println("escreva o terceiro numero");
        c = input.nextInt();


        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(a + ", " + b + ", " + c); // a, b, c
            } else {
                System.out.println(a + ", " + c + ", " + b); // a, c, b
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println(b + ", " + a + ", " + c); // b, a, c
            } else {
                System.out.println(b + ", " + c + ", " + a); // b, c, a
            }
        } else {
            if (a <= b) {
                System.out.println(c + ", " + a + ", " + b); // c, a, b
            } else {
                System.out.println(c + ", " + b + ", " + a); // c, b, a
            }
        }
    }
}