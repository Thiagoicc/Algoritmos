package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Somatório {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantNum,
            valorNum,
            somador = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNum = entrada.nextInt();

        for(int i = 1; i <= quantNum; i++)  {
            System.out.println("Digite o valor do " + i + "º número: ");
            valorNum = entrada.nextInt();

            somador += valorNum;
        }

        System.out.println("A soma total foi de: " + somador);
    }
}
