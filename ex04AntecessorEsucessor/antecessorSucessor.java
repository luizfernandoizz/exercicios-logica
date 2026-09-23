package ex04AntecessorEsucessor;

import java.util.Locale;
import java.util.Scanner;

public class antecessorSucessor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int numero, antecessor, sucessor;
        
        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();


        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);











        sc.close();
    }
}
