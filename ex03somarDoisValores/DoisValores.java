package ex03somarDoisValores;

import java.util.Locale;
import java.util.Scanner;

public class DoisValores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int A, B, C;

        System.out.println("Digite os dois valores de A E B: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A == B){
            C = A + B;
        }
        else {
            C = A * B;
        }

        System.out.println("O resultado é: " + C);













        sc.close();
    }
}

