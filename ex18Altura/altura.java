package ex18Altura;

import java.util.Locale;
import java.util.Scanner;

public class altura {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;


        while (alturaFrancisco > alturaSara){
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para sara alcançar ou ultrapasse Francisco " );
        System.out.println("Altura final de Francisco: " + String.format("%.2f", alturaFrancisco));
        System.out.println("Altura final da Sara: " + String.format("%.2f", alturaSara));








        sc.close();
    }
}
