package programacao.ficha2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {


        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double salarioAnual, imposto;

        // Ler salario
        System.out.print("Insira o salário anual: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            imposto = salarioAnual * 0.2;
            System.out.println("Taxa de 20%: " + imposto + " €");
        } else {
            imposto = salarioAnual * 0.3;
            System.out.println("Taxa de 30%: " + imposto + " €");
        }
    }
}