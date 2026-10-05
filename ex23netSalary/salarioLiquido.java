package ex23netSalary;

import java.util.Locale;
import java.util.Scanner;

public class salarioLiquido {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorHora, percentualINSS;
        int numeroAulas;


        System.out.print("Qual o valor da hora aula do professor? ");
        valorHora = sc.nextDouble();
        System.out.print("Qual o número de aulas lecionadas no mês? ");
        numeroAulas = sc.nextInt();
        System.out.print("Qual o percentual do INSS? ");
        percentualINSS = sc.nextDouble();

        double salarioBruto = valorHora * numeroAulas;
        double valorDesconto = salarioBruto * percentualINSS / 100;

        double salarioLiquido = salarioBruto - valorDesconto;


        System.out.println("O cálculo do salário líquido do professor é de: " + salarioLiquido);



















        sc.close();
    }
}
