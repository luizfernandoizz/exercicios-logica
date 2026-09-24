package ex11NotasAprovacao;

import java.util.Locale;
import java.util.Scanner;

public class aprovadoReprovado {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double nota1, nota2, nota3, nota4, mediaFinal;
        String nome;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite suas quatros notas obtidas para avaliação: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if (mediaFinal >= 7.0){
            System.out.println("Aluno: " + nome + " APROVADO! PARABÉNS!" + " Media Final de: " + mediaFinal);
        }
        else {
            System.out.println("ALUNO: " + nome + " REPROVADO!" + " Media Final de: " + mediaFinal);
        }













        sc.close();
    }
}
