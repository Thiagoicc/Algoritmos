package Algoritmos_Pesquisa;

import java.util.Scanner;

public class Pesquisa_Sequêncial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = {10, 12, 20, 23, 27, 30, 31, 39, 42, 44, 45, 49, 57, 63, 70},
                num,
                i;
        boolean achou = false;

        System.out.println("Digite o número a ser pesquisado:");
        num = entrada.nextInt();
        for (i = 0; i < a.length; i++) {
            if (num == a[i]) {
                achou = true;
                break;
            }
        }
        if (achou) {
            System.out.println("O número " + num + " está na posição " + i);
        }
        else {
            System.out.println("O número " + num + " não está no vetor.");
        }
    }
}