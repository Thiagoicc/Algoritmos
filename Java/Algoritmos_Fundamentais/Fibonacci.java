package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int seq,
            termo1 = 0,
            termo2 = 1,
            termo3;

        System.out.println("Digite a sequência desejada: ");
        seq = entrada.nextInt();

        for (int i = 3; i <= seq; i++) {
            termo3 = termo1 + termo2;
            System.out.println(termo3);
            termo1 = termo2;
            termo2 = termo3;
        }

    }
}
