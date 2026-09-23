package ex05salarioMinimo;

import java.util.Locale;
import java.util.Scanner;

public class salarioMinimo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double salarioMinimo = 1293.20;
        double salarioUsuario;
        double quantidadeSalario;


        System.out.print("Digite o seu salario: ");
        salarioUsuario = sc.nextDouble();

        quantidadeSalario = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha %.2f salarios minimos.", quantidadeSalario);














        sc.close();
    }
}
