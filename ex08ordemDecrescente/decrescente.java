package ex08ordemDecrescente;

import java.util.Locale;
import java.util.Scanner;

public class decrescente {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Digite três valores diferentes: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 > valor1 && valor2 > valor3) {

            if (valor1 > valor3) {
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {

            if (valor1 > valor2) {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
        }










        sc.close();
    }

}
