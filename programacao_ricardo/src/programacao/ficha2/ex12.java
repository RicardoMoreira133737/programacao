package programacao.ficha2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int opcao;
opcao = input.nextInt();

 switch(opcao) {
     case 1:
         System.out.println("criar");
         break;
     case 2:
         System.out.println("Atualizar");
         break;
     case 3:
         System.out.println("eliminar");
         break;
     case 4:
         System.out.println("sair4");
         break;
     default:
         System.out.println("escolheu um numero inválido");
         break;




 }
    }
}
