package ex06reajusteValor;

import java.util.Locale;
import java.util.Scanner;

public class reajuste {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double valor, valorReajustado;


        System.out.print("Digite um valor para o reajuste de 5%: ");
        valor = sc.nextDouble();

        valorReajustado = valor * 1.05;

        System.out.printf("O valor do reajuste ficou: %.2f%n", valorReajustado);














        sc.close();
    }

}
