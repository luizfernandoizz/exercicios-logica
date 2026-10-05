package ex22restoDaDivisao;

import java.util.Locale;
import java.util.Scanner;

public class restoDivisao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int A, B;

        System.out.print("Digite o primeiro valor inteiro: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        B = sc.nextInt();

        int result = A / B;
        int resto = A % B;

        System.out.println("O quociente de " + A + " dividido por " + B + " é = " + result);
        System.out.println("O resto  de " + A + " dividido por " + B + " é = " + resto);















        sc.close();
    }
}
