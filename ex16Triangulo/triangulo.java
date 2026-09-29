package ex16Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int a, b, c, soma;

        System.out.println("Digite os três lados de um triangulo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c){
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }














        sc.close();
    }
}
