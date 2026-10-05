package ex21valorAleatorio;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Random rand = new Random();
        int numero = rand.nextInt(101);

        System.out.println(numero);














        sc.close();

    }
}
