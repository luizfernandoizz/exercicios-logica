package ex20TabuadaDigitada;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;


        System.out.print("Digite um número inteiro para ver a tabuada: ");
        num = sc.nextInt();


        System.out.println("Tabuada do numero " + num);

        for (int i = 1; i < 11; i++){
            int result = num * i;
            System.out.println(num + " X " + i + " = "  + result);

        }




















    sc.close();
    }
}
