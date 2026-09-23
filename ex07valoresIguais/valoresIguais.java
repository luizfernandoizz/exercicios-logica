package ex07valoresIguais;

import java.util.Locale;
import java.util.Scanner;

public class valoresIguais {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite se o valor é true ou false: ");
        boolean a = sc.nextBoolean();

        System.out.print("Digite se o valor é true ou false: ");
        boolean b = sc.nextBoolean();

        if (a == b){
            System.out.println("O valores são iguais !!");
        }
        else{
            System.out.println("Os valores são diferentes!! ");
        }









        sc.close();
    }
}
