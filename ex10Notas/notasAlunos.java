package ex10Notas;

import java.util.Locale;
import java.util.Scanner;

public class notasAlunos {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite as três notas obtidas:");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média obtida pelo aluno é de: " + media);







        sc.close();
    }
}
