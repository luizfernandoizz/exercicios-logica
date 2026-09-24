package ex14ValoresTrocados;

import java.util.Locale;
import java.util.Scanner;

public class ValoresTrocados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, troca;

        System.out.println("Digite os valores de A e B: ");
        A = sc.nextInt();
        B = sc.nextInt();

        troca = A;
        A = B;
        B = troca;

        System.out.println("O novo valor de A = " + A);
        System.out.println("O novo valor de B = " + B);











        sc.close();
    }
}
