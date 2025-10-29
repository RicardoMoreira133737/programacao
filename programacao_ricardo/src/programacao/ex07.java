package programacao;

import java.util.Scanner;

public class ex07 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double produto1, produto2, produto3, desconto,total, totaldesconto  ;

        System.out.print("Insira o valor do primeiro produto: ");

        produto1 = input.nextDouble();


        System.out.print("Insira O valor do segundo produto: ");
        produto2 = input.nextDouble();

        System.out.print("Insira O valor do terceiro produto: ");
        produto3 = input.nextDouble();

        total = produto1 + produto2+produto3;
        desconto = total*0.1;
        totaldesconto = total-desconto;

        System.out.println("total: " + total);
        System.out.println("total com desconto: " + totaldesconto);

    }
}
