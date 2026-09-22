import java.util.Locale;
import java.util.Scanner;

public class SomaDosValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a, b, c;
        int soma = 0;

        System.out.println("Digite os valores de a, b e c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        soma = a + b;

        System.out.println("A SOMA ENTRE A E B É = " + soma);

        if (soma < c) {
            System.out.println("A SOMA É MENOR QUE C");
        }
        else{
            System.out.println("A SOMA ENTRE A E B É MAIOR QUE C");
        }
    }
}