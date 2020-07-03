package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numFat,
            valorFat = 1;

        System.out.println("Digite o fatorial desejado: ");
        numFat = entrada.nextInt();

        for (int i = numFat; i > 0; i--) {
            valorFat *= i;
        }

        System.out.println("O valor do fatorial de "+ numFat + " é "+ valorFat);
    }
}
