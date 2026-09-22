package ex02ImparOuPar;

import java.util.Locale;
import java.util.Scanner;

public class ImparOupar {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um numero para verficar se é PAR ou Ímpar: ");
        int number = sc.nextInt();



        if (number % 2 == 0){
            System.out.println("O numero " + number + " é par!");
        }
        else {
            System.out.println("O numero " + number + " é ímpar!");
        }

        if(number > 0){
            System.out.println("O numero " + number + " é positivo!");
        }
        else {
            System.out.println("O numero " + number + " é negativo!");
        }

    }
    }
