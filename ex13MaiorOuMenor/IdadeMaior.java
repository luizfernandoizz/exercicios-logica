package ex13MaiorOuMenor;

import java.util.Locale;
import java.util.Scanner;

public class IdadeMaior {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade. Pode tirar sua habilitação");
        }
        else {
            System.out.println("Você é menor de idade. Ainda não pode tirar sua habilitação");
        }

















        sc.close();
    }
}
