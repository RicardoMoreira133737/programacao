package programacao.ficha2;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas, minutos;

        System.out.print("Introduza horas: ");
        horas = input.nextInt();

        System.out.print("Introduza minutos: ");
        minutos = input.nextInt();


        if(horas<=12) {
            System.out.println(horas + ":" + minutos + "AM");
        }else{
            horas=horas-12;
            System.out.println(horas + ":" + minutos + "PM");
        }

        input.close();
    }
}
