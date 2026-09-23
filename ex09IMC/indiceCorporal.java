package ex09IMC;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class indiceCorporal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso, altura, IMC;

        System.out.print("informe a sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Informe o seu peso atual: ");
        peso = sc.nextDouble();


        IMC = peso / Math.pow(altura, 2.0);

        if (IMC <= 18.5){
            System.out.println("Abaixo do peso! sua Índice de Massa Corporal é de :"  + String.format("%.1f", IMC));
        }
        else if (IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Peso ideal(parabéns) - sua Índice de Massa Corporal é de : " + String.format("%.1f", IMC));
        }
        else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Levemente acima do peso -  sua Índice de Massa Corporal é de : " + String.format("%.1f", IMC));
        }
        else if (IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Obesidade Grau | - sua Índice de Massa Corporal é de : " + String.format("%.1f", IMC));
        }
        else if (IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obesidade Grau || - sua Índice de Massa Corporal é de : " + String.format("%.1f", IMC));
        }
        else {
            System.out.println("Obesidade grau ||| (mórbida!!!)");
        }













        sc.close();
    }
}
