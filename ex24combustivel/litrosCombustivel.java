package ex24combustivel;

import java.util.Locale;
import java.util.Scanner;

public class litrosCombustivel {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double distancia, quantidadeLitros, velocidade, tempoViagem;


        System.out.print("Qual a sua velocidade média? ");
        velocidade = sc.nextDouble();
        System.out.print("Quanto tempo levou para realizar a viagem? ");
        tempoViagem = sc.nextDouble();



        distancia = tempoViagem * velocidade;
        quantidadeLitros = distancia / 12;

        System.out.println("A quantidade de combustível gastos nessa viagem é de: " + quantidadeLitros + " Litros ");
        System.out.println("Quanto tempo será gasto na viagem: " + tempoViagem + " horas");
        System.out.println("A distancia percorrida da viagem: " + distancia + " km/h ");
        System.out.println("A velocidade média da viagem: " + velocidade + " km/h ");

































        sc.close();
    }
}
