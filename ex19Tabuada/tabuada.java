package ex19Tabuada;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        for (int num = 1; num <= 10; num++) {
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
            System.out.println(); // para separar uma tabuada da outra.
        }












        sc.close();
    }
}
