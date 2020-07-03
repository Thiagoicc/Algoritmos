package Algoritmos_Pesquisa;

import java.util.Scanner;

public class Pesquisa_Binária {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] = {10, 12, 20, 23, 27, 30, 31, 39, 42, 44, 45, 49, 57, 63, 70},
            inicio = 0,
            fim = a.length - 1,
            num,
            meio = 0;

        System.out.println("Digite o número que deseja procurar: ");
        num = entrada.nextInt();

        while (inicio <= fim) {
            meio = (int) Math.floor((inicio + fim)/2);

            if (num == a[meio]) {
                break;
            }

            if (num > a[meio]) {
                inicio = meio + 1;
            }

            if (num < a[meio]) {
                fim = meio - 1;
            }
        }

        if (num == a[meio]) {
            System.out.println("O número " + num + " está na posição " + meio);
            }
        else    {
            System.out.println("O número " + num + " não está no vetor.");
        }
    }
}
