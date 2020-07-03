package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Troca_Variáveis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,
            b,
            c;

        System.out.println("Digite o valor da primeira variável: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor da segunda variável: ");
        b = entrada.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Valor da primeira variável: " + a);
        System.out.println("Valor da segunda variável: " + b);
    }
}
