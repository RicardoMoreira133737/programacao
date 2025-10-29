package programacao;

import java.util.Scanner;

public class ex08 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int smus1,mmus1,smus2,mmus2,smus3,mmus3,smus4,mmus4,smus5,mmus5, mintotais, segtotais, horastotais;

        System.out.print("Introduza os segundos da música 1:");
        smus1 = input.nextInt();
        System.out.print("Introduza os minutos da música 1:");
        mmus1 = input.nextInt();

        System.out.print("Introduza os segundos da música 2:");
        smus2 = input.nextInt();
        System.out.print("Introduza os minutos da música 2:");
        mmus2 = input.nextInt();

        System.out.print("Introduza os segundos da música 3:");
        smus3 = input.nextInt();
        System.out.print("Introduza os minutos da música 3:");
        mmus3 = input.nextInt();

        System.out.print("Introduza os segundos da música 4:");
        smus4 = input.nextInt();
        System.out.print("Introduza os minutos da música 4:");
        mmus4 = input.nextInt();

        System.out.print("Introduza os segundos da música 5:");
        smus5 = input.nextInt();
        System.out.print("Introduza os minutos da música 5:");
        mmus5 = input.nextInt();

        segtotais= ((mmus1+ mmus2+ mmus3+ mmus4+ mmus5)*60)+smus1+smus2+smus3+smus4+smus5;

        horastotais= segtotais/3600;
        System.out.println("horastotais: " + horastotais);

        segtotais=segtotais%3600;

        mintotais= segtotais/60;
        System.out.println("mintotais: " + mintotais);

        segtotais=segtotais%60;

        System.out.println("segtotais: " + segtotais);



    }
}
